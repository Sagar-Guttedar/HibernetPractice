package com.HibernateBasicPrograms;

import org.hibernate.Session;

/*public class FetchSpecificStudentDetails {
    public static void main(String[] args) {
        Session se = HibernateUtil.getSession();

        Student st = (Student) se.get(Student.class, 111);
        System.out.println("Student id is :"+st.getSid()+" Name :"+st.getSname()+" Fees : "+st.getFees());
        System.out.println("----------------------------------------------------------");
        Student st1 = (Student) se.load(Student.class, 222);
        System.out.println("Student id is :"+st1.getSid()+" Name :"+st1.getSname()+" Fees : "+st1.getFees());
    }
}*/

/*
public class FetchSpecificStudentDetails{
    public static void main(String[] args) {
        Session se=HibernateUtil.getSession();

        Student s=(Student)se.get(Student.class,111);
        System.out.println("Stdeunt id : "+s.getSid()+" Name :"+s.getSname()+" Fees : "+s.getFees());
        System.out.println("------------------------------------------------");
        Student s1=(Student)se.load(Student.class,222);
        System.out.println("Stdeunt id : "+s1.getSid()+" Name :"+s1.getSname()+" Fees : "+s1.getFees());
    }
}*/

/*public class FetchSpecificStudentDetails {
    public static void main(String[] args) {
        Session se= HibernateUtil.getSession();
        Student s=(Student)se.get(Student.class,111);
        System.out.println("Student id : "+s.getSid()+" Name : "+s.getSname()+" Fees : "+s.getFees());
        System.out.println("------------------------------------------------------------------------");
        Student s1=(Student)se.load(Student.class, 222);
        System.out.println("Student id :"+s.getSid()+" Name : "+s.getSname()+" Fees : "+s.getFees());
    }
}*/

/*public class FetchSpecificStudentDetails{
    public static void main(String[] args) {
        Session se =HibernateUtil.getSession();

        Student s =(Student)se.get(Student.class,new Integer(666));
        System.out.println("Student Id : "+s.getSid()+" Name : "+s.getSname()+" Fees : "+s.getFees());
        System.out.println("------------------------------------------");
        Student s1 =(Student)se.load(Student.class,111);
        System.out.println("Student id :"+s1.getSid()+" Name : "+s1.getSname()+" Fees : "+s1.getFees());
    }
}*/

public class FetchSpecificStudentDetails{
    public static void main(String[] args) {
        Session se =HibernateUtil.getSession();
        Student s =(Student)se.get(Student.class, 111);
        System.out.println("Stdeunt Id : "+s.getSid()+" Name : "+s.getSname()+" Fees : "+s.getFees());

        Student s1 = (Student)se.load(Student.class,222);
        System.out.println("Student Id : "+s1.getSid()+" Name : "+s1.getSname()+" Fees :"+s.getFees());
    }
}