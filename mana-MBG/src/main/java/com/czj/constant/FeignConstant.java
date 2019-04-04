package com.czj.constant;

/**
 * @ClassName FeginConstant
 * @Author lee
 * @Time 2018/12/4 16:37.
 */
public class FeignConstant {

    public static final int SUCCESS = 1;

    public static final String SUCCESS_MSG = "操作成功!";

    public static final int ERROR = 2;

    public static final String ERROR_MSG = "车辆未在线, 或信号不好!";

    public static final int TIME_OUT = 3;

    public static final String TIME_OUT_MSG = "通信连接超时";

    public static final int OFFLINE_ERR = 4;

    public static final String OFFLINE_ERR_MSG = "车辆未在线或信号不好";

    public static final int SETUP_SUCCESS = 5;

    public static final String SETUP_SUCCESS_MSG = "设置成功";

    public static final int PUSH_VIDEO_SUCCESS = 11;

    public static final String PUSH_VIDEO_SUCCESS_MSG = "视频推送成功";

    public static final int PUSH_VIDEO_ERR = 12;

    public static final String PUSH_VIDEO_ERR_MSG = "视频推送失败";

    public static final int TAKE_PHOTO_SUCCESS = 21;

    public static final String TAKE_PHOTO_SUCCESS_MSG = "摄像头拍摄成功";

    public static final int TAKE_PHOTO_ERR = 22;

    public static final String TAKE_PHOTO_ERR_MSG = "摄像头拍摄失败! 请检查摄像头后重试!";

    public static final int GET_MAP_DATA_SUCCESS = 90;

    public static final String GET_MAP_DATA_SUCCESS_MSG = "数据获取成功";

    public static final int GET_MAP_DATA_ERR = 91;

    public static final String GET_MAP_DATA_ERR_MSG = "数据获取失败";

}
