package com.HibernateBasicPrograms;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteStudent{
    public static void main(String[] args) {

        Session se=HibernateUtil.getSession();
        Transaction tx=se.beginTransaction();

        Student s=(Student)se.get(Student.class, new Integer(444));

        se.delete(s);
        tx.commit();
        System.out.println("Record deleted Successfully");

    }
}








