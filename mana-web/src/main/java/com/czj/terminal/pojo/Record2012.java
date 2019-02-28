package com.czj.terminal.pojo;

import java.util.Arrays;

//行驶记录数据采集上传数据
public class Record2012 {

    //起始字头 0x55
    private int fristCode;
    //起始字头 0x7A
    private int secondCode;
    //命令字 1byte
    private int commandWord;
    //数据块长度 2byte
    private int bodyLength;
    //保留位 0x00
    private int keepWord;
    //数据块内容
    private byte[] body;
    //校验码
    private int checkNumber;

    public int getFristCode() {
        return fristCode;
    }

    public void setFristCode(int fristCode) {
        this.fristCode = fristCode;
    }

    public int getSecondCode() {
        return secondCode;
    }

    public void setSecondCode(int secondCode) {
        this.secondCode = secondCode;
    }

    public int getCommandWord() {
        return commandWord;
    }

    public void setCommandWord(int commandWord) {
        this.commandWord = commandWord;
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }

    public int getKeepWord() {
        return keepWord;
    }

    public void setKeepWord(int keepWord) {
        this.keepWord = keepWord;
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }

    public int getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(int checkNumber) {
        this.checkNumber = checkNumber;
    }

    @Override
    public String toString() {
        return "Record2012{" +
                "fristCode=" + fristCode +
                ", secondCode=" + secondCode +
                ", commandWord=" + commandWord +
                ", bodyLength=" + bodyLength +
                ", keepWord=" + keepWord +
                ", body=" + Arrays.toString(body) +
                ", checkNumber=" + checkNumber +
                '}';
    }
}
