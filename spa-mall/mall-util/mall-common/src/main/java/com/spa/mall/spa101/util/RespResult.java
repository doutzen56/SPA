package com.spa.mall.spa101.util;

import java.io.Serializable;

/**
 * @Author: doutzen@163.com
 * @Date: 2021/4/21 16:38
 * @Description:响应信息封装
 */
public class RespResult<T> implements Serializable {
    /**
     * 响应数据
     */
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 状态码
     */
    private Integer code;
    /**
     * 响应信息
     */
    private String msg;

    public RespResult() {
    }

    public RespResult(RespCode code) {
        this.code = code.getCode();
        this.msg = code.getMsg();
    }

    public RespResult(T data, RespCode code) {
        this.data = data;
        this.code = code.getCode();
        this.msg = code.getMsg();
    }

    public static RespResult ok() {
        return new RespResult(null, RespCode.SUCCESS);
    }

    public static RespResult ok(Object data) {
        return new RespResult(data, RespCode.SUCCESS);
    }

    public static RespResult error() {
        return new RespResult(null, RespCode.SYSTEM_ERROR);
    }

    public static RespResult error(String msg) {
        return secByError(RespCode.SYSTEM_ERROR.getCode(), msg);
    }

    public static RespResult secByError(Integer code, String msg) {
        RespResult error = new RespResult();
        error.setCode(code);
        error.setMsg(msg);
        return error;
    }

    public static RespResult error(RespCode code) {
        return new RespResult(code);
    }
}
