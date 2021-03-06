package com.iotek.service.impl;

import com.iotek.dao.ResumeDao;
import com.iotek.entity.Resume;
import com.iotek.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/13 0013.
 */
@Service("resumeService")
public class ResumeServiceImpl implements ResumeService{
    @Autowired
    private ResumeDao resumeDao;
    @Override
    public Resume findResumeById(Integer id) {
        return resumeDao.findResumeById(id);
    }

    @Override
    public void addResume(Resume resume) {
        resumeDao.addResume( resume);
    }

    @Override
    public void updateResume(Resume resume) {
        resumeDao.updeteResume(resume);
    }

    @Override
    public Resume findResumeByResume(Resume resume) {
        return resumeDao.findResumeByResume(resume);
    }

    @Override
    public List<Resume> findResumesByDelivaryAndInvite(String delivary, String invite) {
        return resumeDao.findResumesByDelivaryAndInvite(delivary,invite);
    }

}
