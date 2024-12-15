package com.NamedQuery;

import com.HibernateBasicPrograms.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class NamedQueryDeleteSpecificRecordExample {
    public static void main(String[] args) {
        Session se = HibernateUtil.getSession();
        Transaction tx = se.beginTransaction();

        Query q = se.getNamedQuery("deleteSpecificEmployee");
        q.setParameter("id",6);
        int x = q.executeUpdate();
        tx.commit();

        if (x > 0){
            System.out.println("Record deleted Successfully");
        }else{
            System.out.println("Something went wrong");
        }
    }
}
