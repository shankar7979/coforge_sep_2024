package com.coforge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.coforge.model.Message;

public class PersistenceTest {
  private SessionFactory factory = null;

  @BeforeEach
  public void setup() {
    StandardServiceRegistry registry =
        new StandardServiceRegistryBuilder()
            .configure()
            .build();
    factory = new MetadataSources(registry)
        .buildMetadata()
        .buildSessionFactory();
  }

  public Message saveMessage(String text) {
    Message message = new Message(text);
    try (Session session = factory.openSession()) {
      Transaction tx = session.beginTransaction();
      session.persist(message);
      tx.commit();
    }
    return message;
  }

  @Test
  public void readMessage() {
    Message savedMessage = saveMessage("Hello, World");
    List<Message> list;
    try (Session session = factory.openSession()) {
      list = session
          .createQuery("from Message", Message.class)
          .list();
    }
    assertEquals(list.size(), 1);
    for (Message m : list) {
      System.out.println(m);
    }
    assertEquals(list.get(0), savedMessage);
  }
}
