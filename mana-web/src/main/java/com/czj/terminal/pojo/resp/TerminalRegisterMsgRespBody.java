package com.czj.terminal.pojo.resp;

public class TerminalRegisterMsgRespBody {

	public static final byte success = 0;
	public static final byte car_already_registered = 1;
	public static final byte car_not_found = 2;
	public static final byte terminal_already_registered = 3;
	public static final byte terminal_not_found = 4;
	// byte[0-1] 应答流水号(WORD) 对应的终端注册消息的流水号
	private int replyFlowId;
	/***
	 * byte[2] 结果(BYTE) <br>
	 * 0：成功<br>
	 * 1：车辆已被注册<br>
	 * 2：数据库中无该车辆<br> == 数据库中该车辆已注销 即是数据库terminal_register_info 中status=2
	 * 3：终端已被注册<br>
	 * 4：数据库中无该终端<br>== 数据库中该终端已注销 即是数据库terminal_register_info 中status=2
	 **/
	private byte resultCode;
	// byte[3-x] 鉴权码(STRING) 只有在成功后才有该字段
	private String replyToken;

	public TerminalRegisterMsgRespBody() {
	}

	public int getReplyFlowId() {
		return replyFlowId;
	}

	public void setReplyFlowId(int flowId) {
		this.replyFlowId = flowId;
	}

	public byte getResultCode() {
		return resultCode;
	}

	public void setResultCode(byte resultCode) {
		this.resultCode = resultCode;
	}

	public String getReplyToken() {
		return replyToken;
	}

	public void setReplyToken(String token) {
		this.replyToken = token;
	}

	@Override
	public String toString() {
		return "TerminalRegisterMsgResp [replyFlowId=" + replyFlowId + ", resultCode=" + resultCode + ", replyToken="
				+ replyToken + "]";
	}

}
