package com.business.controller;

import com.business.bean.SportData;
import com.business.common.CodeConstant;
import com.business.common.CommonResult;
import com.business.common.MessageConstant;
import com.business.service.SportDataService;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 池灿淼
 * @date 2020/5/24
 **/
@RequestMapping("/sportdata")
@RestController
public class SportDataController {

    @Resource
    private SportDataService sportDataService;

    /**
     * 通过病人id查询历史数据
     * @param id
     * @return
     */
    @GetMapping("/select/by/patientid")
    public CommonResult<List<SportData>> findByPatientId(long id) {
        List<SportData> list = sportDataService.findByPatientId(id);

        if (CollectionUtils.isEmpty(list)) {
            return new CommonResult<>(CodeConstant.ERROR, MessageConstant.IS_NOT_EXIST, null);
        }

        return new CommonResult<>(CodeConstant.SUCCESS, MessageConstant.SELECT_SUCCESS, list);
    }

}
