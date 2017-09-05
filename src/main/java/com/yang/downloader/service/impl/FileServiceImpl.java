package com.yang.downloader.service.impl;

import com.yang.downloader.common.base.BaseDao;
import com.yang.downloader.common.base.BaseServiceImpl;
import com.yang.downloader.dao.FileDao;
import com.yang.downloader.domain.entity.File;
import com.yang.downloader.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yangl
 * @Description
 * @date 2017/9/4.
 */
@Service
public class FileServiceImpl extends BaseServiceImpl<File,Integer> implements FileService {

    @Autowired
    private FileDao fileDao;

    @Override
    public BaseDao<File, Integer> getBaseDao() {
        return fileDao;
    }
}
