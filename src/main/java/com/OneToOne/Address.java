package com.OneToOne;

import javax.persistence.*;

@Entity
@Table
public class Address {

    @Id
    @Column(name="h_no")
    int hno;
    @Column
    String city;
    @Column
    String state;

    @OneToOne(targetEntity = Faculty.class, cascade = CascadeType.ALL)
    @JoinColumn(name="f_a_id", referencedColumnName = "f_id")
    Faculty fa;

    public Faculty getFa() {
        return fa;
    }

    public void setFa(Faculty fa) {
        this.fa = fa;
    }

    public int getHno() {
        return hno;
    }

    public void setHno(int hno) {
        this.hno = hno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state =state;
    }
}