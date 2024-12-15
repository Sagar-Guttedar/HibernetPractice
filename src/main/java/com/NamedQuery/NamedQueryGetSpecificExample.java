package com.NamedQuery;

import com.HibernateBasicPrograms.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class NamedQueryGetSpecificExample {
    public static void main(String[] args) {
        Session se = HibernateUtil.getSession();

        Query q=se.getNamedQuery("getSpecificEmployee");
        q.setParameter("emp",1);
        List<Employee> elist=q.list();
        elist.forEach(
                (x)-> System.out.println(x.toString())
        );
    }
}
