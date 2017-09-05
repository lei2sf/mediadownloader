package com.yang.downloader.common;

import com.yang.downloader.common.base.BaseRestRequest;

/**
 * @author yangl
 * @Description
 * @date 2017/9/4.
 */
public class RestRequest<T> extends BaseRestRequest {
    private T param;

    public T getParam() {
        return param;
    }

    public void setParam(T param) {
        this.param = param;
    }
}
