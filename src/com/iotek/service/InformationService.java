package com.iotek.service;

import com.iotek.entity.Information;

/**
 * Created by Administrator on 2018/10/17 0017.
 */
public interface InformationService {

    Information findInformationById(Integer information);

    void addInformation(Information information);

    Information findInformationIformation(Information information);

}
