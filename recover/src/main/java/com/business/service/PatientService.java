package com.business.service;

import com.business.bean.PatientInfo;

import java.util.List;

/**
 * @author 池灿淼
 * @date 2020/5/24
 **/
public interface PatientService {

    List<PatientInfo> selectAllPatients();

    List<PatientInfo> selectByIdOrName(String id, String name);

    int insertPatientInfo(PatientInfo patientInfo);

    PatientInfo findById(long id);

}
