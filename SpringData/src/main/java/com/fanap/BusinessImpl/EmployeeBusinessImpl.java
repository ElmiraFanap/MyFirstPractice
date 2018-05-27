package com.fanap.BusinessImpl;

import com.fanap.Business.EmployeeBusiness;
import com.fanap.Result;
import com.fanap.dao.EmployeeRepositoryDao;
import com.fanap.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class EmployeeBusinessImpl implements EmployeeBusiness {

    private final EmployeeRepositoryDao employeeRepositoryDao;

    @Autowired
    public EmployeeBusinessImpl(EmployeeRepositoryDao employeeRepositoryDao) {
        this.employeeRepositoryDao = employeeRepositoryDao;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result saveEmployee(Employee employee) {

        employeeRepositoryDao.save(employee);
        return  new Result(200,"Employee created successfully",null);
    }

    @Override
    public Result findByEmployeeName(String name) {

        List<Employee> employeeList = employeeRepositoryDao.findByEmployeeName("Elmira");


        if (employeeList == null || employeeList.isEmpty()) {

            return new Result(204,"There is no employee with this name", null);
        }
        return new Result(200, "These are employees", employeeList);
    }
}
