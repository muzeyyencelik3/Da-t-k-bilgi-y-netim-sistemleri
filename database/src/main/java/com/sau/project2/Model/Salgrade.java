package com.sau.project2.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Salgrade {
    @Id
    @Basic
    @Column(name = "GRADE", nullable = true)
    private Integer grade;
    @Basic
    @Column(name = "LOSAL", nullable = true)
    private Integer losal;
    @Basic
    @Column(name = "HISAL", nullable = true)
    private Integer hisal;

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getLosal() {
        return losal;
    }

    public void setLosal(Integer losal) {
        this.losal = losal;
    }

    public Integer getHisal() {
        return hisal;
    }

    public void setHisal(Integer hisal) {
        this.hisal = hisal;
    }
}
