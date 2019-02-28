package com.czj.terminal.pojo.socket;

/**
 * @ClassName SocketResult
 * @Author lee
 * @Time 2018/11/20 17:05.
 */
public class SocketResult {
    // 类型
    private String type;
    // 结果
    private Object result;

    public SocketResult() {}
    public SocketResult(String type, Object result) {
        this.type = type;
        this.result = result;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
