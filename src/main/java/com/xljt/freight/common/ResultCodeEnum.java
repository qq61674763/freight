package com.xljt.freight.common;

/**
 * @program: freight
 * @description: 响应结果消息
 * @author: XU
 * @create: 2020/4/8
 */
public enum ResultCodeEnum {

    /**
     * 成功
     */
    success(1001, "成功"),

    /**
     * token 认证失败
     */
    tokenFail(2001, "token 认证失败"),

    /**
     * 报文参考号重复
     */
    referenceNumberRepeat(3001, "报文参考号重复"),

    /**
     * ipctype 错误
     */
    ipcTypeFail(3002, "ipctype 错误"),

    /**
     * 发送消息队列失败
     */
    messageQueueFail(3003, "发送消息队列失败"),

    /**
     * 交换报文解析错误
     */
    messageFormatFail(3004, "交换报文解析错误"),

    /**
     * 字段校验失败
     */
    messageFail(3005, "字段校验失败"),

    /**
     * 对称密钥解密失败
     */
    secretFail(3006, "对称密钥解密失败"),

    /**
     * 业务报文解密错误
     */
    ipcTypeSecretFail(3007, "业务报文解密错误"),

    /**
     * 业务报文解析错误
     */
    ipcTypeResolveFail(3008, "业务报文解析错误"),

    /**
     * 服务器内部错误
     */
    serverFail(9001, "服务器内部错误");

    /**
     * 结果码
     */
    private int resultNumber;

    /**
     * 结果消息
     */
    private String resultMsg;

    ResultCodeEnum(int resultNumber, String resultMsg) {
        this.resultNumber = resultNumber;
        this.resultMsg = resultMsg;
    }

}
