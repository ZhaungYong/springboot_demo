/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50536
Source Host           : 127.0.0.1:3306
Source Database       : shirodemo

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2018-11-06 17:36:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for u_permission
-- ----------------------------
DROP TABLE IF EXISTS `u_permission`;
CREATE TABLE `u_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `parentid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of u_permission
-- ----------------------------
INSERT INTO `u_permission` VALUES ('1', '权限管理', ' ', '-1');
INSERT INTO `u_permission` VALUES ('2', '用户管理', '1', '1');
INSERT INTO `u_permission` VALUES ('3', '角色管理', '1', '1');
INSERT INTO `u_permission` VALUES ('4', '权限管理', 'view/author/permission', '1');
INSERT INTO `u_permission` VALUES ('5', '12', ' ', '-1');
INSERT INTO `u_permission` VALUES ('6', '23', '23', '5');

-- ----------------------------
-- Table structure for u_role
-- ----------------------------
DROP TABLE IF EXISTS `u_role`;
CREATE TABLE `u_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of u_role
-- ----------------------------
INSERT INTO `u_role` VALUES ('1', '超级管理员');

-- ----------------------------
-- Table structure for u_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `u_role_permission`;
CREATE TABLE `u_role_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rid` int(11) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of u_role_permission
-- ----------------------------
INSERT INTO `u_role_permission` VALUES ('1', '1', '1');
INSERT INTO `u_role_permission` VALUES ('2', '1', '2');
INSERT INTO `u_role_permission` VALUES ('3', '1', '3');
INSERT INTO `u_role_permission` VALUES ('4', '1', '4');

-- ----------------------------
-- Table structure for u_user
-- ----------------------------
DROP TABLE IF EXISTS `u_user`;
CREATE TABLE `u_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of u_user
-- ----------------------------
INSERT INTO `u_user` VALUES ('1', 'admin', '21232f297a57a5a743894a0e4a801fc3');

-- ----------------------------
-- Table structure for u_user_role
-- ----------------------------
DROP TABLE IF EXISTS `u_user_role`;
CREATE TABLE `u_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `rid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of u_user_role
-- ----------------------------
INSERT INTO `u_user_role` VALUES ('1', '1', '1');
