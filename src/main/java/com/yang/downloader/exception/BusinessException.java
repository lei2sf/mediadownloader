package com.yang.downloader.exception;

import com.yang.downloader.enums.CoreExceptionEnum;


/**
 * @author yangl
 * @Description
 * @date 2017/9/4.
 */
public class BusinessException extends RuntimeException {
    private String errCode;
    public BusinessException(CoreExceptionEnum coreExceptionEnum) {
        super(coreExceptionEnum.getMsg());
        this.errCode = coreExceptionEnum.getCode();
    }

    public String getErrCode() {
        return errCode;
    }
}
