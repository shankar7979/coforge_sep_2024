package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Customer;
import com.example.model.Order;
import com.example.repository.CustomerRepository;
import com.example.repository.OrderRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    
    @Autowired
 private OrderRepository orderRepository;    
 
    public Customer registerCustomer(Customer customer) {
    	
//    	for(Order o:orderRepository.findAll())
//    	{
//    		orderRepository.save(o);
//    	}
    	
    	System.out.println("\ncustomer data "+customer+"   ....\n");
    	System.out.println(orderRepository.findAll());
    	customer.setOrders(orderRepository.findAll());
    	
        return customerRepository.save(customer);
        
    }
 
    public Optional<Customer> getCustomerByEmail(String email) {
        return customerRepository.findByEmail(email);
    }
 
    public Optional<Customer> getCustomerWithOrders(int customerID) {
        return customerRepository.findByIdWithOrders(customerID);
    }
 
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
 
    public void deleteCustomer(int customerID) {
        customerRepository.deleteById(customerID);
    }
}
