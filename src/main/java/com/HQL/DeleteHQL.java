package com.HQL;

import com.HibernateBasicPrograms.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteHQL {
    public static void main(String[] args) {
        Session se = HibernateUtil.getSession();
        Transaction tx = se.beginTransaction();

        String qu = "DELETE FROM Product p WHERE p.pid = :id";

        Query query = se.createQuery(qu);
        query.setParameter("id", 3);

        int x = query.executeUpdate();
        tx.commit();

        if (x > 0) {
            System.out.println("Record deleted successfully");
        } else {
            System.out.println("Something went wrong");
        }
    }
}
