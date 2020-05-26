package com.business.service;

import com.business.bean.UserInfo;

/**
 * 根据用户名查找是否存在系统用户
 * @author 池灿淼
 * @date 2020/5/24
 **/
public interface UserInfoService {

    UserInfo findByName(String name);


}
