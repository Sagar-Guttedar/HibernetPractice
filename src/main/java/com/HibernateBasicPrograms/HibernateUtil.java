package com.HibernateBasicPrograms;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    public static Session getSession(){
        //Creates a Configuration object to configure Hibernate.
        Configuration cnf = new Configuration();
        // Loads the Hibernate configuration file.
        cnf.configure("hibernate-config.xml");
        // Creates a SessionFactory from the configuration
        SessionFactory sf = cnf.buildSessionFactory();
        // Opens a Session for interacting with the database.
        Session se = sf.openSession();
         Transaction tx = se.beginTransaction();
        return se;
    }
}
