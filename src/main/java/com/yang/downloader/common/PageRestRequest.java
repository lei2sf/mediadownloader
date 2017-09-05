package com.yang.downloader.common;

/**
 * @author yangl
 * @Description
 * @date 2017/9/4.
 */
public class PageRestRequest<T> extends RestRequest<T> {
    private PageParam pageParam;

    public PageParam getPageParam() {
        return pageParam;
    }

    public void setPageParam(PageParam pageParam) {
        this.pageParam = pageParam;
    }
}
