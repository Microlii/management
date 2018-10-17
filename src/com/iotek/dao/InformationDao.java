package com.iotek.dao;

import com.iotek.entity.Information;

/**
 * Created by Administrator on 2018/10/17 0017.
 */
public interface InformationDao {
    Information findInformationById(Integer Id);
}
