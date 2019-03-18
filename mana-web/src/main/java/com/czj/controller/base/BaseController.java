package com.czj.controller.base;


import com.czj.common.ResultInfo;
import com.czj.constant.BankConstans;

/**
 * Created by Jon on 2018/4/16 15:23
 */
public class BaseController {

    /**
     * encapsulate success function
     * @return
     */
    protected ResultInfo success() {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setMsg(BankConstans.SUCCESS_MSG);
        resultInfo.setCode(BankConstans.SUCCESS_MSG_CODE);
        return resultInfo;
    }


    /**
     * encapsulate success function
     * @return
     */
    protected ResultInfo success(String msg,Integer code) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setMsg(msg);
        resultInfo.setCode(code);
        return resultInfo;
    }

    /**
     * encapsulate success function
     * @return
     */
    protected ResultInfo success(String msg,Integer code,Object result) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setMsg(msg);
        resultInfo.setCode(code);
        resultInfo.setResult(result);
        return resultInfo;
    }



    /**
     * encapsulate success function
     * @param result
     * @return
     */
    protected ResultInfo success(Object result) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setMsg(BankConstans.SUCCESS_MSG);
        resultInfo.setCode(BankConstans.SUCCESS_MSG_CODE);
        resultInfo.setResult(result);
        return resultInfo;
    }

    /**
     * encapsulate failure function
     * @return
     */
    protected ResultInfo failure(int errorCode, String message) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setMsg(message);
        resultInfo.setCode(errorCode);
        return resultInfo;
    }

    /**
     * encapsulate failure function
     * @return
     */
    protected ResultInfo failure(int errorCode) {
        return failure(errorCode, BankConstans.ERR_MSG);
    }

    /**
     * encapsulate failure function
     * @return
     */
    protected ResultInfo failure(String errorMessage) {
        return failure(BankConstans.ERR_MSG_CODE, errorMessage);
    }



}
