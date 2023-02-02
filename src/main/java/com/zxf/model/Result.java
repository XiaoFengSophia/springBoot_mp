package com.zxf.model;

import com.zxf.enums.Status;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author:zxf
 * @create: 2023-01-30 10:50
 * @Description: 返回结果封装
 * @Company: 白云信科·研发中心·研发三室
 */
@Data
public class Result<T> implements Serializable {

    // 状态码
    private Integer code;
    // 消息
    private String message;
    // 数据对象
    private Object result;

    private Integer total;

    /**
     * 无参构造器
     */
    public Result() {
        super();
    }

    public Result(Status status) {
        super();
        this.code = status.code;
        this.message = status.message;
    }

    public Result result(Object result) {
        this.result = result;
        return this;
    }

    public Result message(String message) {
        this.message = message;
        return this;
    }
    public Result total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 只返回状态，状态码，消息
     *
     * @param code
     * @param message
     */
    public Result(Integer code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    /**
     * 只返回状态，状态码，数据对象
     *
     * @param code
     * @param result
     */
    public Result(Integer code, Object result) {
        super();
        this.code = code;
        this.result = result;
    }

    /**
     * 返回全部信息即状态，状态码，消息，数据对象
     *
     * @param code
     * @param message
     * @param result
     */
    public Result(Integer code, String message, Object result) {
        super();
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public static<T> Result<T> ok() {
        Result<T> result = new Result<T>();
        result.setCode(1);
        result.setMessage(Status.SUCCESS.message);
        return result;
    }

    public static<T> Result<T> ok(String msg) {
        Result<T> result = new Result<T>();
        result.setCode(1);
        result.setResult(new ArrayList<>());
        result.setMessage(msg);
        return result;
    }

    public static<T> Result<T> ok(T data) {
        Result<T> result = new Result<T>();
        result.setCode(1);
        result.setMessage(Status.SUCCESS.message);
        result.setResult(data);
        return result;
    }

    public static<T> Result<T> ok(String msg, T data) {
        Result<T> result = new Result<T>();
        result.setCode(1);
        result.setMessage(msg);
        result.setResult(data);
        return result;
    }
}
