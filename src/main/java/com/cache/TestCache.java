package com.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestCache {
    public static void main(String[] args) throws InterruptedException {
        Configuration cnf = new Configuration();
        cnf.configure("hibernate-config.xml");
        SessionFactory sf = cnf.buildSessionFactory();
        Session se = sf.openSession();

        Employee1 e = (Employee1) se.load(Employee1.class, new Integer(1));
        System.out.println(e.toString());
        se.close();
        Thread.sleep(6000);

        Session se1 = sf.openSession();
        Employee1 e1 = (Employee1) se.load(Employee1.class, new Integer(1));
        System.out.println(e1.toString());

    }
}