package com.caj.constant;

/**
 * @ClassName MediaConstants
 * @Author lee
 * @Time 2019/1/24 11:21.
 */
public class MediaConstants {

    // 摄像头拍摄命令ID
    public static final String MEDIA_TAKE_PHOTO_MID = "0x8801";
    // 多媒体数据上传ID
    public static final String MEDIA_UPLOAD_MID = "0x0801";
    // 当前在上传的媒体信息
    public static final String UPLOAD_CONTEXT = "context";
    // 当前在上传的媒体信息
    public static final String UPLOAD_INFO = "info";
    // 当前在上传的媒体数据
    public static final String UPLOAD_DATA = "data";

    // 失败
    public static  final int FAIL = 0;
    // 进行中
    public static final int UPLOADING = 1;
    // 完成
    public static final int FINISH = 2;

}
