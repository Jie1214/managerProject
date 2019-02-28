package com.czj.constant;

import java.nio.charset.Charset;

public class TerminalConstant {

	public static final String SIGN = "GNSS_";

	public static final String GBK_CHARSET = "GBK";
	public static final String UTF_CHARSET = "UTF-8";

	public static final Charset CHARSET_KEY = Charset.forName(GBK_CHARSET);
	// 标识位
	public static final int pkg_delimiter = 0x7e;
	// 客户端发呆15分钟后,服务器主动断开连接
	public static int tcp_client_idle_minutes = 15;

	// 8.1 终端通用应答
	public static final int TERMINAL_RESPONSE = 0x0001;

	// 胎压数据透传
	public static final int msg_id_terminal_transmission_tyre_pressure = 0x0600;




	// 8.3 终端心跳
	public static final int TERMINAL_HEART_BEAT = 0x0002;
	// 平台通用应答
	public static final int COMMON_RESP = 0x8001;
	// 8.9 设置终端参数
	public static final int TERMINAL_PARAM_SETTINGS = 0X8103;
	// 查询终端属性
	public static final int TERMINAL_ATTRIBUTE_REQ = 0x8107;
	// 8.15 查询终端属性应答
	public static final int TERMINAL_ATTRIBUTE_RESP = 0x0107;
	// 上报驾驶员身份信息请求
	public static final int DRIVER_REQ = 0x8702;
	// 驾驶员身份信息采集上报
	public static final int DRIVER_RESP = 0x0702;
	//行驶记录数据采集命令
	public static final int DRIVER_RECORD_REQ = 0x8700;
	//行驶记录数据上传
	public static final int DRIVER_RECORD_RESP= 0x0700;
	// 电子运单上报 8.46
	public static final int ELECTRONIC_WAYBILL_RESP = 0x0701;
	// 音视频总参数设置
	public static final int AUDIO_VIDEO_COUNT = 0x0075;
	// 音视频通道列表
	public static final int AUDIO_VIDEO_CHANNEL = 0x0076;
	// 单独视频通道参数设置
	public static final int SINGLE_AUDIO_VIDEO_CHANNEL = 0x0077;
	// 特殊报警录像参数设置
	public static final int SPECIAL_REPORT_POLICE = 0x0079;
	// 视频相关报警屏蔽字
	public static final int VIDEO_ALARM_MASK = 0x007A;
	// 图像分析报警参数设置
	public static final int IMAGE_ANALYSIS = 0x007B;
	//终端休眠唤醒模式设置
	public static final int WAKE_UP_TERMINAL = 0x007C;
	// 8.11 查询执行终端参数
	public static final int SPECIFIED_TERMINAL_PARAMS = 0x8106;
	// 查询终端参数应答
	public static final int SELECT_TERMINAL_RESP = 0x0104;
	// 查询终端音视频属性
	public static final int TERMINAL_AUDIO_VIDEO_ATTR = 0x9003;
	// 终端上传音视频属性
	public static final int Terminal_AUDIO_VIDEO_RESP = 0x1003;
	// 终端上传乘客流量
	public static final int PASSENGER_TRAFFIC = 0x1005;
	// 实时视频传输请求
	public static final int AUDIO_VIDEO_TRANSPORT = 0x9101;
	// 音视频实时传输控制
	public static final int AUDIO_VIDEO_CONTROL = 0x9102;
	// 终端上传音视频资源列表
	public static final int AUDIO_VIDEO_RESOURCE = 0x9205;


	// 终端注册 8.5
	public static final int TERMINAL_REGISTER = 0x0100;
	// 终端注册应答 8.6
	public static final int TERMINAL_REGISTER_RESP = 0x8100;
	// 终端注销 8.7
	public static final int TERMINAL_LOG_OUT = 0x0003;
	// 终端鉴权 8.8
	public static final int TERMINAL_AUTHENTICATION = 0x0102;
	// 位置信息汇报 8.18
	public static final int LOCATION_INFO_UPLOAD = 0x0200;

	// 查询终端参数 8.10
	public static final int CMD_TERMINAL_PARAM_QUERY = 0x8104;
	// 查询终端参数应答 8.12
	public static final int QUERY_TERMINAL_PARAM_RESULT = 0x0104;
	// 终端控制 8.13

	public static final int TERMINAL_CONTROL = 0x8105;
	// 下发终端升级包 8.16
	public static final int TERMINAL_UPGRADE_PACKAGE = 0x8108;
	// 终端升级结果通知 8.17
	public static final int TERMINAL_UPGRADE_RESULT = 0x0108;
	// 位置信息查询 8.19
	public static final int TERMINAL_LOCATION_INFO = 0x8201;
	// 位置信息查询应答 8.20
	public static final int TERMINAL_LOCATION_INFO_RESULT = 0x0201;
	// 临时位置跟踪控制 8.21
	public static final int TEMPORARY_POSITION_TRACKING_CONTROL = 0x8202;
	// 人工确认报警消息 8.22
	public static final int CONFIRM_ALARM = 0x8203;
	// 文本信息下发 8.23
	public static final int TEXT_MESSAGE_RELEASE = 0x8300;
	// 事件设置 8.24
	public static final int EVENT_SETTING = 0x8301;
	// 事件报告 8.25
	public static final int EVENT_REPORT = 0x0301;
	// 提问下发 8.26
	public static final int SEND_QUESTIONS = 0x8302;
	// 提问应答 8.27
	public static final int SEND_QUESTIONS_RESULT = 0x0302;
	// 信息点播菜单 8.28
	public static final int INFORMATION_ON_DEMAND_MENU = 0x8303;
	// 信息点播/取消 8.29
	public static final int INFORMATION_DEMAND_CANCELLATION = 0x0303;
	// 信息服务 8.30
	public static final int INFO_SERVICE = 0x8304;
	// 电话回拨 8.31
	public static final int TELEPHONE_CALL_BACK = 0x8400;
	// 设置电话本 8.32(未测)
	public static final int SETUP_PHONE_BOOK = 0x8401;
	// 车辆控制 8.33(未测)
	public static final int VEHICLE_CONTROL = 0x8500;
	// 车辆控制应答 8.34(未测)
	// TODO: 2018/10/8 结果暂不处理
	public static final int VEHICLE_CONTROL_RESULT = 0x0500;
	// 设置圆形区域 8.35(未测)
	public static final int SET_CIRCULAR_AREA = 0x8600;
	// 删除圆形区域 8.36(未测)
	public static final int DELETE_CIRCULAR_AREA = 0x8601;
	// 设置矩形区域 8.37(未测)
	public static final int SET_RECTANGULAR_AREA = 0x8602;
	// 删除矩形区域 8.38(未测)
	public static final int DELETE_RECTANGULAR_AREA = 0x8603;
	// 设置多边形区域 8.39(未测)
	public static final int SET_POLYGON_AREA = 0x8604;
	// 删除多边形区域 8.40(未测)
	public static final int DELETE_POLYGON_AREA = 0x8605;
	// 设置路径 8.41(未测)
	public static final int SETUP_PATH = 0x8606;
	// 删除路径 8.42(未测)
	public static final int DELETE_PATH = 0x8607;

	// 定位数据批量上传(未测) 8.49(未测)
	public static final int BATCH_UPLOADING_LOCATION_DATA = 0x0704;
	// CAN总线数据上传 8.50(未测)
	public static final int CAN_BUS_DATA_UPLOAD = 0x0705;
	// 多媒体事件信息上传 8.51(未测)
	public static final int MEDIA_EVENT_INFO_UPLOAD = 0x0800;
	// 多媒体数据上传 8.52(未测)
	public static final int MEDIA_DATA_UPLOAD = 0x0801;
	// 多媒体数据上传应答 8.53(未测)
	public static final int MEDIA_DATA_UPLOAD_RESP = 0x8800;
	// 摄像头立即拍摄命令 8.54
	public static final int CAMERA_SHOOTING = 0x8801;
	// 摄像头立即拍摄命令应答
	public static final int CAMERA_SHOOTING_RESULT = 0x0805;
	// 存储多媒体数据检索 8.56(未测)
	public static final int CACHE_MEDIA_DATA_SEARCH = 0x8802;
	// 存储多媒体数据检索应答 8.57(未测)
	public static final int CACHE_MEDIA_DATA_SEARCH_RESULT = 0x0802;
	// 存储多媒体数据上传命令 8.58(未测)
	public static final int CACHE_MEDIA_DATA_UPLOAD_COMM = 0x8803;
	// 录音开始命令 8.59(未测)
	public static final int SOUND_RECORD_COMM = 0x8804;
	// 单条存储多媒体数据检索上传命令 8.60(未测)
	public static final int SINGLE_CACHE_MEDIA_SEARCH_UPLOAD = 0x8805;
	// 数据下行透传 8.61(未测)
	public static final int DATA_DOWN_LINK_PENETRATION = 0x8900;
	// 数据上行透传 8.62(未测)
	public static final int DATA_UP_LINK_PENETRATION = 0x8900;
	// 数据压缩上报 8.63(未测)
	// TODO: 2018/10/10 压缩数据暂未处理
	public static final int DATA_COMPRESS_REPORT = 0x0901;

}
