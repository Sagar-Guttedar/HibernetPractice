package com.HibernateBasicPrograms;

import org.hibernate.Session;
import java.util.Comparator;
import java.util.List;
/*
public class FetchStudentDesc {
    public static void main(String[] args) {
        Session se = HibernateUtil.getSession();
        List<Student> sList = se.createCriteria(Student.class).list();
        sList.stream()
                .sorted(Comparator.comparing(Student::getFees).reversed())
                .forEach((st) -> {
                    System.out.println("Student id is: " + st.getSid() + " Name: " + st.getSname() + " Fees: " + st.getFees());
                    System.out.println("----------------------------------------------------------");
                }
                );
    }
}*/


public class FetchStudentDesc{
    public static void main(String[] args) {
        Session se = HibernateUtil.getSession();
        List<Student> slist=se.createCriteria(Student.class).list();
        slist.stream().sorted(Comparator.comparing(Student::getFees).reversed())
                .forEach((st) -> {
                    System.out.println("Student Id : " + st.getSid() + " Name : " + st.getSname() + " Fees : " + st.getFees());
                    System.out.println("----------------------------------------------------------------------------");
                }
                );
    }
}