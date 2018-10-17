package com.iotek.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/10/16 0016.
 */
public class Interview {
    private int id;
    private String dept;
    private String job;
    private Date interviewTime;
    private int uId;
    private int rId;
    private String hire;
    private String interview;

    public Interview() {
    }

    public Interview(int id, String dept, String job, Date interviewTime, int uId, int rId, String hire, String interview) {
        this.id = id;
        this.dept = dept;
        this.job = job;
        this.interviewTime = interviewTime;
        this.uId = uId;
        this.rId = rId;
        this.hire = hire;
        this.interview = interview;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "id=" + id +
                ", dept='" + dept + '\'' +
                ", job='" + job + '\'' +
                ", interviewTime=" + interviewTime +
                ", uId=" + uId +
                ", rId=" + rId +
                ", hire='" + hire + '\'' +
                ", interview='" + interview + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getInterviewTime() {
        return interviewTime;
    }

    public void setInterviewTime(Date interviewTime) {
        this.interviewTime = interviewTime;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public String getHire() {
        return hire;
    }

    public void setHire(String hire) {
        this.hire = hire;
    }

    public String getInterview() {
        return interview;
    }

    public void setInterview(String interview) {
        this.interview = interview;
    }

    public Interview(String dept, String job, Date interviewTime, int uId, int rId, String hire, String interview) {
        this.dept = dept;
        this.job = job;
        this.interviewTime = interviewTime;
        this.uId = uId;
        this.rId = rId;
        this.hire = hire;
        this.interview = interview;
    }
}
