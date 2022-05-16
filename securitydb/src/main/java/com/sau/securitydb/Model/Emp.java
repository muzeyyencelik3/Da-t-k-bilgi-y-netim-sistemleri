package com.sau.securitydb.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Emp {
    @Id
    @Basic
    @Column(name = "EMPNO", nullable = false)  //EMPNO is id
    private int empno;
    @Basic
    @Column(name = "ENAME", nullable = true, length = 10)
    private String ename;
    @Basic
    @Column(name = "JOB", nullable = true, length = 9)
    private String job;
    @Basic
    @Column(name = "MGR", nullable = true)
    private Integer mgr;
    @Basic
    @Column(name = "HIREDATE", nullable = true)
    private Date hiredate;
    @Basic
    @Column(name = "SAL", nullable = true)
    private Integer sal;
    @Basic
    @Column(name = "COMM", nullable = true)
    private Integer comm;
    @Basic
    @Column(name = "DEPTNO", nullable = true)
    private Integer deptno;

    public Emp() {
    }

    public Emp(int empno, String ename, String job, Integer mgr, Date hiredate, Integer sal, Integer comm, Integer deptno) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
        this.deptno = deptno;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
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

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
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

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", hiredate=" + hiredate +
                ", sal=" + sal +
                ", comm=" + comm +
                ", deptno=" + deptno +
                '}';
    }
}
