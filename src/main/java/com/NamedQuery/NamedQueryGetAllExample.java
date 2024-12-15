package com.NamedQuery;

import com.HibernateBasicPrograms.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class NamedQueryGetAllExample {
    public static void main(String[] args) {
        Session se = HibernateUtil.getSession();


        Query q=se.getNamedQuery("getAllEmployees");
        List<Employee> e = q.list();

        e.forEach(
                (x)->
                        System.out.println(x.toString())
        );

    }
}
