package com.coforge.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.coforge.model.Message;

public class MessageTest {

	public static void main(String[] args) {
		SessionFactory factory = null;

		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

		Message message = new Message("hello world");
		try (Session session = factory.openSession()) {
			Transaction tx = session.beginTransaction();
			session.persist(message);
			tx.commit();
		}

		// ============
		// Message savedMessage = saveMessage("Hello, World");
		List<Message> list;
		try (Session session = factory.openSession()) {
			list = session.createQuery("from Message", Message.class).list();
			list.forEach(a -> System.out.print(a));
		}

	}
}
