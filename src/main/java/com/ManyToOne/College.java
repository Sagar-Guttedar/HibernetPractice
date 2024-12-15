package com.ManyToOne;


import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class College {
    @Id
    @Column(name="col_id")
    int cid;
    @Column(name="col_name")
    String cname;
    @Column
    String location;
    /*@OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="col_cou_id", referencedColumnName = "col_id")
    List<Course> cdetails;*/

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    /*public List<Course> getCdetails() {
        return cdetails;
    }

    public void setCdetails(List<Course> cdetails) {
        this.cdetails = cdetails;
    }*/

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname =cname;
    }
}
