package com.business.service.impl;

import com.business.bean.UserInfo;
import com.business.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 池灿淼
 * @date 2020/5/24
 **/
@Service
public class UserInfoServiceImpl implements com.business.service.UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo findByName(String name) {

        System.out.println(name);

        Example example = new Example(UserInfo.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userName", name);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(example);

        if (CollectionUtils.isEmpty(userInfos)) {
            return null;
        }
        return userInfos.get(0);
    }
}
