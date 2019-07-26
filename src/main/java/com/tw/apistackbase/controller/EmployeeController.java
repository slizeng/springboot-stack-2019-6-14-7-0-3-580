package com.tw.apistackbase.controller;

import com.tw.apistackbase.entity.Employee;
import com.tw.apistackbase.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(produces = {"application/json"})
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @PostMapping(produces = {"application/json"})
    public ResponseEntity<List<Employee>> addEmployees(@RequestBody List<Employee> employeeList) {
        List<Employee> addedEmployees = employeeService.addEmployees(employeeList);

        return ResponseEntity.ok(addedEmployees);
    }
}
