package com.kclm.owep.utils.exceptions;

/**
 * @author Asgard
 * @version 1.0
 * @description: TODO 删除失败异常
 * @date 2023/8/30 15:19
 */
public class DeleteFailureException extends BusinessException {
    private static final String DELETE_FAILURE = "删除失败！";

    public DeleteFailureException(String message) {
        super(501,message);
    }

    public DeleteFailureException() {
        super(501, DELETE_FAILURE);
    }
}
