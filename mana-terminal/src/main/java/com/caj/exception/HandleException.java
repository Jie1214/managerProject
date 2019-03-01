package com.caj.exception;

import com.caj.constant.WebConstants;
import com.caj.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * 异常处理
 * @author Levince
 * @ClassName: HandleException
 * @Description: TODO
 * @since 2018年6月04日
 */
@RestControllerAdvice
public class HandleException {
	
	private static Logger log = LoggerFactory.getLogger(HandleException.class);
	
	@ExceptionHandler(value= ParamException.class)
	public Map<String ,Object> handleException(ParamException exception){
		log.error("ParamException:{}", exception);
		Map<String ,Object> result = new HashMap<>();
		int code = exception.getErrorCode();
		result.put("code", code);
		String msg = exception.getMessage();
		if (StringUtils.isBlank(msg)) {
			msg = WebConstants.ERR_MSG;
		}
		result.put("msg", msg);
		return result;
	}

}
