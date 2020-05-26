package com.business.controller;

import com.business.bean.PatientInfo;
import com.business.common.CodeConstant;
import com.business.common.CommonResult;
import com.business.common.MessageConstant;
import com.business.mapper.PatientInfoMapper;
import com.business.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 池灿淼
 * @date 2020/5/24
 **/
@RestController
@RequestMapping("/patient")
public class PatientController {

    @Resource
    private PatientService patientService;


    /**
     * 查询所有的病人信息
     *
     * @return
     */
    @GetMapping("/select/all")
    public CommonResult<List<PatientInfo>> selectAllPatientsInfo() {
        List<PatientInfo> list = patientService.selectAllPatients();

        if (CollectionUtils.isEmpty(list)) {
            return new CommonResult<>(CodeConstant.NOT_EXIST, MessageConstant.IS_NOT_EXIST, null);
        }

        return new CommonResult<>(CodeConstant.SUCCESS, MessageConstant.SELECT_SUCCESS, list);
    }

    /**
     * 通过病人id和病人姓名查询信息
     *
     * @param id   病人id
     * @param name 病人姓名
     * @return
     */
    @GetMapping("/select/by/id/name")
    public CommonResult<List<PatientInfo>> selectByIdOrName(String id, String name) {
        List<PatientInfo> list = patientService.selectByIdOrName(id, name);

        if (CollectionUtils.isEmpty(list)) {
            return new CommonResult<>(CodeConstant.NOT_EXIST, MessageConstant.IS_NOT_EXIST, null);
        }

        return new CommonResult<>(CodeConstant.SUCCESS, MessageConstant.SELECT_SUCCESS, list);
    }

    @PostMapping("/insert")
    public CommonResult insert(@RequestBody(required = false) PatientInfo patientInfo) {
        if (patientInfo == null) {
            return new CommonResult(CodeConstant.ERROR, MessageConstant.FAILURE, null);
        }

        if (patientService.insertPatientInfo(patientInfo) > 0) {
            return new CommonResult(CodeConstant.SUCCESS, MessageConstant.UPDATE_SUCCESS, null);
        }
        return new CommonResult(CodeConstant.ERROR, MessageConstant.FAILURE, null);

    }


}
