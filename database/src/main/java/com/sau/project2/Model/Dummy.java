package com.sau.project2.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dummy {
    @Id
    @Basic
    @Column(name = "DUMMY", nullable = true)
    private Integer dummy;

    public Integer getDummy() {
        return dummy;
    }

    public void setDummy(Integer dummy) {
        this.dummy = dummy;
    }
}
