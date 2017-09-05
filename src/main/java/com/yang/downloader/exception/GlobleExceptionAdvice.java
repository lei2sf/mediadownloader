package com.yang.downloader.exception;

import com.yang.downloader.common.base.BaseRestResponse;
import com.yang.downloader.enums.CoreExceptionEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yangl
 * @Description
 * @date 2017/9/4.
 */
@ControllerAdvice
public class GlobleExceptionAdvice {

    private static final Logger logger = LoggerFactory.getLogger(GlobleExceptionAdvice.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public BaseRestResponse errorHandler(Exception e){
        BaseRestResponse baseRestResponse = new BaseRestResponse();
        baseRestResponse.setTimestamp(System.currentTimeMillis());
        if(e instanceof BusinessException){
            baseRestResponse.setCode(((BusinessException) e).getErrCode());
            baseRestResponse.setMessage(e.getMessage());
        }else {
            logger.error("系统异常",e);
            baseRestResponse.setCode(CoreExceptionEnum.SYSTEM_EXCEPTION.getCode());
            baseRestResponse.setMessage(CoreExceptionEnum.SYSTEM_EXCEPTION.getMsg());
        }
        return baseRestResponse;
    }
}
