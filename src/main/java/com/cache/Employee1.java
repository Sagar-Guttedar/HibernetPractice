package com.cache;

import org.hibernate.annotations.CacheConcurrencyStrategy;
import javax.persistence.*;

@Entity
@Table
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Employee1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    int id;
    @Column
    String name;
    @Column
    float salary;

    public Employee1(){

    }

    public Employee1( String name, float salary){
        // this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "Employee Id : "+id+" Employee Name : "+name+" Salary : "+salary;
    }
}
