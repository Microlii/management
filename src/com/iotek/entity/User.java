package com.iotek.entity;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
public class User {
    private int id;
    private String account;
    private String password;
    private int type;//0(游客)，1(普通员工),2(管理员)
    private Integer resume;
    private Integer information;

    public User() {
    }

    public User(String account, String password, int type) {
        this.account = account;
        this.password = password;
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                ", resume=" + resume +
                ", information=" + information +
                '}';
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

    public Integer getResume() {
        return resume;
    }

    public void setResume(Integer resume) {
        this.resume = resume;
    }

    public Integer getInformation() {
        return information;
    }

    public void setInformation(Integer information) {
        this.information = information;
    }
}
