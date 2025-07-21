package com.coforge.model;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class EmployeeMain {
    Session session;
    @BeforeEach
    public void init(){

        Configuration configuration=new Configuration();
        configuration.configure();
        SessionFactory sessionFactory= configuration.buildSessionFactory();

        session= sessionFactory.openSession();
        Transaction transaction = session.getTransaction();

        Employee employee=new Employee();

 //       employee.setId(10001);
        employee.setName("amit kumar");
        employee.setSalary(12000);
        employee.setDob(LocalDate.of(2000,11,27));

        transaction.begin();
        session.save(employee);
        transaction.commit();
        System.out.println("Record added ");
    }

    @Test
    public void test1(){
        List<Employee> fromEmployee = session.createQuery("from Employee").list();
        Assertions.assertEquals(1,fromEmployee.size());
        System.out.println("using for loop");
        for (Employee e:fromEmployee)
            System.out.println(e);

        System.out.println("using foreach method");
        fromEmployee.forEach(a-> System.out.println(a));


        try {
            Thread.sleep(1000*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
