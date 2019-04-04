package com.czj.constant;

/**
 * Created by levince on 2018/6/4.
 * 安全智能云平台的状态码
 */
public class WebConstants {

    public static final int SUCCESS_MSG_CODE = 2000; //操作成功状态码统称
    public static final int ERR_MSG_CODE = 3000;     //操作失败状态码统称
    public static final int ERR_LOGIN_CODE = 3001;   //拦截器错误码
    public static final int ERR_JPUSH_CODE = 3002;   //推送失败code
    public static final int ERR_RESULT_INFO_CODE = 3005;   //推送失败code
    public static final int ERR_PARAMETER_CODE = 3006;   // 参数有误

    public static final String SUCCESS_MSG = "操作成功！";
    public static final String ERR_MSG = "操作失败！";
    public static final String ERR_LOGIN_MSG = "请重新登陆！";
    public static final String ERR_RESULT_INFO_MSG = "暂无数据！";
    public static final String ERR_PARAMETER_MSG = "参数有误！";

    //登陆成功后添加cookie
    public static final String  LOGIN_FIRST = "未登录";

    // 一天的秒数
    public static final long DAY_SECOND = 60 * 60 * 24;
    // 一天的毫秒数
    public static final long DAY_MILLISECOND = DAY_SECOND * 1000;
}
