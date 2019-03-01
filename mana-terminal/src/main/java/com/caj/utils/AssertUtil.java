package com.caj.utils;

import com.caj.exception.ParamException;

public class AssertUtil {

	public static void isNotNull(Object value, int code, String... message){
		String msg = loadMsg(message);

		if(StringUtils.isBlank(value)) {
			throw new ParamException(code, msg);
		}
	}

	public static void isNotNull(Object value, String... message){
		String msg = loadMsg(message);
		
		if(StringUtils.isBlank(value)) {
			throw new ParamException(msg);
		}
	}

	public static void isTrue(boolean expression, int code, String... message){
		String msg = loadMsg(message);
		if(expression){
			throw new ParamException(code, msg);
		}
	}

	public static void isTrue(boolean expression, String... message){
		String msg = loadMsg(message);
		if(expression){
			throw new ParamException(msg);
		}
	}
	
	public static void isNull(Object object, String... message) {
		String msg = loadMsg(message);
		if (StringUtils.isNotBlank(object)) {
			throw new ParamException(msg);
		}
	}
	
	private static String loadMsg (String... message) {
		String msg = "";
		if (message != null && message.length > 0 && StringUtils.isNotBlank(message[0])) {
			msg = message[0];
		} else {
			msg = "Opps, something wrong!";
		}
		return msg;
	}
}
