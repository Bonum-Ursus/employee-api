package com.bonum.ursus.employeeapi.controller;

import com.bonum.ursus.employeeapi.entity.Employee;
import com.bonum.ursus.employeeapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    private EmployeeService employeeService;

    @Autowired
    public MyRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){

        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{employeeID}")
    public Employee getEmployee(@PathVariable int employeeID){
        Employee employee = employeeService.getEmployeeByID(employeeID);
        if(employee == null)
            throw new RuntimeException("Can not found employee with id=" + employeeID);
        return employee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setId(0);
        employeeService.saveEmployeeByID(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        employeeService.saveEmployeeByID(employee);
        return employee;
    }


    @DeleteMapping("/employees/{employeeID}")
    public Employee deleteEmployee(@PathVariable int employeeID) {
        Employee employee = employeeService.getEmployeeByID(employeeID);
        if(employee == null)
            throw new RuntimeException("Can not found employee with id=" + employeeID);
        employeeService.deleteEmployeeByID(employeeID);
        return employee;
    }
}
