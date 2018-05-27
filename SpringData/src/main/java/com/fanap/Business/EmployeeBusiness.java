package com.fanap.Business;

import com.fanap.Result;
import com.fanap.model.Employee;


public interface EmployeeBusiness {

    void saveEmployee(Employee employee);
    Result findByEmployeeName(String name);
}
