package com.fanap.Service;

import com.fanap.Business.EmployeeBusiness;
import com.fanap.Result;
import com.fanap.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Component
@Path("/employee")
public class EmployeeService {

    private final EmployeeBusiness employeeBusiness;

    @Autowired
    public EmployeeService(EmployeeBusiness employeeBusiness) {
        this.employeeBusiness = employeeBusiness;
    }

    @POST
    public Response createEmployee(Employee employee) {

        employee = new Employee(1,"Elmira");
        employeeBusiness.saveEmployee(employee);
        return Response.status(200).build();
    }

    @GET
    @Produces(value = "application/json")
    public Response getEmployeeList() {
        Result result = employeeBusiness.findByEmployeeName("Elmira");
        //payLoad
        return Response
                .status(result.getMessageCode())
                .entity(result.getLstResult())
                .build();
    }

}
