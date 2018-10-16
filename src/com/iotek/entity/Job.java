package com.iotek.entity;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
public class Job {
    private Integer id;
    private String name;
    private Dept dept;

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                '}';
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
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

    public Job() {

    }

    public Job(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
