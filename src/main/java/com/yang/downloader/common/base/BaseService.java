package com.yang.downloader.common.base;

import com.yang.downloader.common.PageRestRequest;
import com.yang.downloader.common.PageResult;

import java.io.Serializable;
import java.util.List;

/**
 * @author yangl
 * @Description
 * @date 2017/9/4.
 */
public interface BaseService<T extends BaseEntity,PK> {
    int save(T entity);

    void remove(PK id);

    void remove(List<PK> ids);

    boolean exists(T condition);

    <R extends Serializable, P> PageResult<R> findPage(PageRestRequest<P> pageRestRequest);

    <R extends Serializable, P> List<R> findList(PageRestRequest<P> pageRestRequest);

    T select(PK id);
}
