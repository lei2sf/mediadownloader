package com.yang.downloader.common;

import com.yang.downloader.common.base.BaseResult;

import java.util.List;

/**
 * @author yangl
 * @Description
 * @date 2017/9/4.
 */
public class PageResult<T> extends BaseResult {
    private int currentPage;
    private int totalPage;
    private int pageSize;
    private long totalCount;
    private List<T> items;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}
