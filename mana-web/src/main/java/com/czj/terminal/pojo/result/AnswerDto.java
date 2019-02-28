package com.czj.terminal.pojo.result;

/**
 * @ClassName AnswerReq
 * @Author lee
 * @Time 2018/12/9 13:33.
 */
public class AnswerDto {

    private Integer flowId;

    private Integer answerId;

    private String vehicleId;

    public Integer getFlowId() {
        return flowId;
    }

    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
}
