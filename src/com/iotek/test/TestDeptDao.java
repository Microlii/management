package com.iotek.test;

import com.iotek.dao.*;
import com.iotek.entity.*;
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
    @Autowired
    private InterviewDao interviewDao;
    @Autowired
    private InformationDao informationDao;

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
        String invite = "已面试";
        List<Resume> resumes =resumeDao.findResumesByDelivaryAndInvite(delivary,invite);
        System.out.println(resumes);
    }
    @Test
    public void testAddInterview(){
        Interview interview = new Interview("aaa","aaa",new Date(),1,1,"录用","参加面试");
        interviewDao.addInterview(interview);
    }
    @Test
    public void testFindIntervierByUid(){
        Interview interview = interviewDao.findInerrviewByUId(1);
        System.out.println(interview);
    }
    @Test
    public void testFindInterviewByHireAndInterview(){
        String hire = "录用";
        String interview = "参加面试";
        List<Interview> interviews = interviewDao.findInterviewByHireAndInterview(hire,interview);
        System.out.println(interviews);
    }
    @Test
    public void testUpdateIntervew(){
        Interview interview = new Interview(1,"aaa","aaa",new Date(),1,1,"录用1","参加面试");
        interviewDao.updateInterview(interview);
    }
    @Test
    public void testFindInformationById(){
        Information information = informationDao.findInformationById(1);
        System.out.println(information);
    }
    @Test
    public void testFindInterviewByHireAndInterviewAndDept(){
        String dept ="人事部";
        String hire = "未录用";
        String interview = "参加面试";
        List<Interview> interviews = interviewDao.findInterviewsByHireAndInterviewAndDept(hire,interview,dept);
        System.out.println(interviews);
    }
    @Test
    public void testFindInterviewByRID(){
        Interview interview = interviewDao.findInterviewByRId(24);
        System.out.println(interview);
    }
    @Test
    public void testAddInformation(){
        Information information = new Information("aaa","a",1,"aa","222","sss","ddd","ddd","ddd",new Date(),0.0);
        informationDao.addInformation(information);
    }
    @Test
    public void testfindInformation(){
        Information information = new Information("aaa","a",1,"aa","222","sss","ddd","ddd","ddd",new Date(),0.0);
        Information information1 =informationDao.findInformationIformation(information);
        System.out.println(information1);
    }
    @Test
    public void testDeleteByRid(){
        interviewDao.deleteByRid(1);
    }

}
