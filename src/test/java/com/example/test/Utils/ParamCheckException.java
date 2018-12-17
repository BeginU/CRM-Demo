package com.example.test.Utils;

/**
*  参数校验异常类
* @author lumingming
* @date 2018/9/29
* @version 1.0
*/
public class ParamCheckException extends RuntimeException{
    private static final long serialVersionUID = 477399363086602985L;
    private String code;
    private String message;

    public ParamCheckException(String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public ParamCheckException(Throwable e, String code, String message) {
        super(e);
        this.code = code;
        this.message = message;
    }

    public ParamCheckException(String message) {
        super(message);
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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
