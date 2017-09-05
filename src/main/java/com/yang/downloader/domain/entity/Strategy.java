package com.yang.downloader.domain.entity;

import com.yang.downloader.common.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author yangl
 * @Description
 * @date 2017/9/4.
 */
@Getter
@Setter
public class Strategy extends BaseEntity {
    private int scopeId;
    private Date startTime;
    private Date endTime;
    private int geReadCount;
    private int geSaveCount;
    private int geUpCount;
    private int geForwardCount;
}
