package com.HibernateBasicPrograms;

import org.hibernate.Session;
import org.hibernate.Transaction;
/*
public class UpdateStudent {
    public static void main(String[] args) {
        Session se =HibernateUtil.getSession();
        Transaction tx= se.beginTransaction();

        Student s =(Student)se.get(Student.class, new Integer(111));

        s.setFees(70000);
        s.setSname("Sagar");

        se.save(s);
        tx.commit();
        System.out.println("Record Updated Successfully");
    }
}*/


public class UpdateStudent {
    public static void main(String[] args) {
        Session se =HibernateUtil.getSession();
        Transaction tx =se.beginTransaction();

        Student s =(Student)se.get(Student.class, new Integer(111));

        s.setFees(71000);

        se.save(s);
        tx.commit();
        System.out.println("Recorde updated Successfully");
    }
}