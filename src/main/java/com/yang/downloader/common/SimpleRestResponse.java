package com.yang.downloader.common;

import com.yang.downloader.common.base.BaseRestResponse;

/**
 * @author yangl
 * @Description
 * @date 2017/9/4.
 */
public class SimpleRestResponse extends BaseRestResponse {
    private String result;

    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
