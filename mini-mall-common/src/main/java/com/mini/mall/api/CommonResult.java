package com.mini.mall.api;

/**
 * @author n-cz
 * @version CommonResult.class, v 0.1 2020/3/28 18:49 n-cz Exp$
 */
public class CommonResult<T> {
    private boolean success;
    private String code;
    private String message;
    private T data;

    public CommonResult(boolean success, String code, String message, T data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
    }


}
