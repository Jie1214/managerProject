package com.czj.exception;

import com.czj.constant.BankConstans;
import com.czj.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 异常处理
 * @author Levince
 * @ClassName: HandleException
 * @Description: TODO
 * @since 2018年6月04日
 */
@ControllerAdvice
public class HandleException {

	private static Logger log = LoggerFactory.getLogger(HandleException.class);
	
	@ResponseBody
	@ExceptionHandler(value= ParamException.class)
	public Map<String ,Object> handleException(ParamException exception){
		log.error("ParamException:{}", exception);
		Map<String ,Object> result = new HashMap<>();
		int code = exception.getErrorCode();
		result.put("code", code);
		String msg = exception.getMessage();
		if (StringUtils.isBlank(msg)) {
			msg = BankConstans.ERR_MSG;
		}
		result.put("msg", msg);
		return result;
	}

}
