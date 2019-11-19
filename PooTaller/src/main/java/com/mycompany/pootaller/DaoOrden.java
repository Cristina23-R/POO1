/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pootaller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author Home
 */
public class DaoOrden {
    
     protected SessionFactory sessionFactory;
	
	protected void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure()  //lee los settings del archivo hibernate.cfg.xml
				.build();
		try {
			sessionFactory = new MetadataSources(registry)
					.buildMetadata().buildSessionFactory();			
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
		
	}
	
	protected void crear(Orden orden) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(orden);
		s.getTransaction().commit();
		s.close();
	}
        
        protected Orden read(int ordenID) {
		Session s =  sessionFactory.openSession();
		Orden orden = s.get(Orden.class, ordenID);
		s.close();
		return orden;
	}
	
	protected void update(Orden orden) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(orden);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int ordenID) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Orden orden = new Orden();
		orden.setOrdenid(ordenID);
		s.delete(orden);
		s.getTransaction().commit();
		s.close();
       }
}
