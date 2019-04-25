/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : springboot-druid

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2019-04-25 10:38:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(50) NOT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '123456');
INSERT INTO `user` VALUES ('2', 'aaa', 'asasd');
INSERT INTO `user` VALUES ('3', 'bbb', '35612123');
INSERT INTO `user` VALUES ('4', 'ccc', 'vdsasd');
INSERT INTO `user` VALUES ('5', 'ddd', 'yy1232123');
