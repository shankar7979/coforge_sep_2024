package com.coforge.controller;

import com.coforge.dao.CustomerRepository;
import com.coforge.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class CustomerController1 {

    @Autowired
    private CustomerRepository repository;

    //http://localhost:9090/customer
    @GetMapping("/customer1")
    public ResponseEntity<List<Customer>> getCustomerList() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return repository.save(customer);
    }
//http://localhost:9090/customer/2
    @DeleteMapping("/customer1/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable("id") int  customerId) {
        Optional<Customer> byId = repository.findById(customerId);
        if(byId.isPresent()) {
            Customer customer = byId.get();
            repository.delete(byId.get());
            return ResponseEntity.status(HttpStatus.OK).body(customer);
        }
        else
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("id not present");
    }
//http://localhost:9090/customer/2
    @GetMapping("/customer1/{id}")
    public ResponseEntity<Customer> getCustomerSearchById(@PathVariable("id") int  id) {
        return repository.findById(id).get();
    }
//http://localhost:9090/customer/?id=2
    @GetMapping("/customer1/")
    public ResponseEntity<?> getCustomerSearchById1(@RequestParam("id") int id) {
        Optional<Customer> byId = repository.findById(id);
        if(byId.isPresent())
         return     ResponseEntity.status(HttpStatus.OK).body(byId.get());
        else
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("id not present");;
    }

    @PutMapping("/customer1")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
        return repository.save(customer);
    }
}
