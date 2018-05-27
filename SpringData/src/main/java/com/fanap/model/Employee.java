package com.fanap.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

    public Employee(long employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    @Id
    private long employeeId;

    private  String employeeName;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return employeeName;
    }
}
