package com.iotek.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/10/18 0018.
 */
public class Punch {
    private Integer id;
    private Integer uId;
    private int year;
    private int month;
    private int day;
    private Date workTime;
    private Date ofTime;
    private String late;
    private String early;
    private String competion;
    public Punch() {
    }
    public Punch(Integer uId, int year, int month, int day, Date workTime, Date ofTime, String late, String early, String competion) {
        this.uId = uId;
        this.year = year;
        this.month = month;
        this.day = day;
        this.workTime = workTime;
        this.ofTime = ofTime;
        this.late = late;
        this.early = early;
        this.competion = competion;
    }

    public Punch(Integer uId, int year, int month, int day, Date workTime) {
        this.uId = uId;
        this.year = year;
        this.month = month;
        this.day = day;
        this.workTime = workTime;
    }

    @Override
    public String toString() {
        return "Punch{" +
                "id=" + id +
                ", uId=" + uId +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", workTime=" + workTime +
                ", ofTime=" + ofTime +
                ", late='" + late + '\'' +
                ", early='" + early + '\'' +
                ", competion='" + competion + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Date getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }

    public Date getOfTime() {
        return ofTime;
    }

    public void setOfTime(Date ofTime) {
        this.ofTime = ofTime;
    }

    public String getLate() {
        return late;
    }

    public void setLate(String late) {
        this.late = late;
    }

    public String getEarly() {
        return early;
    }

    public void setEarly(String early) {
        this.early = early;
    }

    public String getCompetion() {
        return competion;
    }

    public void setCompetion(String competion) {
        this.competion = competion;
    }
}