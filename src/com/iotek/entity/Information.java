package com.iotek.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
public class Information {
    private Integer id;
    private String name;
    private String sex;
    private int age;
    private String eduction;
    private String tel;
    private String email;
    private String dept;
    private String job;
    private String status;
    private Date entryTime;
    private double salary;

    public Information(String name, String sex, int age, String eduction, String tel, String email, String dept, String job, String status, Date entryTime, double salary) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.eduction = eduction;
        this.tel = tel;
        this.email = email;
        this.dept = dept;
        this.job = job;
        this.status = status;
        this.entryTime = entryTime;
        this.salary = salary;
    }

    public Information() {
    }

    @Override
    public String toString() {
        return "Information{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", eduction='" + eduction + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", dept='" + dept + '\'' +
                ", job='" + job + '\'' +
                ", status='" + status + '\'' +
                ", entryTime=" + entryTime +
                ", salary=" + salary +
                '}';
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEduction() {
        return eduction;
    }

    public void setEduction(String eduction) {
        this.eduction = eduction;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
