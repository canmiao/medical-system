package com.business.common;

/**
 * @Author: ccm
 * @Description:
 * @Date: 2020/05/24
 */
public class CodeConstant {
    /**
     * 成功
     */
    public static final int SUCCESS = 1;


    /**
     * 失败
     */
    public static final int ERROR = -1;

    /**
     * 冲突
     */
    public static final int CONFLICT = 2;

    /**
     * 更新失败! 请刷新页面后再试
     */
    public static final int UPDATE_FAIL_VERSION = -2;

    /**
     * 警告
     */
    public static final int WARN = -3;

    /**
     * 参数错误
     */
    public static final int ERROR_PARAMETER = -1000;

    /**
     * 信息不存在
     */
    public static final int NOT_EXIST = -1001;

    /**
     * 信息已经存在
     */
    public static final int ALREADY_EXIST = -1002;

    /**
     * 已经绑定
     */
    public static final int ALREADY_BIND = -10;
}
