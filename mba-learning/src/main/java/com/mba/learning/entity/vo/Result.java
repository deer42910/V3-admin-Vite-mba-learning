package com.mba.learning.entity.vo;

import lombok.Data;

@Data
public class Result<T> {
    private boolean success;
    private String message;
    private T data;

    public static <T> Result<T> success(T data) {
        Result<T> response = new Result<>();
        response.setSuccess(true);
        response.setData(data);
        return response;
    }

    public static <T> Result<T> error(String message) {
        Result<T> response = new Result<>();
        response.setSuccess(false);
        response.setMessage(message);
        return response;
    }
}
