package com.fanap.dao;

import com.fanap.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepositoryDao extends CrudRepository<Employee, Long> {

    List<Employee> findByEmployeeName(String employeeName);
}
