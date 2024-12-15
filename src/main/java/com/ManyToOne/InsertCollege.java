package com.ManyToOne;


import com.HibernateBasicPrograms.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class InsertCollege {
    public static void main(String[] args) {
        Session se = HibernateUtil.getSession();
        Transaction tx = se.beginTransaction();

        College coll = new College();
        coll.setCid(123);
        coll.setCname("VIT");
        coll.setLocation("Bangalore");

        Course c1 = new Course();
        c1.setId(111);
        c1.setCname("Mechanical");
        c1.setFees(120000);
        c1.setColl(coll);

        Course c2 = new Course();
        c2.setId(112);
        c2.setCname("CS");
        c2.setFees(150000);
        c2.setColl(coll);

        List<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);

        // coll.setCdetails(courses);

        se.save(coll);
        se.save(c1);
        se.save(c2);
        tx.commit();
        System.out.println("All Records got saved successfully");
    }
}
