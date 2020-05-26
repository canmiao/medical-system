package com.business.service;

import com.business.bean.SportData;

import java.util.List;

/**
 * @author 池灿淼
 * @date 2020/5/24
 **/
public interface SportDataService {
    List<SportData> findByPatientId(long id);
}
