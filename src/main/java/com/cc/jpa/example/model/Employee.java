package com.cc.jpa.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity()
public class Employee {

    public Employee(Integer id, String name, String designation) {
        Id = id;
        this.name = name;
        this.designation = designation;
    }

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public Employee() {
    }

    @javax.persistence.Id
    @GeneratedValue
    private Integer Id;
    private String name;
    private String designation;

    public Integer getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", Designation='" + designation + '\'' +
                '}';
    }


}
