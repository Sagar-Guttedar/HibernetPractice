package com.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import com.HibernateBasicPrograms.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ManyToManySaveEx {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Session se = HibernateUtil.getSession();
        Transaction tx = se.beginTransaction();

        MyInstitute i1 = new MyInstitute();
        i1.setName("Joctopus");
        i1.setLocation("BTM Layout");

        MyInstitute i2 = new MyInstitute();
        i2.setName("QOctopus");
        i2.setLocation("Marathahalli");

        MyStudent s1 = new MyStudent();
        s1.setName("Maruthi");
        s1.setCourse("Java");

        MyStudent s2 = new MyStudent();
        s2.setName("Aravind");
        s2.setCourse("Testing");


        List<MyStudent> m =  new ArrayList<>();
        m.add(s1);
        m.add(s2);

        List<MyInstitute> ilist = new ArrayList<>();
        ilist.add(i1);
        ilist.add(i2);

        i1.setSlist(m);
        i2.setSlist(m);

        s1.setIlist(ilist);
        s2.setIlist(ilist);

        se.save(i1);
        se.save(i2);
        se.save(s1);
        se.save(s2);
        tx.commit();
        System.out.println("OMG....!");

    }

}