CREATE SCHEMA IF NOT EXISTS  `blog` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `blog` ;



CREATE TABLE IF NOT EXISTS `login_user` (
  `id` varchar(40) NOT NULL COMMENT 'user主键',
  `email` varchar(255) NOT NULL UNIQUE COMMENT '邮箱',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `nickname` varchar(255) DEFAULT NULL COMMENT '昵称',
  `qq` varchar(255) DEFAULT NULL COMMENT 'qq',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE IF NOT EXISTS `login_account` (
  `uid` varchar(40) NOT NULL COMMENT 'user主键',
  `email` varchar(255) NOT NULL UNIQUE COMMENT '邮箱',
  `salt` varchar(10) DEFAULT NULL COMMENT '密码加盐',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;