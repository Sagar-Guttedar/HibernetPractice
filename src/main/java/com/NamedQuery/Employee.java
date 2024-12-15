package com.NamedQuery;


//Named Queries :
//	In order to execute the same queries again and again in multiple programs in that scenario
//	we use NamedQueries.


import javax.persistence.*;


@NamedQueries(
        {
                @NamedQuery(
                        name="getAllEmployees",
                        query="from Employee"
                ),
                @NamedQuery(
                        name="getSpecificEmployee",
                        query = "from Employee e where e.id=:emp"
                ),
                @NamedQuery(
                        name="updateSpecificEmployee",
                        query ="update Employee e set e.salary=:salary where e.id=:id"
                ),
                @NamedQuery(
                        name="deleteSpecificEmployee",
                        query="delete from Employee e where e.id =:id"
                )

        }
)

@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    int id;
    @Column
    String name;
    @Column
    float salary;

    public Employee(){

    }

    public Employee(int id, String name, float salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public String toString(){
        return "Employee Id :"+id+" Employee Name : "+name+"  Employee Salary : "+salary;
    }

}
