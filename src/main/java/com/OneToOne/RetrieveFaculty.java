package com.OneToOne;

import com.HibernateBasicPrograms.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class RetrieveFaculty {
    public static void main(String[] args) {
        Session se = HibernateUtil.getSession();

        List<Address> ad =se.createCriteria(Address.class).list();
        ad.forEach(
                (a)->{
                    System.out.println("Hno is : "+a.getHno()+" City is : "+a.getCity()+" State is : "+a.getState());
                    System.out.println("Faculty Id : "+a.getFa().getFid()+" Faculty Name : "+a.getFa().getFname()+" Salary : "+a.getFa().getSalary());
                }

                );
    }
}
