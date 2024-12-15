package com.HibernateBasicPrograms;

import com.OneToMany.College;
import com.OneToMany.Course;
import org.hibernate.Session;

import java.util.List;
public class FetchCollegeDetails {
    public static void main(String[] args) {
        Session se = HibernateUtil.getSession();
        List<College> clist = se.createCriteria(College.class).list();
        for(College col: clist){
            System.out.println("College Id : "+col.getCid()+" College Name : "+col.getCname()+" Location : "+col.getLocation());
            List<Course> coList= col.getCdetailes();
            coList.forEach(
                    (cou)-> System.out.println("Course Id : "+cou.getId()+" Course Name : "+cou.getCname()+" Fees : "+cou.getFees())
            );
        }
    }
}

