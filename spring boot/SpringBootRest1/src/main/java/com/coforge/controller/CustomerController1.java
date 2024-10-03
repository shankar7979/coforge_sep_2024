package com.coforge.controller;

import com.coforge.dao.CustomerRepository;
import com.coforge.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class CustomerController1 {

    @Autowired
    private CustomerRepository repository;

    @GetMapping("/customer1")
    public ResponseEntity<List<?>> getCustomerList() {
        if (!repository.findAll().isEmpty()) {
            return   new ResponseEntity("list is empty",HttpStatus.NOT_FOUND);
       }
         return  ResponseEntity.status(HttpStatus.FOUND).body(repository.findAll());
    }

    @PostMapping("/customer1")
    public ResponseEntity<?> addCustomer(@RequestBody Customer customer) {

        if (repository.findById(customer.getCustomerId()).isEmpty())
            return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(customer));
        else
            return ResponseEntity.status(HttpStatus.FOUND).body("id is already present");
    }

    @GetMapping("/customer1/{id}")
    public ResponseEntity<?>  findCustomer(@PathVariable("id") int id ) {
        if (repository.findById(id).isEmpty())
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("customer not found ");
        else
        return  ResponseEntity.status(HttpStatus.FOUND).body(repository.findById(id));
    }

    @DeleteMapping("/customer1/{id}")
    public ResponseEntity<?>  deleteCustomer(@PathVariable("id") int id ) {
        if (repository.findById(id).isEmpty())
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("customer not found ");
        else {
            Customer customer = repository.findById(id).get();
            repository.delete(customer);
            return ResponseEntity.status(HttpStatus.FOUND).body(customer);
        }
    }

    @PutMapping("/customer1")
    public ResponseEntity<?> updateCustomer(@RequestBody Customer customer) {
        if (repository.findById(customer.getCustomerId()).isEmpty())
            return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(customer));
        else
            return ResponseEntity.status(HttpStatus.FOUND).body("id is already present");
    }

}
