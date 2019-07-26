package com.tw.apistackbase.service;

import com.tw.apistackbase.dao.EmployeeDao;
import com.tw.apistackbase.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    public List<Employee> getAllEmployees() {
        return employeeDao.getAll();
    }

    public List<Employee> addEmployees(List<Employee> employees) {
        return employees.stream()
                .map(employee -> employeeDao.add(employee))
                .collect(Collectors.toList());
    }
}
