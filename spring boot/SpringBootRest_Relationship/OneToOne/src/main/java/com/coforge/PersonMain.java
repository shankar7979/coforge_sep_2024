package com.coforge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonMain {

    public static void main(String[] args) {
        SpringApplication.run(PersonMain.class,args);
    }
}
/*
POST method
http://localhost:8080/person
 {
"name":"lalan kumar",
"phone":{
    "model":"samsung"
 }
}
 */