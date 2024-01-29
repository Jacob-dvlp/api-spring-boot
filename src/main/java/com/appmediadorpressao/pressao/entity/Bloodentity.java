package com.appmediadorpressao.pressao.entity;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "blood")
public class Bloodentity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pre_id")
    private Long id;
    @Column(name = "pre_systolic")
    private Long systolic;
    @Column(name = "pre_diastolic")
    private  Long diastolic;
    @Column(name = "pre_date")
    private Date date;


    public Bloodentity() {
    }

    public   Bloodentity(Long id, Long systolic, Long diastolic, Date date) {
        this.id = id;
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSystolic() {
        return systolic;
    }

    public void setSystolic(Long systolic) {
        this.systolic = systolic;
    }

    public Long getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(Long diastolic) {
        this.diastolic = diastolic;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
