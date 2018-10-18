package com.iotek.controller;

import com.alibaba.fastjson.JSONArray;
import com.iotek.entity.*;
import com.iotek.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.transform.Source;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
@RequestMapping("user")
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private DeptService deptService;
    @Autowired
    private JobService jobService;
    @Autowired
    private ResumeService resumeService;
    @Autowired
    private InterviewService interviewService;
    @Autowired
    private InformationService informationService;

    @RequestMapping("login")
    public String login(String account, String password, Model model){
        User user =userService.findUserByAccountAndPassword(account,password);
        if (user==null){
            model.addAttribute("str",111);
            return "redirect:/index.jsp";
        }else {
            if (user.getType()==1){
                model.addAttribute("user",user);
                return "staff";
            }
            if (user.getType()==2){
                Information information = informationService.findInformationById(user.getInformation());
                String hire ="未录用";
                String interview = "参加面试";
                String dept =information.getDept();
                List<Interview> interviews = interviewService.findInterviewsByHireAndInterviewAndDept(hire,interview,dept);
                System.out.println(interviews);
                if (interviews.size()!=0){
                    model.addAttribute("id",information.getId());
                }
                return "supervisor";
            }
            if (user.getType()==3){
                return "admin";
            }
        }
        Interview interview = interviewService.findInterviewByUId(user.getId());
        if (interview!=null){
            model.addAttribute("interview",interview);
        }
        model.addAttribute("user",user);
        return "show";
    }
    @RequestMapping("registing")
    public String registing(Model model){
        return "regist";
    }
    @RequestMapping("updatePassword")
    public String updatePassword(Integer id,Model model){
        User user = userService.findUserById(id);
        model.addAttribute("user",user);
        return "updatePassword";
    }
    @RequestMapping("updatedPassword")
    public String updatedPassword(Integer id,String newPassword){
        userService.updatedPassword(id,newPassword);
        return "show";
    }

    @RequestMapping("logined")
    public String logined(String account,String password,Model model){
        User user = userService.findUserByAccount(account);
        if (user!=null){
            model.addAttribute("str","已存在的账号");
            return "regist";
        }
        user.setType(0);
        userService.addUser(user);
        return "redirect:/index.jsp";
    }
    @RequestMapping("lookResume")
    public String lookResume(Model model,Integer id){
        List<Dept> depts = deptService.findAllDept();
        model.addAttribute("depts",depts);
        List<Job> jobs = jobService.findAllJobs();
        model.addAttribute("jobs",jobs);
        User user = userService.findUserById(id);
        Resume resume = resumeService.findResumeById(user.getResume());
        model.addAttribute("resume",resume);
        model.addAttribute("user",user);
        return "resumeView";
    }

    @RequestMapping(value="/findJobs",produces = {"text/html;charset=utf-8"})
    @ResponseBody()
    public void findJobs(String name, PrintWriter printWriter){
        Dept dept1 = deptService.findDeptByName(name);
        List<Job> jobs = jobService.findByDeptId(dept1.getId());
        Object o = JSONArray.toJSONString(jobs);
        printWriter.print(o);
    }

    @RequestMapping("addResume")
    public String addResume(Integer id,Resume resume,Model model,String deli){
        resume.setLook("未查看");
        resume.setInvite("未面试");
        User user = userService.findUserById(id);
        if (("是").equals(deli)){
            resume.setDelivery("已投递");
            resume.setDeliveryTime(new Date());
        }else {
            resume.setDelivery("未投递");
        }
        if (user.getResume()==null){
            resume.setId(-1);
            System.out.println(resume);
            resumeService.addResume(resume);
            System.out.println(111);
            Resume resume1 =resumeService.findResumeByResume(resume);
            System.out.println(resume1);
            userService.updateUser(resume1.getId(),user.getId());
        }else {
            System.out.println(resume);
            resumeService.updateResume(resume);
        }
        model.addAttribute("user",user);
        return "show";
    }
    @RequestMapping("exit")
    public String exit(){
        return "redirect:/index.jsp";
    }
    @RequestMapping("showResumes")
    public String showResumes(Model model){
        String delivary = "已投递";
        String invite = "未面试";
        List<Resume> resumes = resumeService.findResumesByDelivaryAndInvite(delivary,invite);
        model.addAttribute("resumes",resumes);
        return ("showRes");
    }
    @RequestMapping("look")
    public String look(Integer id,Model model){
        Resume resume = resumeService.findResumeById(id);
        resume.setLook("已查看");
        resumeService.updateResume(resume);
        model.addAttribute("resume",resume);
        System.out.println(resume);
        return "showResume";
    }
    @RequestMapping("addInterview")
    public String addInterview(Integer id, String time){
        System.out.println(time);
        Resume resume = resumeService.findResumeById(id);
        resume.setInvite("已面试");
        SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = spf.parse(time);
            resumeService.updateResume(resume);
            User user =userService.findUserByResume(resume.getId());
            Interview interview = new Interview(resume.getDept(),resume.getJob(),date,user.getId(),resume.getId(),"未录用","不参加");
            interviewService.addInterview(interview);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "admin";
    }
    @RequestMapping("lookInterview")
    public String lookInterview(Integer id,Model model){
        Interview interview = interviewService.findInterviewByUId(id);
        model.addAttribute("interview",interview);
        return "showInterview";
    }
    @RequestMapping("updateInterview")
    public String updateInterview(Integer id){
        System.out.println(id);
        Interview interview = interviewService.findInterviewByUId(id);
        System.out.println(interview);
        interview.setInterview("参加面试");
        interviewService.updateInterview(interview);
        return "show";
    }
    @RequestMapping("interviews")
    public String interviews(Integer id,Model model){
        Information information = informationService.findInformationById(id);
        String hire ="未录用";
        String interview = "参加面试";
        String dept =information.getDept();
        List<Interview> interviews = interviewService.findInterviewsByHireAndInterviewAndDept(hire,interview,dept);
        model.addAttribute("interviews",interviews);
        return "showInterviews";
    }
    @RequestMapping("showdetails")
    public String showdetails(Integer id,Model model){
        Resume resume = resumeService.findResumeById(id);
        model.addAttribute("resume",resume);
        System.out.println(resume);
        return "hire";
    }
    @RequestMapping("hired")
    public String hired(Integer id){
        Resume resume = resumeService.findResumeById(id);
        System.out.println(resume);
        Information information = new Information(resume.getName(),resume.getSex(),resume.getAge(),resume.getEduction(),resume.getTel(),resume.getEmail(),resume.getDept(),resume.getJob(),resume.getStatus(),new Date(),0.0);
        informationService.addInformation(information);
        Information information1 = informationService.findInformationIformation(information);
        User user = userService.findUserByResume(id);
        user.setType(1);
        user.setInformation(information1.getId());
        userService.updateUserType(user);
        User user1 = userService.findUserByResume(id);
        System.out.println(user1);
        interviewService.deleteByRid(id);
        return "supervisor";
    }
    @RequestMapping("showInformation")
    public String showInformation(Integer id,Model model){
        Information information = informationService.findInformationById(userService.findUserById(id).getInformation());
        model.addAttribute("information",information);
        return "information";
    }
}
