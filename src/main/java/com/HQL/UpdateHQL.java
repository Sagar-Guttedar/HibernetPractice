package com.HQL;


import com.HibernateBasicPrograms.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateHQL {
    public static void main(String[] args) {
        Session se = HibernateUtil.getSession();
        Transaction tx = se.beginTransaction();
        String qu ="update Product p set p.pname=:n where p.pid=:id";

        Query query = se.createQuery(qu);

        query.setParameter("n","Galaxy");
        query.setParameter("id",1);

        int x = query.executeUpdate();
        tx.commit();
        if(x>0)
            System.out.println("Record updated successfully");
        else
            System.out.println("something went wrong");
    }
}