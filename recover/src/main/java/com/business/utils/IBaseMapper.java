package com.business.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * mybatis增强
 * @author 池灿淼
 * @date 2020/5/23
 **/
public interface IBaseMapper<T> extends Mapper<T>, MySqlMapper<T> {}
