package com.iotek.dao;

import com.iotek.entity.Resume;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/10/13 0013.
 */
public interface ResumeDao {
    Resume findResumeById(Integer id);

    void addResume(Resume resume);

    void updeteResume(Resume resume);

    Resume findResumeByResume(Resume resume);

    List<Resume> findResumesByCondition(String condition);

    List<Resume> findResumesByDelivaryAndInvite(@Param("delivary") String delivary,@Param("invite") String invite);
}
