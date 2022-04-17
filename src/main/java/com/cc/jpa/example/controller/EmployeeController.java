package com.cc.jpa.example.controller;

import com.cc.jpa.example.service.EmployeeService;
import com.cc.jpa.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/employees")
    public Employee findById() {
        return employeeService.listEmployees();
    }
}
