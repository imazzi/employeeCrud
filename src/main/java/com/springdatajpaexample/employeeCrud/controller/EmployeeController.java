package com.springdatajpaexample.employeeCrud.controller;

import com.springdatajpaexample.employeeCrud.model.Employee;
import com.springdatajpaexample.employeeCrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService empService;

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return empService.getEmployeeById(id);
    }

    @GetMapping
    public List<Employee> getAllEmployee(){
        return empService.getAllEmloyees();
    }

    @GetMapping("/department/{department}")
    public List<Employee> getEmployeeByDepartment(@PathVariable String department ){
        return empService.getEmployeeByDepartment(department);
    }
    @DeleteMapping("/{id}")
    public void deleteEmployeeById(@PathVariable int id){
        empService.deleteEmployeeById(id);
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee emp){
        return empService.addEmployee(emp);
    }
}
