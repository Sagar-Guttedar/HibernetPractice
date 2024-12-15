package com.HibernateBasicPrograms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Joc_Student")
public class Student {
    @Id
    @Column(name="s_id")
    int sid;
    @Column(name="s_name")
    String sname;
    @Column
    float fees;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public float getFees() {
        return fees;
    }

    public void setFees(float fees) {
        this.fees=fees;
    }
}