package com.abc;

import com.abc.dao.EmployeeRepository;
import com.abc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeMain  implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(EmployeeMain.class,args);
    }

    @Autowired
    EmployeeRepository repository;

    @Override
    public void run(String... args) throws Exception {

        Employee employee=Employee.builder().employeeName("subodh sharma").employeeSalary(150000).build();

        repository.save(employee);

        repository.findAll().forEach(System.out::println);
    }
}
