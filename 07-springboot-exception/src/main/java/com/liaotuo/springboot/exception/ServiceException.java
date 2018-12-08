package com.liaotuo.springboot.exception;

/**
 * @author 18070959
 * @create 2018-12-08 3:16 PM
 * @desc 服务异常类
 **/
public class ServiceException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private int code;
    private String message;

    public ServiceException(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}