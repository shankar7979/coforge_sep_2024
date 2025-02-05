package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.Customer;
import com.example.model.Order;
import com.example.repository.CustomerRepository;
import com.example.repository.OrderRepository;

@SpringBootApplication
@Transactional
public class OnlinefooddeliveryApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(OnlinefooddeliveryApplication.class, args);
    }

    @Autowired
    CustomerRepository repository;
    @Autowired
    OrderRepository repository1;

    @Override
    public void run(String... args) throws Exception {

        Customer customer = new Customer();
        customer.setAddress("address1");
        customer.setEmail("email");
        customer.setName("suresh");
        customer.setPhone("phone");

//        Order o1 = new Order(2, customer, 101, "status", 10000, null);
//        Order o2 = new Order(2, customer, 101, "status", 10000, null);
//        Order o3 = new Order(2, customer, 101, "status", 10000, null);
//        Order o4 = new Order(2, customer, 101, "status", 10000, null);

//        o1.setCustomer(customer);
//        o2.setCustomer(customer);
//        o3.setCustomer(customer);
//        o4.setCustomer(customer);

//	repository1.save(o1);
//	repository1.save(o2);A
//	repository1.save(o3);
//	repository1.save(o4);
//
        Order o1=new Order();
        Order o2=new Order();
        o1.setStatus("status");
        o1.setTotalAmount(10000);
        //o1.setMenuItems(null);
        o1.setCustomer(customer);

        o2.setStatus("status");
        o2.setTotalAmount(10000);
        //o2.setMenuItems(null);
        o2.setCustomer(customer);

        List<Order> orderlist = new ArrayList<>();
        orderlist.add(o1);
        orderlist.add(o2);

//        customer.setOrders(
//                Arrays.asList(new Order[]{
//                        o1, o2, o3, o4
//                }));
        repository.save(customer);
        repository.findAll().forEach(System.out::println);
//        List<Customer> all = repository.findAll();
//        for(Customer c:all){
//             for(Order o:c.getOrders())
//                 System.out.println(o+"Order");
//        }
    }
}
