package com.iotek.dao;

import com.iotek.entity.Resume;

/**
 * Created by Administrator on 2018/10/13 0013.
 */
public interface ResumeDao {
    Resume findResumeById(Integer id);

    void addResume(Resume resume);

    void updeteResume(Resume resume);
}
