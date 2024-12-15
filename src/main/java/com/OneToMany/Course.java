package com.OneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Course {
    @Id
    @Column(name="cou_id")
    int id;
    @Column(name="cou_name")
    String cname;
    @Column
    float fees;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public float getFees() {
        return fees;
    }

    public void setFees(float fees) {
        this.fees=fees;
    }
}


