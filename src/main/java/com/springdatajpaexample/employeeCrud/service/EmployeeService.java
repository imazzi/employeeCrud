package com.springdatajpaexample.employeeCrud.service;

import com.springdatajpaexample.employeeCrud.model.Employee;
import com.springdatajpaexample.employeeCrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getEmployeeById(int id){
        return employeeRepository.findById(id).get();
    }

    public List<Employee> getAllEmloyees(){
        return (List<Employee>) employeeRepository.findAll();
    }

    public void deleteEmployeeById(int id){
        employeeRepository.deleteById(id);
    }

    public Employee addEmployee(Employee emp){
        return employeeRepository.save(emp);
    }

    public List<Employee> getEmployeeByDepartment(String department){
        return employeeRepository.findByDepartment(department);
    }

    public Long count(){
        return employeeRepository.count();
    }
    public boolean exists(int id){
        return employeeRepository.existsById(id);
    }
}
