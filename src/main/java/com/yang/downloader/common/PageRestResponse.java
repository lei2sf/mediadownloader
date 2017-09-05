package com.yang.downloader.common;

import com.yang.downloader.common.base.BaseRestResponse;

import java.io.Serializable;

/**
 * @author yangl
 * @Description
 * @date 2017/9/4.
 */
public class PageRestResponse<T extends Serializable> extends BaseRestResponse {
    private PageResult<T> result;

    public PageResult<T> getResult() {
        return result;
    }

    public void setResult(PageResult<T> result) {
        this.result = result;
    }
}
