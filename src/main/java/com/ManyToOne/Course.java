package com.ManyToOne;

import javax.persistence.*;

@Entity
@Table
public class Course {
    @Id
    @Column(name="cou_id")
    int id;
    @Column(name="cou_name")
    String cname;

    public College getColl() {
        return coll;
    }

    public void setColl(College coll) {
        this.coll = coll;
    }

    @Column
    float fees;

    @ManyToOne(targetEntity = College.class, cascade = CascadeType.ALL)
    @JoinColumn(name="c_c_id",referencedColumnName ="col_id" )
    College coll;

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
