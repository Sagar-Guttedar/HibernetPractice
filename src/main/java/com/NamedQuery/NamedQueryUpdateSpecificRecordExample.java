package com.NamedQuery;

import com.HibernateBasicPrograms.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class NamedQueryUpdateSpecificRecordExample {
    public static void main(String[] args) {
        Session se = HibernateUtil.getSession();
        Transaction tx = se.beginTransaction();

        Query q=se.getNamedQuery("updateSpecificEmployee");
        q.setParameter("salary",50000.45f);
        q.setParameter("id",1);

        int x = q.executeUpdate();
        tx.commit();
        if(x>0)
            System.out.println("Record updated successfully");
        else
            System.out.println("something went wrong");
    }
}
