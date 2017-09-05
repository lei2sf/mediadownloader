package com.yang.downloader.common;

import com.yang.downloader.common.base.BaseRestResponse;

import java.util.List;

/**
 * @author yangl
 * @Description
 * @date 2017/9/4.
 */
public class ListRestResponse<T> extends BaseRestResponse {
    private List<T> items;

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}
