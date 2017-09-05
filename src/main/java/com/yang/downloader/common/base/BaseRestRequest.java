package com.yang.downloader.common.base;

import java.io.Serializable;

/**
 * @author yangl
 * @Description
 * @date 2017/9/4.
 */
public class BaseRestRequest implements Serializable {
    private Integer loginId;

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }
}
