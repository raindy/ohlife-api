CREATE TABLE `note` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `content` text,
  `pub_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `website_info` (
  `website_id` int(11) NOT NULL auto_increment,
  `name` varchar(100) default NULL,
  `site_type` tinyint(3) NOT NULL default '1',
  `content_category` tinyint(3) NOT NULL default '-1',
  `host` varchar(100) NOT NULL default '',
  `language` tinyint(3) NOT NULL default '1',
  `authority` tinyint(3) default NULL,
  `logo_path` varchar(255) default NULL,
  `update_time` timestamp NOT NULL default CURRENT_TIMESTAMP,
  `alarm_seconds` int(11) default '86400' COMMENT '多少秒无新数据就报警',
  `remarks` varchar(255) default NULL,
  `last_msg_id` int(11) default NULL,
  `last_msg_intime` datetime default NULL,
  PRIMARY KEY  (`website_id`),
  UNIQUE KEY `index_type_host` (`site_type`,`host`),
  KEY `update_time` (`update_time`)
) ENGINE=InnoDB AUTO_INCREMENT=19135 DEFAULT CHARSET=utf8;

CREATE TABLE `acq_bbs_board` (
  `bid` int(11) NOT NULL auto_increment,
  `hid` int(11) NOT NULL,
  `skey` varchar(50) default NULL,
  `name` varchar(500) default NULL,
  `url` varchar(500) default NULL,
  `info` text,
  `language` varchar(100) default NULL,
  `genus` varchar(32) default NULL,
  `last_tid` int(11) default NULL,
  `update_time` timestamp NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  PRIMARY KEY  (`bid`),
  UNIQUE KEY `skey` (`skey`)
) ENGINE=InnoDB AUTO_INCREMENT=1582 DEFAULT CHARSET=utf8;