package com.bonum.ursus.employeeapi.dao;

import com.bonum.ursus.employeeapi.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeByID(int id);
    public void saveEmployee(Employee employee);
    public void deleteEmployeeByID(int id);
}
