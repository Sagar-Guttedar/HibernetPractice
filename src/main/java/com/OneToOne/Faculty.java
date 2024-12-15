package com.OneToOne;

import javax.persistence.*;

@Entity
@Table
public class Faculty {

    @Id
    @Column(name="f_id")
    int fid;
    @Column(name="f_name")
    String fname;
    @Column
    float salary;

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary =salary;
    }
}