package com.iotek.test;

import com.iotek.dao.JobDao;
import com.iotek.dao.DeptDao;
import com.iotek.dao.ResumeDao;
import com.iotek.entity.Dept;
import com.iotek.entity.Job;
import com.iotek.entity.Resume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/10/13 0013.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestDeptDao {
    @Autowired
    private DeptDao deptDao;
    @Autowired
    private JobDao jobDao;
    @Autowired
    private ResumeDao resumeDao;
    @Test
    public void testFindAllDept(){
        List<Dept> depts = deptDao.findAllDept();
        System.out.println(depts);
    }
    @Test
    public void testFindAllJobs(){
        List<Job> depts =jobDao.findAllJobs();
        System.out.println(depts);
    }
    @Test
    public void testFindDeptByName(){
        Dept depts =deptDao.findDeptByName("人事部");
        System.out.println(depts);
    }
    @Test
    public void testFindByDeptId(){
        List<Job> depts =jobDao.findByDeptId(1);
        System.out.println(depts);
    }
    @Test
    public void testFindResumeById(){
        Resume resume = resumeDao.findResumeById(1);
        System.out.println(resume);
    }
    @Test
    public void testAddResume(){
        Resume resume = new Resume("ddd","男",25,"博士","普通群众","15698","fff@qq.com","人事部","人事专员","4000-6000","eee","rrr","aaa","aaa","aaa");
        resumeDao.addResume(resume);
    }
    @Test
    public void testFindResumeByResume(){
        Resume resume = new Resume("tht","男",25,"博士","普通群众","15698","fff@qq.com","人事部","人事专员","4000-6000","eee","rrr");
        Resume resume1 = resumeDao.findResumeByResume(resume);
        System.out.println(resume1);
    }
    @Test
    public void testUpdateResume(){
        Date date = new Date();
        System.out.println(date);
        Resume resume = new Resume("tht","男",25,"博士","普通群众","15698","fff@qq.com","人事部","人事专员","4000-6000","eee","rrr","aaa",date,"aaa","aaa");
        resume.setId(24);
        resumeDao.updeteResume(resume);
    }
    @Test
    public void testfindResumes(){
        String delivary = "已投递";
        String invite = "未面试";
        List<Resume> resumes =resumeDao.findResumesByDelivaryAndInvite(delivary,invite);
        System.out.println(resumes);
    }
}
