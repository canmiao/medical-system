package com.business.service.impl;

import com.business.bean.PatientInfo;
import com.business.bean.SportData;
import com.business.mapper.SportDataMapper;
import com.business.service.PatientService;
import com.business.service.SportDataService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 池灿淼
 * @date 2020/5/24
 **/
@Service
public class SportDataServiceImpl implements SportDataService {

    @Resource
    private PatientService patientService;

    @Resource
    private SportDataMapper sportDataMapper;

    @Override
    public List<SportData> findByPatientId(long id) {

        PatientInfo patient = patientService.findById(id);

        Example example = new Example(SportData.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("patientId", patient.getId());
        example.setOrderByClause("create_time asc");

        List<SportData> list = sportDataMapper.selectByExample(example);

        return list;
    }
}
