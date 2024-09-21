package com.coforge.main;

import com.coforge.model.Address;
import com.coforge.model.User;
import com.coforge.util.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserMain {
    public static void main(String[] args) {

        SessionFactory sessionFactory= HibernateSessionFactory.getSessionFactory();

        Session session=sessionFactory.openSession();
        Transaction transaction=session.getTransaction();

        User user=new User();
        user.setName("ram kumar");

        Address address=new Address();
        address.setLocation("noida");
        address.setState("UP");

        user.setAddress(address);

        transaction.begin();
        session.save(address);
        session.save(user);
        transaction.commit();

        System.out.println("user and address added ");

    }
}
