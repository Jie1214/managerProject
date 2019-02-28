package com.czj.terminal.pojo.result;

public class TerminalMediaDataResult extends BaseDto {
    // 多媒体数据ID
    private int id;
    // 多媒体类型
    private byte type;
    // 多媒体格式编码
    private byte formatCode;
    // 事件项编码
    private byte itemCode;
    // 通道ID
    private byte channelId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public byte getFormatCode() {
        return formatCode;
    }

    public void setFormatCode(byte formatCode) {
        this.formatCode = formatCode;
    }

    public byte getItemCode() {
        return itemCode;
    }

    public void setItemCode(byte itemCode) {
        this.itemCode = itemCode;
    }

    public byte getChannelId() {
        return channelId;
    }

    public void setChannelId(byte channelId) {
        this.channelId = channelId;
    }
}
