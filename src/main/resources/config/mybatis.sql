/*
Navicat MySQL Data Transfer

Source Server         : GX
Source Server Version : 50636
Source Host           : 127.0.0.1:3306
Source Database       : ussm

Target Server Type    : MYSQL
Target Server Version : 50636
File Encoding         : 65001

Date: 2020-04-06 21:10:51
*/

SET FOREIGN_KEY_CHECKS=0;

CREATE DATABASE mybatis;

USE mybatis;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(32) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `age` int(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'yinliqing', '123456','28');
INSERT INTO `t_user` VALUES ('2', 'andrew', '123456','24');
INSERT INTO `t_user` VALUES ('3', 'lxd', '123456','32');