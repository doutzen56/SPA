package com.spa.mall.util;

/**
 * @Author: doutzen@163.com
 * @Date: 2021/4/21 16:26
 * @Description:指定响应状态码枚举
 */
public enum RespCode {
    SUCCESS(0, "成功"),
    SYSTEM_ERROR(500, "系统错误");

    private Integer code;
    private String msg;

    RespCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    RespCode() {
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
}