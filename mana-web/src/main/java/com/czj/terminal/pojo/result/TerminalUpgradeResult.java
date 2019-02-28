package com.czj.terminal.pojo.result;

public class TerminalUpgradeResult extends BaseDto {
    // 升级类型 0: 终端 12: 道路运输证 52: 北斗卫星定位模块
    private byte type;
    // 升级结果 0: 成功 1: 失败 2: 取消
    private byte result;

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public byte getResult() {
        return result;
    }

    public void setResult(byte result) {
        this.result = result;
    }
}
