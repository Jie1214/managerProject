package com.czj.base;


import com.czj.common.ResultInfo;
import com.czj.constant.FeignConstant;
import com.czj.constant.WebConstants;

/**
 * Created by Jon on 2018/4/16 15:23
 */
public class BaseController {

    /**
     * encapsulate success function
     *
     * @return
     */
    protected ResultInfo success() {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setMsg(WebConstants.SUCCESS_MSG);
        resultInfo.setCode(WebConstants.SUCCESS_MSG_CODE);
        return resultInfo;
    }


    /**
     * encapsulate success function
     *
     * @return
     */
    protected ResultInfo success(String msg, Integer code) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setMsg(msg);
        resultInfo.setCode(code);
        return resultInfo;
    }

    /**
     * encapsulate success function
     *
     * @return
     */
    protected ResultInfo success(Integer code, Object result) {
        ResultInfo resultInfo = feignResult(code);
        resultInfo.setResult(result);
        return resultInfo;
    }

    /**
     * encapsulate success function
     *
     * @return
     */
    protected ResultInfo success(String msg, Integer code, Object result) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setMsg(msg);
        resultInfo.setCode(code);
        resultInfo.setResult(result);
        return resultInfo;
    }


    /**
     * encapsulate success function
     *
     * @param result
     * @return
     */
    protected ResultInfo success(Object result) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setMsg(WebConstants.SUCCESS_MSG);
        resultInfo.setCode(WebConstants.SUCCESS_MSG_CODE);
        resultInfo.setResult(result);
        return resultInfo;
    }

    /**
     * encapsulate failure function
     *
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
     *
     * @return
     */
    protected ResultInfo failure(int errorCode) {
        return failure(errorCode, WebConstants.ERR_MSG);
    }

    /**
     * encapsulate failure function
     *
     * @return
     */
    protected ResultInfo failure(String errorMessage) {
        return failure(WebConstants.ERR_MSG_CODE, errorMessage);
    }


    public ResultInfo feignResult(int code) {
        ResultInfo resultInfo = new ResultInfo();

        switch (code) {
            case FeignConstant.SUCCESS:  // 成功
                resultInfo.setCode(WebConstants.SUCCESS_MSG_CODE);
                resultInfo.setMsg(FeignConstant.SUCCESS_MSG);
                break;
            case FeignConstant.PUSH_VIDEO_SUCCESS: // 视频推送成功
                resultInfo.setCode(WebConstants.SUCCESS_MSG_CODE);
                resultInfo.setMsg(FeignConstant.PUSH_VIDEO_SUCCESS_MSG);
                break;
            case FeignConstant.PUSH_VIDEO_ERR: // 视频推送失败
                resultInfo.setCode(WebConstants.ERR_MSG_CODE);
                resultInfo.setMsg(FeignConstant.PUSH_VIDEO_ERR_MSG);
                break;
            case FeignConstant.TIME_OUT: // 超时
                resultInfo.setCode(WebConstants.ERR_MSG_CODE);
                resultInfo.setMsg(FeignConstant.TIME_OUT_MSG);
                break;
            case FeignConstant.OFFLINE_ERR: // 车辆离线
                resultInfo.setCode(WebConstants.ERR_JPUSH_CODE);
                resultInfo.setMsg(FeignConstant.OFFLINE_ERR_MSG);
                break;
            case FeignConstant.SETUP_SUCCESS:   // 设置成功
                resultInfo.setCode(WebConstants.SUCCESS_MSG_CODE);
                resultInfo.setMsg(FeignConstant.SETUP_SUCCESS_MSG);
                break;
            case FeignConstant.GET_MAP_DATA_SUCCESS: // 获取高德数据成功
                resultInfo.setCode(WebConstants.SUCCESS_MSG_CODE);
                resultInfo.setMsg(FeignConstant.GET_MAP_DATA_SUCCESS_MSG);
                break;
            case FeignConstant.GET_MAP_DATA_ERR: // 获取高德数据失败
                resultInfo.setCode(WebConstants.ERR_MSG_CODE);
                resultInfo.setMsg(FeignConstant.GET_MAP_DATA_ERR_MSG);
                break;
            default: // 失败
                resultInfo.setCode(WebConstants.ERR_MSG_CODE);
                resultInfo.setMsg(FeignConstant.ERROR_MSG);
                break;
        }

        return resultInfo;
    }

    public ResultInfo feignResult(int code, Object result) {
        ResultInfo resultInfo = feignResult(code);
        resultInfo.setResult(result);
        return resultInfo;
    }

    public String getFeignMsg(int feignCode) {
        switch (feignCode) {
            case FeignConstant.SUCCESS:  // 成功
                return FeignConstant.SUCCESS_MSG;
            case FeignConstant.PUSH_VIDEO_SUCCESS: // 视频推送成功
                return FeignConstant.PUSH_VIDEO_SUCCESS_MSG;
            case FeignConstant.PUSH_VIDEO_ERR: // 视频推送失败
                return FeignConstant.PUSH_VIDEO_ERR_MSG;
            case FeignConstant.TIME_OUT: // 超时
                return FeignConstant.TIME_OUT_MSG;
            case FeignConstant.OFFLINE_ERR: // 车辆离线
                return FeignConstant.OFFLINE_ERR_MSG;
            default: // 失败
                return FeignConstant.ERROR_MSG;

        }

    }
}
