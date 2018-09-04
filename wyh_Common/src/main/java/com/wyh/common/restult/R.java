package com.wyh.common.restult;

/**
 * @description:
 * @author: Mr.lsf
 * @create: 2018-09-04 22:38
 **/
public class R {
    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public R(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public R() {
    }

    public static R setOK(){
        return new R(1,"OK");
    }
    public static R setERROR(){
        return new R(2,"ERROR");
    }
}
