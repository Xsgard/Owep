package com.kclm.owep.utils.exceptions;

/**
 * @author Asgard
 * @version 1.0
 * @description: TODO
 * @date 2023/9/2 9:52
 */
public class ParameterWrongException extends BusinessException {
    //
    private static final String MSG = "出现参数异常，请检查！";
    //
    private static final String WRONG_PARAM_MSG = "参数错误！";
    //
    private static final String NULL_PARAM_MSG = "参数为空！";
    //

    private String msg;

    public ParameterWrongException(String message) {
        super(message);
        this.msg = MSG;
    }

    public ParameterWrongException(Integer code, String message) {
        super(code, message);
        if (code == 501)
            this.msg = WRONG_PARAM_MSG;
        if (code == 502)
            this.msg = NULL_PARAM_MSG;
    }

    public String getMsg(){
        return msg;
    }
}
