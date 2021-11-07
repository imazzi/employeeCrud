package com.springdatajpaexample.employeeCrud.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name="dep")
    private String department;
}
