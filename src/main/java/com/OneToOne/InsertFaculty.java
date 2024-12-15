package com.OneToOne;

import com.HibernateBasicPrograms.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class InsertFaculty {
    public static void main(String[] args) {
        Session se = HibernateUtil.getSession();
        Transaction tx =se.beginTransaction();

        Address ad = new Address();
        ad.setHno(1234);
        ad.setCity("Bangalore");
        ad.setState("Karnataka");

        Faculty f = new Faculty();
        f.setFid(111);
        f.setFname("Giridhar");
        f.setSalary(200000.234f);

        ad.setFa(f);

        se.save(ad);
        se.save(f);
        tx.commit();
        System.out.println("All details got saved");
    }
}
