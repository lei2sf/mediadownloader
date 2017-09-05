package com.yang.downloader.common;

import java.io.Serializable;

/**
 * @author yangl
 * @Description
 * @date 2017/9/4.
 */
public class PageParam implements Serializable {
    private int pageSize;
    private int currentPage;
    private boolean isPage;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public boolean isPage() {
        return isPage;
    }

    public void setPage(boolean page) {
        isPage = page;
    }
}
