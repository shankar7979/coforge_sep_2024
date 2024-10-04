package com.coforge.service;

import com.coforge.error.CustomerException;
import com.coforge.model.Customer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDate;

@DataJpaTest
@ComponentScan(basePackages = {"com.coforge.service"})
class CustomerServiceTest {

    @Autowired
    private CustomerService service;

    @BeforeEach
    public void init() throws CustomerException {
        service.addCustomer(Customer.builder().customerDob(LocalDate.of(1998,11,23)).
                customerName("kamal partap").build());
        service.addCustomer(Customer.builder().customerDob(LocalDate.of(1991,10,22)).
                customerName("suman kumar").build());
        service.addCustomer(Customer.builder().customerDob(LocalDate.of(1993,9,12)).
                customerName("aarti devi").build());
        service.addCustomer(Customer.builder().customerDob(LocalDate.of(1990,8,21)).
                customerName("seema kahre").build());
    }

    @Test
    public void customerTest() throws CustomerException {

        Assertions.assertEquals(4, service.getAllCustomer().size());
        Assertions.assertEquals(service.searchCustomer(1).getCustomerName(),"kamal partap");

//        Exception exception=Assertions.assertThrows(CustomerException.class,()->{
//            service.deleteCustomer(2);
//        });
//
//     Assertions.assertEquals(exception.getMessage(),"id not found");

    }
}