package com.coforge.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="emp")
public class Employee {
    @Id
    @GeneratedValue

    @Column(name = "emp_id", length = 10)
    private int id;

    @Column(nullable = false,name = "emp_name", length = 20)
    private String name;

    @Column(nullable = false,name = "emp_salary", length = 10, precision = 2)
    private float salary;

    private LocalDate dob;

    public LocalDate getDob() {

        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dob=" + dob +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }



}
