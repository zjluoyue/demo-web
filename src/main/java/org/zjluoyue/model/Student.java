package org.zjluoyue.model;

import javax.persistence.*;

/**
 * Created by zjluoyue on 2016/8/3.
 */
@Entity
@Table(name="t_student")
public class Student {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String dept_name;

    @Column
    private Integer tot_cred;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public Integer getTot_cred() {
        return tot_cred;
    }

    public void setTot_cred(Integer tot_cred) {
        this.tot_cred = tot_cred;
    }
}
