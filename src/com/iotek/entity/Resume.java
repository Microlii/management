package com.iotek.entity;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
public class Resume {
    private Integer id;
    private String name;
    private String sex;
    private int age;
    private String eduction;
    private String staatus;

    public String getStaatus() {
        return staatus;
    }

    public void setStaatus(String staatus) {
        this.staatus = staatus;
    }

    private String tel;
    private String email;
    private Position position;
    private String expectSalary;
    private String hobby;
    private String profession;

    public Resume() {
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", eduction='" + eduction + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", position=" + position +
                ", expectSalary='" + expectSalary + '\'' +
                ", hobby='" + hobby + '\'' +
                ", profession='" + profession + '\'' +
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
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
}
