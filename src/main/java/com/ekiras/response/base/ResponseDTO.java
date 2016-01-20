package com.ekiras.response.base;

/**
 * @author ekansh
 * @since 20/1/16
 */
public abstract class ResponseDTO<T> {

    private T data;
    private String message;
    private Integer code;
    private Integer status;


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
