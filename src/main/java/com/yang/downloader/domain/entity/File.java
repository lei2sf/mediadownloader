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
public class File extends BaseEntity {
    private int spiderId;
    private String fileName;
    private String fileSuffix;
    private int fileType;
    private String filePath;
}
