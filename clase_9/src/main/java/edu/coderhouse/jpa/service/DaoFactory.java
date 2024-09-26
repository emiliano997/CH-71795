package edu.coderhouse.jpa.service;

import edu.coderhouse.jpa.entity.Client;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaoFactory {
  private final SessionFactory sessionFactory;

  @Autowired
  public DaoFactory(EntityManagerFactory factory) {
    this.sessionFactory = factory.unwrap(SessionFactory.class);
  }

  public void create(Object obj) {
    Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    session.persist(obj);
    session.getTransaction().commit();
  }

  public void update(Object obj) {
    Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    session.merge(obj);
    session.getTransaction().commit();
  }

  public Client getClient(Client client) {
    Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    Client clientSaved = session.get(Client.class, client.getId());
    session.getTransaction().commit();

    return clientSaved;
  }
}
