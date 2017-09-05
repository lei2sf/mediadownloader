package com.yang.downloader.common.base;

import java.io.Serializable;

/**
 * @author yangl
 * @Description
 * @date 2017/9/4.
 */
public class BaseRestResponse implements Serializable {
    private String code;
    private String message;
    private long timestamp;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
