package com.iotek.service;

import com.iotek.entity.Resume;

/**
 * Created by Administrator on 2018/10/13 0013.
 */
public interface ResumeService {
    Resume findResumeById(Integer id);

    void addResume(Resume resume);

    void updateResume(Resume resume);
}
