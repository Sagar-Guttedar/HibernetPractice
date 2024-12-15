package com.HQL;

import com.HibernateBasicPrograms.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;
import java.util.Scanner;

public class GetHQL {
    public static void main(String[] args) {
        Session se = HibernateUtil.getSession();

        Scanner sc = new Scanner(System.in);
        Query q=se.createQuery("from Product p where p.price=:val");

        System.out.println("Enter the price :");
        float f= sc.nextFloat();
        q.setParameter("val",f);

        List<Product> p=q.list();

        System.out.println("Product Id : "+p.get(0).getPid()+" Product Name : "+p.get(0).getPname()+" Price : "+p.get(0).getPrice());


    }
}
