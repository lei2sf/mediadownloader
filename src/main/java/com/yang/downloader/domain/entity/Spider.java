package com.yang.downloader.domain.entity;

import com.yang.downloader.common.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * @author yangl
 * @Description
 * @date 2017/9/4.
 */
@Getter
@Setter
public class Spider extends BaseEntity {
    private int threadCount;
    private int meidaType;
    private int totalCount;
    private String mediaPath;
}
