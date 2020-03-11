package com.bonum.ursus.employeeapi.service;

import com.bonum.ursus.employeeapi.dao.EmployeeDAO;
import com.bonum.ursus.employeeapi.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Transactional
    @Override
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Transactional
    @Override
    public Employee getEmployeeByID(int id) {
        return employeeDAO.getEmployeeByID(id);
    }

    @Transactional
    @Override
    public void saveEmployeeByID(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Transactional
    @Override
    public void deleteEmployeeByID(int id) {
        employeeDAO.deleteEmployeeByID(id);
    }
}
