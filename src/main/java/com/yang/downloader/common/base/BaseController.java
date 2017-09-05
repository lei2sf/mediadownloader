package com.yang.downloader.common.base;

import com.yang.downloader.common.*;
import com.yang.downloader.enums.CoreExceptionEnum;

import java.io.Serializable;
import java.util.List;

/**
 * @author yangl
 * @Description
 * @date 2017/9/4.
 */
public class BaseController {
    public <T extends Serializable> PageRestResponse<T> createResponse(PageResult<T> result) {
        PageRestResponse response = new PageRestResponse();
        this.initResponse(response);
        response.setResult(result);
        return response;
    }

    protected <T> ListRestResponse<T> createResponse(List<T> items) {
        ListRestResponse response = new ListRestResponse();
        this.initResponse(response);
        response.setItems(items);
        return response;
    }

    protected SimpleRestResponse createResponse(String result) {
        SimpleRestResponse response = new SimpleRestResponse();
        this.initResponse(response);
        response.setResult(result);
        return response;
    }

    protected BaseRestResponse createResponse() {
        BaseRestResponse response = new BaseRestResponse();
        this.initResponse(response);
        return response;
    }

    protected <T> RestResponse<T> createResponse(T entity) {
        RestResponse response = new RestResponse();
        this.initResponse(response);
        response.setResult(entity);
        return response;
    }

    private void initResponse(BaseRestResponse response) {
        response.setCode(CoreExceptionEnum.REQUEST_SUCCESS.getCode());
        response.setMessage(CoreExceptionEnum.REQUEST_SUCCESS.getMsg());
        response.setTimestamp(System.currentTimeMillis());
    }
}
