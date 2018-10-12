package com.iotek.entity;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
public class User{
    private int id;
    private String account;
    private String password;
    private int type;//0(游客)，1(普通员工),2(管理员)
    private Resume resume;
    private Information information;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + account + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                ", resume=" + resume +
                ", information=" + information +
                '}';
    }

    public User(String account, String password, int type) {
        this.account = account;
        this.password = password;
        this.type = type;
    }

    public User(int id, String name, String password, int type, Resume resume, Information information) {
        this.id = id;
        this.account = name;
        this.password = password;
        this.type = type;
        this.resume = resume;
        this.information = information;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    public User() {

    }
}
