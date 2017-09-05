--用户表
CREATE TABLE `user` (
  `id` INT(11) NOT NULL COMMENT '主键',
  `account` VARCHAR(255) NOT NULL COMMENT '账号',
  `password` VARCHAR(255) NOT NULL COMMENT '密码',
  `create_id` INT(11) COMMENT '创建人',
  `create_time` DATE COMMENT '创建时间',
  `update_id` INT(11) COMMENT '修改人',
  `update_time` DATE COMMENT '修改时间',
  `delete_flag` INT(1) DEFAULT 0 COMMENT '删除标志位',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

--领域表
CREATE TABLE `scope` (
  `id` INT(11) NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `create_id` INT(11),
  `create_time` DATE,
  `update_id` INT(11),
  `update_time` DATE,
  `delete_flag` INT(1) DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

--领域关键字映射表
CREATE TABLE `scope_key` (
  `id` INT(11) NOT NULL COMMENT '主键',
  `scope_id` INT(11) NOT NULL COMMENT '领域id',
  `key_id` INT(11) NOT NULL COMMENT '关键字id',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

--关键字表
CREATE TABLE `key` (
  `id` INT(11) NOT NULL COMMENT '主键',
  `key` VARCHAR(255) NOT NULL COMMENT '关键字',
  `create_id` INT(11) COMMENT '创建人',
  `create_time` DATE COMMENT '创建时间',
  `update_id` INT(11) COMMENT '修改人',
  `update_time` DATE COMMENT '修改时间',
  `delete_flag` INT(1) DEFAULT 0 COMMENT '删除标志位',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

--爬虫表
CREATE TABLE `spider` (
  `id` INT(11) NOT NULL COMMENT '主键',
  `thread_count` INT(11) NOT NULL COMMENT '线程数',
  `meida_type` INT(1) NOT NULL COMMENT '媒体类型 0视频1文章2图片集',
  `total_count` INT(11) NOT NULL COMMENT '下载总数量',
  `media_path` VARCHAR(255) NOT NULL COMMENT '保存路径',
  `create_id` INT(11) COMMENT '创建人',
  `create_time` DATE COMMENT '创建时间',
  `update_id` INT(11) COMMENT '修改人',
  `update_time` DATE COMMENT '修改时间',
  `delete_flag` INT(1) DEFAULT 0 COMMENT '删除标志位',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

--爬虫策略关联表
CREATE TABLE `spider_strategy` (
  `id` INT(11) NOT NULL COMMENT '主键',
  `spider_id` INT(11) NOT NULL COMMENT '爬虫id',
  `strategy_id` INT(11) NOT NULL COMMENT '策略id',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

--目标网站表
CREATE TABLE `target` (
  `id` INT(11) NOT NULL COMMENT '主键',
  `page_url` VARCHAR(255) NOT NULL COMMENT '目标url地址',
  `create_id` INT(11) COMMENT '创建人',
  `create_time` DATE COMMENT '创建时间',
  `update_id` INT(11) COMMENT '修改人',
  `update_time` DATE COMMENT '修改时间',
  `delete_flag` INT(1) DEFAULT 0 COMMENT '删除标志位',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

--过滤标签表
CREATE TABLE `filtertag` (
  `id` INT(11) NOT NULL COMMENT '主键',
  `tag` VARCHAR(255) NOT NULL COMMENT '过滤标签',
  `depth` INT(1) NOT NULL COMMENT '深度',
  `pid` INT(11) NOT NULL COMMENT '父id',
  `pids` VARCHAR(255) NOT NULL COMMENT '所有父id，以,分割',
  `create_id` INT(11) COMMENT '创建人',
  `create_time` DATE COMMENT '创建时间',
  `update_id` INT(11) COMMENT '修改人',
  `update_time` DATE COMMENT '修改时间',
  `delete_flag` INT(1) DEFAULT 0 COMMENT '删除标志位',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

--目标网站过滤标签关联表
CREATE TABLE `target_filtertag` (
  `id` INT(11) NOT NULL COMMENT '主键',
  `target_id` INT(11) NOT NULL COMMENT '目标网站id',
  `filtertag_id` INT(11) NOT NULL COMMENT '过滤标签顶级id',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

--策略表
CREATE TABLE `strategy` (
  `id` INT(11) NOT NULL COMMENT '主键',
  `scope_id` INT(11) NOT NULL COMMENT '领域id',
  `start_time` DATE NOT NULL COMMENT '开始时间',
  `end_time` DATE NOT NULL COMMENT '结束时间',
  `ge_read_count` INT(11) NOT NULL COMMENT '最小阅读量',
  `ge_save_count` INT(11) COMMENT '最小收藏量',
  `ge_up_count` INT(11) COMMENT '最小关注量',
  `ge_forward_count` INT(11) COMMENT '最小转发量',
  `create_id` INT(11) COMMENT '创建人',
  `create_time` DATE COMMENT '创建时间',
  `update_id` INT(11) COMMENT '修改人',
  `update_time` DATE COMMENT '修改时间',
  `delete_flag` INT(1) DEFAULT 0 COMMENT '删除标志位',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

--文件表
CREATE TABLE `file` (
  `id` INT(11) NOT NULL COMMENT '主键',
  `spider_id` INT(11) NOT NULL COMMENT '爬虫id',
  `file_name` VARCHAR(255) NOT NULL COMMENT '文件名',
  `file_suffix` VARCHAR(255) NOT NULL COMMENT '文件后缀',
  `file_type` INT(1) NOT NULL COMMENT '文件类型',
  `file_path` VARCHAR(255) NOT NULL COMMENT '文件路径',
  `create_id` INT(11) COMMENT '创建人',
  `create_time` DATE COMMENT '创建时间',
  `update_id` INT(11) COMMENT '修改人',
  `update_time` DATE COMMENT '修改时间',
  `delete_flag` INT(1) DEFAULT 0 COMMENT '删除标志位',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;