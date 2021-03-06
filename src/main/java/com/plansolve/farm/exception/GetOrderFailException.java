package com.plansolve.farm.exception;

import com.plansolve.farm.model.enums.code.ResultEnum;

/**
 * @Author: 高一平
 * @Date: 2018/6/1
 * @Description: 操作已删除对象所抛异常
 **/

public class GetOrderFailException extends RuntimeException {

    private Integer code = ResultEnum.GET_ORDER_FAIL.getCode();

    public GetOrderFailException(String message) {
        super(ResultEnum.GET_ORDER_FAIL.getMessage() + message);
    }

    public Integer getCode() {
        return code;
    }

}
