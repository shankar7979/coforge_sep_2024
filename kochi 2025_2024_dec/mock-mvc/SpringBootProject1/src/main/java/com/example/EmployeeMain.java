package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableJpaRepositories
//@EnableTransactionManagement

public class EmployeeMain {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeMain.class,args);
    }
}
