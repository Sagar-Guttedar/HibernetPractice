package com.HQL;

import com.HibernateBasicPrograms.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class SelectHQL {
    public static void main(String[] args) {
        Session se = HibernateUtil.getSession();

        String query = "from Product";
        Query q= se.createQuery(query);

        List<Product> plist = q.list();

        plist.forEach(
                (x)->{
                    System.out.println("Product Id "+x.getPid()+" Product Name "+x.getPname()+" Price : "+x.price);
                    System.out.println("------------------------------------------------------------------------");

                }
        );
    }
}
