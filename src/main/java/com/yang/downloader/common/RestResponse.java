package com.yang.downloader.common;

import com.yang.downloader.common.base.BaseRestResponse;

/**
 * @author yangl
 * @Description
 * @date 2017/9/4.
 */
public class RestResponse<T> extends BaseRestResponse {
    private T result;

    public T getResult() {
        return this.result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
