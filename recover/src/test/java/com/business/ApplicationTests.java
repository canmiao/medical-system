package com.business;

import com.business.service.PatientService;
import com.business.service.SportDataService;
import com.business.service.UserInfoService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTests {

    @Resource
    private UserInfoService userInfoService;

    @Resource
    private PatientService patientService;

    @Resource
    private SportDataService sportDataService;

    @Test
    void contextLoads() {
    }

    @Test
    public void test01() {
        System.out.println(userInfoService.findByName("admin"));
    }

    @Test
    public void test02() {
        System.out.println(patientService.selectByIdOrName("", null));
    }

    @Test
    public void test03() {
        System.out.println(patientService.findById(1));
    }

    @Test
    public void test04() {
        System.out.println(sportDataService.findByPatientId(1));
    }

}
