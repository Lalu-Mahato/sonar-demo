package com.example.sonar_demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sonar_demo.dto.EmployeeReqDto;
import com.example.sonar_demo.entity.Employee;
import com.example.sonar_demo.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    public Employee create(@RequestBody EmployeeReqDto request) {
        return employeeService.create(request);
    }
}
