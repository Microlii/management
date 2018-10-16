package com.iotek.controller;

import com.alibaba.fastjson.JSONArray;
import com.iotek.entity.Dept;
import com.iotek.entity.Job;
import com.iotek.entity.Resume;
import com.iotek.entity.User;
import com.iotek.service.DeptService;
import com.iotek.service.JobService;
import com.iotek.service.ResumeService;
import com.iotek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.transform.Source;
import java.io.PrintWriter;
import java.util.Date;
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

    @RequestMapping("login")
    public String login(String account, String password, Model model){
        User user =userService.findUserByAccountAndPassword(account,password);
        if (user==null){
            model.addAttribute("str","账号或密码错误");
            return "redirect:/index.jsp";
        }else {
            if (user.getType()==3){
                return "admin";
            }
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
        User user1 = new User(account,password,0);
        userService.addUser(user1);
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
}
