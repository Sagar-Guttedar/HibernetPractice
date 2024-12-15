package com.OneToMany;


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

        Course c2 = new Course();
        c2.setId(112);
        c2.setCname("CS");
        c2.setFees(150000);

        List<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);

        coll.setCdetailes(courses);

        se.save(coll);
        tx.commit();
        System.out.println("All Records got saved successfully");
}
}



