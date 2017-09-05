package com.yang.downloader.common.base;

import java.util.List;

/**
 * @author yangl
 * @Description
 * @date 2017/9/4.
 */
public interface BaseDao<T extends BaseEntity,PK> {
    /**
     * 新增
     * @param entity 实体类
     * @return
     */
    int save(T entity);

    /**
     * 更新
     * @param entity 实体类
     * @return
     */
    int update(T entity);

    /**
     * 删除
     * @param id 主键
     * @return
     */
    int delete(PK id);

    /**
     * 删除
     * @param ids 主键列表
     * @return
     */
    int delete(List<PK> ids);

    /**
     * 查询所有
     * @return
     */
    List<T> findAll();

    /**
     * 查询单个
     * @param id 主键
     * @return
     */
    T findOne(PK id);

    /**
     * 查询列表(分页)
     * @param page 页面参数
     * @param <R> 页面结果类型
     * @param <P> 页面参数类型
     * @return
     */
    <R,P>List<R> findList(P page);

    /**
     * 查询数量(分页)
     * @param page 页面参数
     * @param <P> 页面参数类型
     * @return
     */
    <P>int count(P page);

    /**
     * 根据条件查询数据是否存在
     * @param condition 查询条件
     * @return 数量
     */
    int exists(T condition);
}
