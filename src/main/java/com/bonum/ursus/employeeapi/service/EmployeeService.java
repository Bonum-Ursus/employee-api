package com.bonum.ursus.employeeapi.service;

import com.bonum.ursus.employeeapi.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeByID(int id);
    public void saveEmployeeByID(Employee employee);
    public void deleteEmployeeByID(int id);
}
