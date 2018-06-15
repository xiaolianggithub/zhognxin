/*
Navicat MySQL Data Transfer

Source Server         : zhongxin
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : zhongxin

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-06-15 13:48:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for authority
-- ----------------------------
DROP TABLE IF EXISTS `authority`;
CREATE TABLE `authority` (
  `authority_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_authority_id` bigint(20) NOT NULL,
  `authority_name` varchar(64) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`authority_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of authority
-- ----------------------------
INSERT INTO `authority` VALUES ('1', '1', '1', '1');

-- ----------------------------
-- Table structure for group
-- ----------------------------
DROP TABLE IF EXISTS `group`;
CREATE TABLE `group` (
  `group_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_authority_id` bigint(20) NOT NULL,
  `group_name` varchar(64) NOT NULL,
  `parent_group_id` bigint(20) NOT NULL,
  `create_time` datetime NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of group
-- ----------------------------

-- ----------------------------
-- Table structure for groupauthorityrelation
-- ----------------------------
DROP TABLE IF EXISTS `groupauthorityrelation`;
CREATE TABLE `groupauthorityrelation` (
  `group_authority_relation_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `group_id` bigint(20) NOT NULL,
  `authority_id` bigint(20) NOT NULL,
  `authority_type` int(11) NOT NULL,
  PRIMARY KEY (`group_authority_relation_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of groupauthorityrelation
-- ----------------------------

-- ----------------------------
-- Table structure for grouprolerelation
-- ----------------------------
DROP TABLE IF EXISTS `grouprolerelation`;
CREATE TABLE `grouprolerelation` (
  `group_role_relation_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `group_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`group_role_relation_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of grouprolerelation
-- ----------------------------

-- ----------------------------
-- Table structure for log
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log` (
  `log_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `operation_type` int(11) NOT NULL,
  `content` varchar(64) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `create_time` datetime NOT NULL,
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of log
-- ----------------------------

-- ----------------------------
-- Table structure for organization
-- ----------------------------
DROP TABLE IF EXISTS `organization`;
CREATE TABLE `organization` (
  `organization_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_organization_id` bigint(20) NOT NULL,
  `organization_name` varchar(64) NOT NULL,
  `create_time` datetime NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`organization_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of organization
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_role_id` bigint(20) NOT NULL,
  `role_name` varchar(64) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  `create_time` datetime NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of role
-- ----------------------------

-- ----------------------------
-- Table structure for roleauthorityrelation
-- ----------------------------
DROP TABLE IF EXISTS `roleauthorityrelation`;
CREATE TABLE `roleauthorityrelation` (
  `role_authority_relation_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) NOT NULL,
  `authority_id` bigint(20) NOT NULL,
  `authority_type` int(11) NOT NULL,
  PRIMARY KEY (`role_authority_relation_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of roleauthorityrelation
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `tu_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `to_id` bigint(20) DEFAULT NULL,
  `login_name` varchar(64) NOT NULL,
  `password` varchar(64) NOT NULL,
  `username` varchar(64) NOT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  `email` varchar(64) DEFAULT NULL,
  `create_time` datetime NOT NULL,
  `login_time` datetime DEFAULT NULL,
  `last_login_time` datetime DEFAULT NULL,
  `count` bigint(20) NOT NULL,
  PRIMARY KEY (`tu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', '1', '1', '1', '1', '1', '2018-05-22 09:41:54', '2018-06-12 09:41:41', '2018-06-15 09:41:37', '1');

-- ----------------------------
-- Table structure for userauthorityrelation
-- ----------------------------
DROP TABLE IF EXISTS `userauthorityrelation`;
CREATE TABLE `userauthorityrelation` (
  `user_role_relation_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `authority_id` bigint(20) NOT NULL,
  `right_type` int(11) NOT NULL,
  PRIMARY KEY (`user_role_relation_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of userauthorityrelation
-- ----------------------------

-- ----------------------------
-- Table structure for usergrouprelation
-- ----------------------------
DROP TABLE IF EXISTS `usergrouprelation`;
CREATE TABLE `usergrouprelation` (
  `user_group_relation_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `group_id` bigint(20) NOT NULL,
  PRIMARY KEY (`user_group_relation_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of usergrouprelation
-- ----------------------------

-- ----------------------------
-- Table structure for userrolerelation
-- ----------------------------
DROP TABLE IF EXISTS `userrolerelation`;
CREATE TABLE `userrolerelation` (
  `user_role_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`user_role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of userrolerelation
-- ----------------------------
