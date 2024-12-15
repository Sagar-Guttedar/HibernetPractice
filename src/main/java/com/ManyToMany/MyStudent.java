package com.ManyToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class MyStudent {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="s_id")
    int id;
    @Column(name="s_name")
    String name;
    @Column
    String course;
    @ManyToMany(mappedBy="slist")
    List<MyInstitute> ilist;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public List<MyInstitute> getIlist() {
        return ilist;
    }
    public void setIlist(List<MyInstitute> ilist) {
        this.ilist =ilist;
    }


}
