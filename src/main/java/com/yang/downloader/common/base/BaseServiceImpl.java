package com.yang.downloader.common.base;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yang.downloader.common.PageParam;
import com.yang.downloader.common.PageRestRequest;
import com.yang.downloader.common.PageResult;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author yangl
 * @Description
 * @date 2017/9/4.
 */
public abstract class BaseServiceImpl<T extends BaseEntity,PK> implements BaseService<T,PK> {
    @Override
    public int save(T entity) {
        if(entity.getId() > 0){
            this.getBaseDao().update(entity);
        }else {
            this.getBaseDao().save(entity);
        }
        return entity.getId();
    }

    @Override
    public void remove(PK id) {
        this.getBaseDao().delete(id);
    }

    @Override
    public void remove(List<PK> ids) {
        this.getBaseDao().delete(ids);
    }

    @Override
    public boolean exists(T condition) {
        return this.getBaseDao().exists(condition) > 0 ? true : false;
    }

    @Override
    public <R extends Serializable, P> PageResult<R> findPage(PageRestRequest<P> request) {
        PageParam pageParam = request.getPageParam();
        Object param = request.getParam();
        int currentPage = pageParam.getCurrentPage();
        int pageSize = pageParam.getPageSize();
        Page page = PageHelper.startPage(currentPage, pageSize);
        List items = this.getBaseDao().findList(param);
        PageResult result = new PageResult();
        long totalCount = page.getTotal();
        int totalPage = page.getPages();
        result.setTotalCount(totalCount);
        result.setCurrentPage(currentPage);
        result.setPageSize(pageSize);
        result.setTotalPage(totalPage);
        result.setItems(items);
        return result;
    }

    @Override
    public <R extends Serializable, P> List<R> findList(PageRestRequest<P> request) {
        Object param = request.getParam();
        List itemList = this.getBaseDao().findList(param);
        return itemList;
    }

    @Override
    public T select(PK id) {
        return this.getBaseDao().findOne(id);
    }

    public abstract BaseDao<T, PK> getBaseDao();
}
