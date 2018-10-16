package com.iotek.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
public class Resume {
    private Integer id;
    private String name;
    private String sex;
    private int age;
    private String eduction;
    private String status;
    private String tel;
    private String email;
    private String dept;
    private String job;
    private String expectSalary;
    private String hobby;
    private String profession;
    private String delivery;
    private Date deliveryTime;
    private String look;
    private String invite;
    public Resume() {
    }

    public Resume(String name, String sex, int age, String eduction, String status, String tel, String email, String dept, String job, String expectSalary, String hobby, String profession, String delivery, Date deliveryTime, String look, String invite) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.eduction = eduction;
        this.status = status;
        this.tel = tel;
        this.email = email;
        this.dept = dept;
        this.job = job;
        this.expectSalary = expectSalary;
        this.hobby = hobby;
        this.profession = profession;
        this.delivery = delivery;
        this.deliveryTime = deliveryTime;
        this.look = look;
        this.invite = invite;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getLook() {
        return look;
    }

    public void setLook(String look) {
        this.look = look;
    }

    public String getInvite() {
        return invite;
    }

    public void setInvite(String invite) {
        this.invite = invite;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getExpectSalary() {
        return expectSalary;
    }

    public void setExpectSalary(String expectSalary) {
        this.expectSalary = expectSalary;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", eduction='" + eduction + '\'' +
                ", status='" + status + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", dept='" + dept + '\'' +
                ", job='" + job + '\'' +
                ", expectSalary='" + expectSalary + '\'' +
                ", hobby='" + hobby + '\'' +
                ", profession='" + profession + '\'' +
                ", delivery='" + delivery + '\'' +
                ", deliveryTime=" + deliveryTime +
                ", look='" + look + '\'' +
                ", invite='" + invite + '\'' +
                '}';
    }

    public Resume(String name, String sex, int age, String eduction, String status, String tel, String email, String dept, String job, String expectSalary, String hobby, String profession) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.eduction = eduction;
        this.status = status;
        this.tel = tel;
        this.email = email;
        this.dept = dept;
        this.job = job;
        this.expectSalary = expectSalary;
        this.hobby = hobby;
        this.profession = profession;
    }

    public Resume(String name, String sex, int age, String eduction, String status, String tel, String email, String dept, String job, String expectSalary, String hobby, String profession, String delivery, String look, String invite) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.eduction = eduction;
        this.status = status;
        this.tel = tel;
        this.email = email;
        this.dept = dept;
        this.job = job;
        this.expectSalary = expectSalary;
        this.hobby = hobby;
        this.profession = profession;
        this.delivery = delivery;
        this.look = look;
        this.invite = invite;
    }
}
