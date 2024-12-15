package com.HibernateBasicPrograms;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*public class InsertStudent {
    public static void main(String[] args) {
        Configuration cnf = new Configuration();
        cnf.configure("hibernate-config.xml");
        SessionFactory sf  =cnf.buildSessionFactory();
        Session se =sf.openSession();
        Transaction tx =se.beginTransaction();

        Student st = new Student();
        st.setSid(1234);
        st.setSname("DEF");
        st.setFees(45000);

        se.save(st);
        tx.commit();
        System.out.println("Record inserted successfully..!");
    }
}*/


public class InsertStudent{
    public static void main(String[] args) {
        Configuration cnf=new Configuration();
        cnf.configure("hibernate-config.xml");
        SessionFactory sf=cnf.buildSessionFactory();
        Session se=sf.openSession();
        Transaction tx=se.beginTransaction();

        Student s= new Student();
        s.setSid(777);
        s.setSname("abc");
        s.setFees(30000);

        se.save(se);
        tx.commit();

    }
}
