package com.business.service.impl;

import com.business.bean.PatientInfo;
import com.business.mapper.PatientInfoMapper;
import com.business.service.PatientService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 池灿淼
 * @date 2020/5/24
 **/
@Service
public class PatientServiceImpl implements PatientService {

    @Resource
    private PatientInfoMapper patientInfoMapper;

    @Override
    public List<PatientInfo> selectAllPatients() {
        return patientInfoMapper.selectAll();
    }

    @Override
    public List<PatientInfo> selectByIdOrName(String id, String name) {

        Example example = new Example(PatientInfo.class);
        Example.Criteria criteria = example.createCriteria();

        if (name == null || name == "") {
            criteria.andEqualTo("id", id);
            List<PatientInfo> list = patientInfoMapper.selectByExample(example);
            return list;
        }



        criteria.andEqualTo("id", id);
        criteria.orLike("name", "%" + name + "%");
        List<PatientInfo> list = patientInfoMapper.selectByExample(example);

        return list;
    }

    @Override
    public int insertPatientInfo(PatientInfo patientInfo) {
        return patientInfoMapper.insert(patientInfo);
    }

    @Override
    public PatientInfo findById(long id) {
        return patientInfoMapper.selectByPrimaryKey(id);
    }
}
