package com.sau.project2.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bonus {
    @Id
    @Basic
    @Column(name = "ENAME", nullable = true, length = 10)
    private String ename;
    @Basic
    @Column(name = "JOB", nullable = true, length = 9)
    private String job;
    @Basic
    @Column(name = "SAL", nullable = true)
    private Integer sal;
    @Basic
    @Column(name = "COMM", nullable = true)
    private Integer comm;
    @Basic
    @Column(name = "id", nullable = true)
    private Integer id;

    public Bonus() {
    }

    public Bonus(String ename, String job, Integer sal, Integer comm, Integer id) {
        this.ename = ename;
        this.job = job;
        this.sal = sal;
        this.comm = comm;
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public Integer getComm() {
        return comm;
    }

    public void setComm(Integer comm) {
        this.comm = comm;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Bonus{" +
                "ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                ", comm=" + comm +
                ", id=" + id +
                '}';
    }
}
