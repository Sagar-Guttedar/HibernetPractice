package com.NamedQuery;

import com.HibernateBasicPrograms.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

//Named Queries :
//	In order to execute the same queries again and again in multiple programs in that scenario
//	we use NamedQueries.


public class NamedQueryInsertExample {
    public static void main(String[] args) {
        Session se = HibernateUtil.getSession();
        Transaction tx = se.beginTransaction();

        Employee e1= new Employee(1,"Terrorrist1",22500.143f);
        Employee e2= new Employee(2,"Terrorist2",15000.11f);
        Employee e3 = new Employee(3,"Terrorist3",10000.123f);

        se.save(e1);
        se.save(e2);
        se.save(e3);

        tx.commit();
        System.out.println("All records saved successfully");


    }
}
