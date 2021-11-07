package com.springdatajpaexample.employeeCrud.repository;

import com.springdatajpaexample.employeeCrud.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    List<Employee> findByDepartment(String department);
}
