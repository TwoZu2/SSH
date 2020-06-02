/*
 Navicat Premium Data Transfer

 Source Server         : dddd
 Source Server Type    : MySQL
 Source Server Version : 50561
 Source Host           : localhost:3306
 Source Schema         : maintain

 Target Server Type    : MySQL
 Target Server Version : 50561
 File Encoding         : 65001

 Date: 01/06/2020 22:07:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for administrator
-- ----------------------------
DROP TABLE IF EXISTS `administrator`;
CREATE TABLE `administrator`  (
  `AdminId` int(11) NOT NULL AUTO_INCREMENT,
  `AdminName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `AdminPassword` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`AdminId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of administrator
-- ----------------------------
INSERT INTO `administrator` VALUES (1, 'admin', '222222');
INSERT INTO `administrator` VALUES (2, 'sjiag', '123456');

-- ----------------------------
-- Table structure for apply
-- ----------------------------
DROP TABLE IF EXISTS `apply`;
CREATE TABLE `apply`  (
  `ApyId` int(11) NOT NULL AUTO_INCREMENT,
  `LocId` int(11) NOT NULL,
  `ApyPostion` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ApyName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ApySex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `EmpAge` int(11) NOT NULL,
  `ApyTime` datetime NOT NULL,
  `ApyEducation` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ApyPhone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ApyIdentity` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `EmpAddress` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`ApyId`) USING BTREE,
  INDEX `emp1`(`LocId`) USING BTREE,
  CONSTRAINT `apply_ibfk_1` FOREIGN KEY (`LocId`) REFERENCES `location` (`LocId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of apply
-- ----------------------------
INSERT INTO `apply` VALUES (4, 24, '阿萨', '阿萨', '是', 14, '2020-06-23 20:35:59', '搜索', '22222222222', '阿萨', '阿萨');
INSERT INTO `apply` VALUES (5, 24, '后勤管理', '搜索', ' 的', 15, '2020-06-30 20:36:47', '是', '啊', '是', '是');

-- ----------------------------
-- Table structure for appointment
-- ----------------------------
DROP TABLE IF EXISTS `appointment`;
CREATE TABLE `appointment`  (
  `AptId` int(11) NOT NULL AUTO_INCREMENT,
  `AptName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `AptPhone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `AptNo` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `AptType` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `AppointmentTime` datetime NOT NULL,
  `ServiceType` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`AptId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of appointment
-- ----------------------------
INSERT INTO `appointment` VALUES (18, 'jack', '13019879875', '陕A2333', '劳斯莱斯', '2109-12-21 00:00:00', '大类型');
INSERT INTO `appointment` VALUES (19, 'jack', '13019879875', '陕A2333', '劳斯莱斯', '2109-12-21 00:00:00', '大类型');
INSERT INTO `appointment` VALUES (20, 'jack', '13019879875', '陕A2333', '劳斯莱斯', '2109-12-21 00:00:00', '大类型');
INSERT INTO `appointment` VALUES (21, 'jack', '13019879875', '陕A2333', '劳斯莱斯', '2109-12-21 00:00:00', '大类型');
INSERT INTO `appointment` VALUES (22, 'jack', '13019879875', '陕A2333', '劳斯莱斯', '2109-12-21 00:00:00', '大类型');
INSERT INTO `appointment` VALUES (23, 'd', 'd', 'd', 'd', '2018-12-12 00:00:00', '大类型');

-- ----------------------------
-- Table structure for contactus
-- ----------------------------
DROP TABLE IF EXISTS `contactus`;
CREATE TABLE `contactus`  (
  `ContId` int(11) NOT NULL AUTO_INCREMENT,
  `ContImage` int(11) NULL DEFAULT 1,
  `ContName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ContMessage` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ContTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `ReplyContent` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Retshow` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`ContId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of contactus
-- ----------------------------
INSERT INTO `contactus` VALUES (1, 1, '渣渣女', '同学聚会，看到当年追我的屌丝开着宝马车带着他老婆来了，他老婆是我隔壁宿舍的同班同学，心里后悔极了。', '2019-12-28 17:14:57', '回复内容', '1');
INSERT INTO `contactus` VALUES (2, 1, '渣渣女', '同学聚会，看到当年追我的屌丝开着宝马车带着他老婆来了，他老婆是我隔壁宿舍的同班同学，心里后悔极了。', '2019-12-28 17:39:16', '回复内容', '0');
INSERT INTO `contactus` VALUES (3, 1, '渣渣女', '同学聚会，看到当年追我的屌丝开着宝马车带着他老婆来了，他老婆是我隔壁宿舍的同班同学，心里后悔极了。', '2019-12-28 17:39:25', '回复内容', '0');
INSERT INTO `contactus` VALUES (4, 1, '渣渣女', '同学聚会，看到当年追我的屌丝开着宝马车带着他老婆来了，他老婆是我隔壁宿舍的同班同学，心里后悔极了。', '2019-12-28 17:39:49', ' 是', '0');
INSERT INTO `contactus` VALUES (5, 1, '渣渣女', '同学聚会，看到当年追我的屌丝开着宝马车带着他老婆来了，他老婆是我隔壁宿舍的同班同学，心里后悔极了。', '2019-12-28 17:39:49', '回复', '0');
INSERT INTO `contactus` VALUES (6, 1, '渣渣女', '同学聚会，看到当年追我的屌丝开着宝马车带着他老婆来了，他老婆是我隔壁宿舍的同班同学，心里后悔极了。', '2019-12-28 17:39:49', NULL, '0');
INSERT INTO `contactus` VALUES (7, 1, '渣渣女', '同学聚会，看到当年追我的屌丝开着宝马车带着他老婆来了，他老婆是我隔壁宿舍的同班同学，心里后悔极了。', '2019-12-28 17:40:02', NULL, '0');
INSERT INTO `contactus` VALUES (8, 1, '渣渣女', '同学聚会，看到当年追我的屌丝开着宝马车带着他老婆来了，他老婆是我隔壁宿舍的同班同学，心里后悔极了。', '2019-12-28 17:40:02', '', '1');
INSERT INTO `contactus` VALUES (10, 1, '渣渣女', '同学聚会，看到当年追我的屌丝开着宝马车带着他老婆来了，他老婆是我隔壁宿舍的同班同学，心里后悔极了。', '2019-12-28 17:40:10', 'asd ', '1');
INSERT INTO `contactus` VALUES (11, 1, '渣渣女', '同学聚会，看到当年追我的屌丝开着宝马车带着他老婆来了，他老婆是我隔壁宿舍的同班同学，心里后悔极了。', '2019-12-28 17:40:10', 'asdasd', '1');
INSERT INTO `contactus` VALUES (12, 1, '渣渣女', '同学聚会，看到当年追我的屌丝开着宝马车带着他老婆来了，他老婆是我隔壁宿舍的同班同学，心里后悔极了。', '2019-12-28 17:40:10', NULL, '1');
INSERT INTO `contactus` VALUES (13, 1, '渣渣女d', '同学聚会，看到当年追我的屌丝开着宝马车带着他老婆来了，他老婆是我隔壁宿舍的同班同学，心里后悔极了。', '2019-12-28 20:48:44', 'sadsad', '1');

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`  (
  `CustId` int(11) NOT NULL AUTO_INCREMENT,
  `CustName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `CustPassword` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`CustId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES (1, '张三', '123456');

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `DepId` int(11) NOT NULL AUTO_INCREMENT,
  `DepName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `DepNum` int(11) NOT NULL,
  `DepIntroduce` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`DepId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES (1, '后勤部', 333, 'wwwww');
INSERT INTO `department` VALUES (3, '财政部', 10, '保障');
INSERT INTO `department` VALUES (4, '市场部', 33, 'wwwww');
INSERT INTO `department` VALUES (5, '设计部', 33, 'wwwww');
INSERT INTO `department` VALUES (7, '开发部', 33, 'wwwww');
INSERT INTO `department` VALUES (8, '维修部', 33, 'wwwww');
INSERT INTO `department` VALUES (9, '售后部', 33, 'wwwww');
INSERT INTO `department` VALUES (10, '售前部', 33, 'wwwww');
INSERT INTO `department` VALUES (11, '人事部', 33, 'wwwww');
INSERT INTO `department` VALUES (12, '营销部', 33, 'wwwww');
INSERT INTO `department` VALUES (13, '采购部', 33, 'wwwww');
INSERT INTO `department` VALUES (17, '仓库部', 33, 'wwwww');
INSERT INTO `department` VALUES (18, 'sjm', 10, 'sjmm');

-- ----------------------------
-- Table structure for employees
-- ----------------------------
DROP TABLE IF EXISTS `employees`;
CREATE TABLE `employees`  (
  `EmpId` int(11) NOT NULL AUTO_INCREMENT,
  `EmpName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `EmpSex` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `EmpAge` int(11) NOT NULL,
  `EmpAddress` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `EmpPhone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `EmpTime` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `EmpIdentity` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `PostionId` int(11) NOT NULL,
  PRIMARY KEY (`EmpId`) USING BTREE,
  INDEX `emp`(`PostionId`) USING BTREE,
  CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`PostionId`) REFERENCES `location` (`LocId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 303 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of employees
-- ----------------------------
INSERT INTO `employees` VALUES (2, '李四', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 1);
INSERT INTO `employees` VALUES (3, '王五', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 2);
INSERT INTO `employees` VALUES (4, '赵六', '男', 18, '陕西西安', '18089176062', '2015-04-05  ', '好', 2);
INSERT INTO `employees` VALUES (5, '张四', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 5);
INSERT INTO `employees` VALUES (6, '张五', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 5);
INSERT INTO `employees` VALUES (7, '张六', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 6);
INSERT INTO `employees` VALUES (8, '张七', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 6);
INSERT INTO `employees` VALUES (9, '张八', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 7);
INSERT INTO `employees` VALUES (10, '张九', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 7);
INSERT INTO `employees` VALUES (11, '张十', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 8);
INSERT INTO `employees` VALUES (12, '李六', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 8);
INSERT INTO `employees` VALUES (13, '李七', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 9);
INSERT INTO `employees` VALUES (14, '李八', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 9);
INSERT INTO `employees` VALUES (15, '李九', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 9);
INSERT INTO `employees` VALUES (16, '李十', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 9);
INSERT INTO `employees` VALUES (17, '赵七', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 11);
INSERT INTO `employees` VALUES (18, '赵八', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 11);
INSERT INTO `employees` VALUES (19, '赵九', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 12);
INSERT INTO `employees` VALUES (20, '赵十', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 12);
INSERT INTO `employees` VALUES (21, '史一', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 14);
INSERT INTO `employees` VALUES (22, '史二', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 14);
INSERT INTO `employees` VALUES (23, '史三', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 16);
INSERT INTO `employees` VALUES (24, '史四', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 16);
INSERT INTO `employees` VALUES (25, '史五', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 17);
INSERT INTO `employees` VALUES (26, '史六', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 17);
INSERT INTO `employees` VALUES (27, '史七', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 18);
INSERT INTO `employees` VALUES (28, '史八', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 18);
INSERT INTO `employees` VALUES (29, '史九', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 19);
INSERT INTO `employees` VALUES (30, '史十', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 19);
INSERT INTO `employees` VALUES (31, '张六', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 20);
INSERT INTO `employees` VALUES (32, '张七', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 20);
INSERT INTO `employees` VALUES (33, '张八', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 21);
INSERT INTO `employees` VALUES (34, '张九', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 21);
INSERT INTO `employees` VALUES (35, '张十', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 22);
INSERT INTO `employees` VALUES (36, '李六', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 22);
INSERT INTO `employees` VALUES (37, '李七', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 23);
INSERT INTO `employees` VALUES (38, '李八', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 23);
INSERT INTO `employees` VALUES (39, '李九', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 24);
INSERT INTO `employees` VALUES (40, '李十', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 24);
INSERT INTO `employees` VALUES (41, '赵七', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 25);
INSERT INTO `employees` VALUES (42, '赵八', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 25);
INSERT INTO `employees` VALUES (43, '赵九', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 26);
INSERT INTO `employees` VALUES (44, '赵十', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 26);
INSERT INTO `employees` VALUES (45, '史一', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 27);
INSERT INTO `employees` VALUES (46, '史二', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 27);
INSERT INTO `employees` VALUES (47, '史三', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 28);
INSERT INTO `employees` VALUES (48, '史四', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 28);
INSERT INTO `employees` VALUES (49, '史五', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 29);
INSERT INTO `employees` VALUES (50, '史六', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 29);
INSERT INTO `employees` VALUES (51, '史七', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 30);
INSERT INTO `employees` VALUES (52, '史八', '男', 18, '陕西西安', '18089176062', '2015-04-05   ', '好', 30);
INSERT INTO `employees` VALUES (278, '李四', '男', 18, '陕西西安', '18089176062', '2015-05-09', '好', 1);
INSERT INTO `employees` VALUES (279, '张三', '男', 22, '宝鸡', '13389488786', '2019-12-26 15:04:45', '620522123456789987', 2);
INSERT INTO `employees` VALUES (280, '张三', '男', 22, '宝鸡', '13389488786', '2019-12-26 15:04:51', '620522123456789987', 1);
INSERT INTO `employees` VALUES (281, '张三', '男', 22, '宝鸡', '13389488786', '2019-12-26 15:09:28', '620522123456789987', 9);
INSERT INTO `employees` VALUES (282, '张三', '男', 22, '宝鸡', '13389488786', '2019-12-26 15:20:30', '620522123456789987', 9);
INSERT INTO `employees` VALUES (283, '张三', '男', 22, '宝鸡', '13389488786', '2019-12-26 15:46:54', '620522123456789987', 1);
INSERT INTO `employees` VALUES (285, '张三', '男', 22, '宝鸡', '13389488786', '2019-12-26 15:58:03', '620522123456789987', 19);
INSERT INTO `employees` VALUES (286, '张三', '男', 22, '宝鸡', '13389488786', '2019-12-26 15:59:51', '620522123456789987', 2);
INSERT INTO `employees` VALUES (287, '张三', '男', 22, '宝鸡', '13389488786', '2019-12-26 15:59:52', '620522123456789987', 2);
INSERT INTO `employees` VALUES (288, '张三', '男', 22, '宝鸡', '13389488786', '2019-12-26 15:59:53', '620522123456789987', 2);
INSERT INTO `employees` VALUES (289, '张三', '男', 22, '宝鸡', '13389488786', '2019-12-26 15:59:53', '620522123456789987', 2);
INSERT INTO `employees` VALUES (290, '张三', '男', 22, '宝鸡', '13389488786', '2019-12-26 16:01:06', '620522123456789987', 1);
INSERT INTO `employees` VALUES (291, '张三', '男', 22, '宝鸡', '13389488786', '2019-12-26 16:03:46', '620522123456789987', 1);
INSERT INTO `employees` VALUES (292, '张三', '男', 22, '宝鸡', '13389488786', '2019-12-26 16:03:46', '620522123456789987', 1);
INSERT INTO `employees` VALUES (293, '张三', '男', 22, '宝鸡', '13389488786', '2019-12-26 16:03:54', '620522123456789987', 1);
INSERT INTO `employees` VALUES (294, '张三', '男', 22, '宝鸡', '13389488786', '2019-12-26 16:04:12', '620522123456789987', 1);
INSERT INTO `employees` VALUES (295, '张三', '男', 22, '宝鸡', '13389488786', '2019-12-26 16:04:12', '620522123456789987', 1);
INSERT INTO `employees` VALUES (296, '张三', '男', 22, '宝鸡', '13389488786', '2019-12-26 16:04:12', '620522123456789987', 1);
INSERT INTO `employees` VALUES (297, '张三', '男', 22, '宝鸡', '13389488786', '2019-12-26 16:04:45', '620522123456789987', 1);
INSERT INTO `employees` VALUES (298, '张三', '男', 22, '宝鸡', '13389488786', '2019-12-26 16:05:30', '620522123456789987', 1);
INSERT INTO `employees` VALUES (299, '张三', '男', 22, '宝鸡', '13389488786', '2019-12-26 16:06:18', '620522123456789987', 1);
INSERT INTO `employees` VALUES (300, '李四', '男', 18, '兴平', '22222222222', '2020-06-01', '啊啊啊', 31);
INSERT INTO `employees` VALUES (301, '李四', '男', 18, '兴平', '22222222222', '2020-06-01', '啊啊啊', 31);
INSERT INTO `employees` VALUES (302, '张三', '女', 14, '咸阳', '11111111111', '2020-06-01', '顶顶顶', 24);

-- ----------------------------
-- Table structure for industrynews
-- ----------------------------
DROP TABLE IF EXISTS `industrynews`;
CREATE TABLE `industrynews`  (
  `NewId` int(11) NOT NULL AUTO_INCREMENT,
  `NewTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `NewTitle` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `NewMessage` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`NewId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of industrynews
-- ----------------------------
INSERT INTO `industrynews` VALUES (1, '2019-12-28 19:07:10', 'a\'s\'d', 'asda\'s\'dasd');

-- ----------------------------
-- Table structure for inventory
-- ----------------------------
DROP TABLE IF EXISTS `inventory`;
CREATE TABLE `inventory`  (
  `ItyId` int(11) NOT NULL AUTO_INCREMENT,
  `ItyName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ItyNumber` int(11) NOT NULL,
  `ItyBrand` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `PurchasePrice` decimal(7, 2) NULL DEFAULT NULL,
  `ItyModels` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ItyType` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `OutPrice` decimal(7, 2) NULL DEFAULT NULL,
  `ItyRole` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ItyId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of inventory
-- ----------------------------
INSERT INTO `inventory` VALUES (1, '刹车片', -87, '张三品牌', 60.00, '宝马x5', '43Xs', 75.00, '修理故障; ');

-- ----------------------------
-- Table structure for location
-- ----------------------------
DROP TABLE IF EXISTS `location`;
CREATE TABLE `location`  (
  `LocId` int(11) NOT NULL AUTO_INCREMENT,
  `LocName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `LocText` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `DeparId` int(11) NOT NULL,
  PRIMARY KEY (`LocId`) USING BTREE,
  INDEX `sss`(`DeparId`) USING BTREE,
  CONSTRAINT `location_ibfk_1` FOREIGN KEY (`DeparId`) REFERENCES `department` (`DepId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of location
-- ----------------------------
INSERT INTO `location` VALUES (1, '后勤管理', 'sadsadsadasdsadsa', 1);
INSERT INTO `location` VALUES (2, '后勤123', 'sadsadsadasdsadsa', 1);
INSERT INTO `location` VALUES (5, '初级会计', 'sadsadsadasdsadsa', 3);
INSERT INTO `location` VALUES (6, '中级会计', 'sadsadd', 3);
INSERT INTO `location` VALUES (7, '高级会计', '123456', 3);
INSERT INTO `location` VALUES (8, '市场营销', 'sadsadsadasdsadsa', 4);
INSERT INTO `location` VALUES (9, '市场统计', 'sadsadsadasdsadsa', 4);
INSERT INTO `location` VALUES (11, '营销设计', 'sadsadsadasdsadsa', 5);
INSERT INTO `location` VALUES (12, '展示设计', 'sadsadsadasdsadsa', 5);
INSERT INTO `location` VALUES (14, '网页开发', 'sadsadsadasdsadsa', 7);
INSERT INTO `location` VALUES (16, '数据开发', 'sadsadsadasdsadsa', 7);
INSERT INTO `location` VALUES (17, '初级维修师', 'sadsadsadasdsadsa', 8);
INSERT INTO `location` VALUES (18, '高级维修师', 'sadsadsadasdsadsa', 8);
INSERT INTO `location` VALUES (19, '初级售后专员', 'sadsadsadasdsadsa', 9);
INSERT INTO `location` VALUES (20, '高级售后专员', 'sadsadsadasdsadsa', 9);
INSERT INTO `location` VALUES (21, '初级售前专员', 'sadsadsadasdsadsa', 10);
INSERT INTO `location` VALUES (22, '高级售前专员', 'sadsadsadasdsadsa', 10);
INSERT INTO `location` VALUES (23, '人事专员', 'sadsadsadasdsadsa', 11);
INSERT INTO `location` VALUES (24, '人事经理', 'sadsadsadasdsadsa', 11);
INSERT INTO `location` VALUES (25, '营销专员', 'sadsadsadasdsadsa', 12);
INSERT INTO `location` VALUES (26, '营销经理', 'sadsadsadasdsadsa', 12);
INSERT INTO `location` VALUES (27, '采购专员', 'sadsadsadasdsadsa', 13);
INSERT INTO `location` VALUES (28, '采购经理', 'sadsadsadasdsadsa', 13);
INSERT INTO `location` VALUES (29, '仓库搬运', 'sadsadsadasdsadsa', 17);
INSERT INTO `location` VALUES (30, '仓库管理', 'sadsadsadasdsadsa', 17);
INSERT INTO `location` VALUES (31, '数据吗', 'sss', 18);
INSERT INTO `location` VALUES (32, '撒打发阿斯顿', '阿斯顿', 1);

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message`  (
  `MegId` int(11) NOT NULL AUTO_INCREMENT,
  `MegName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `MegContent` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ReplyContent` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`MegId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES (1, 'jack', '这是一条留言', '回复');

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news`  (
  `NewId` int(11) NOT NULL AUTO_INCREMENT,
  `NewTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `NewTitle` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `NewMessage` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`NewId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES (1, '2019-12-28 17:14:58', '1283', '102313231asdsa');
INSERT INTO `news` VALUES (2, '2019-12-28 17:14:58', '18ppppp3', '102313231asdsa');
INSERT INTO `news` VALUES (3, '2019-12-28 17:14:58', '124545s3', '102313231asdsa');
INSERT INTO `news` VALUES (4, '2019-12-28 17:14:58', 'o', '102313231asdsa');
INSERT INTO `news` VALUES (5, '2019-12-28 17:14:58', '12dd3', '102313231asdsa');
INSERT INTO `news` VALUES (6, '2019-12-28 17:14:58', '123', '102313231asdsa');

-- ----------------------------
-- Table structure for recruitment
-- ----------------------------
DROP TABLE IF EXISTS `recruitment`;
CREATE TABLE `recruitment`  (
  `RetId` int(11) NOT NULL AUTO_INCREMENT,
  `RetDepartment` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `RetPostion` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `RetText` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `RetDemand` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `RetNum` int(11) NOT NULL,
  `WorkPlace` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `BeginTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `EndTime` datetime NOT NULL,
  PRIMARY KEY (`RetId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of recruitment
-- ----------------------------
INSERT INTO `recruitment` VALUES (1, '后勤部', '质量售后专员', 'asdas', '大专', 3, '宝鸡', '2019-12-25 20:50:13', '2019-12-12 00:00:00');

-- ----------------------------
-- Table structure for repairs
-- ----------------------------
DROP TABLE IF EXISTS `repairs`;
CREATE TABLE `repairs`  (
  `RepId` int(11) NOT NULL AUTO_INCREMENT,
  `RepName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `RepPhone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `RepType` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `RepNum` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `RepTime` datetime NULL DEFAULT NULL,
  `Time` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `RepService` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `RepPerson` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `RepPrice` decimal(5, 2) NULL DEFAULT NULL,
  `RepState` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CarTime` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`RepId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 79 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of repairs
-- ----------------------------
INSERT INTO `repairs` VALUES (1, '张三', '12345678987', '劳斯莱斯', '陕A322443B', '2019-12-15 00:00:00', '1.3小时', '大', '李四', 230.00, '1', '2019-12-20 00:00:00');
INSERT INTO `repairs` VALUES (2, '张三', '12345678987', '劳斯莱斯', '陕A322443B', '2019-12-15 00:00:00', '1.3小时', '大', '李四', 230.00, '1', '2019-12-20 00:00:00');
INSERT INTO `repairs` VALUES (3, '张三', '12345678987', '劳斯莱斯', '陕A322443B', '2019-12-15 00:00:00', '1.3小时', '大类型', '2', 230.00, '1', '2019-12-20 00:00:00');
INSERT INTO `repairs` VALUES (4, '张三', '12345678987', '劳斯莱斯', '陕A322443B', '2019-12-15 00:00:00', '1.3小时', '大', '李四', 230.00, '1', '2019-12-20 00:00:00');
INSERT INTO `repairs` VALUES (5, '的', '的', '的', '的', '2019-12-27 00:00:00', '2012-02-02', '小类型', '8', 15.60, '1', '2020-05-31 16:00:00');
INSERT INTO `repairs` VALUES (6, '的', '的', '的', '的', '2019-12-27 00:00:00', '1212-01-01', '小类型', '8', 111.00, '0', '1212-01-01 00:00:00');
INSERT INTO `repairs` VALUES (7, '的', '的', '的', '的', '2019-12-27 00:00:00', '1212-12-12', '小类型', '8', 12.00, '0', '1212-12-12 00:00:00');
INSERT INTO `repairs` VALUES (8, '到', '的', '的d ', '的', '2019-12-27 00:00:00', '1212-01-01', '小类型', '10', 12.00, '0', '1212-12-21 00:00:00');
INSERT INTO `repairs` VALUES (9, '的', '的', '的', '的', '2019-12-27 00:00:00', '1212-12-12', '小类型', '8', 12.00, '0', '1212-12-12 00:00:00');
INSERT INTO `repairs` VALUES (10, '的', '的', 'd', '的', '2019-12-27 00:00:00', '1212-12-12', '小类型', '24', 12.00, '1', '1212-12-12 00:00:00');
INSERT INTO `repairs` VALUES (11, '的', '的', '的', '的', '2019-12-27 00:00:00', '1212-12-12', '小类型', '8', 12.00, '0', '1212-12-12 00:00:00');
INSERT INTO `repairs` VALUES (12, 's', 's斗鱼直播', 's', 's', '2019-12-27 00:00:00', '1小时', '小类型', '14', 38.00, '0', '2019-12-29 00:00:00');
INSERT INTO `repairs` VALUES (13, 's', 's斗鱼直播', 's', 's', '2019-12-27 00:00:00', '1小时', '小类型', '14', 12.00, '0', '2018-12-15 00:00:00');
INSERT INTO `repairs` VALUES (14, 's', 's斗鱼直播', 's', 's', '2019-12-27 00:00:00', '1小时', '小类型', '32', 121.00, '0', '1212-12-12 00:00:00');
INSERT INTO `repairs` VALUES (15, 's', 's斗鱼直播', 's', 's', '2019-12-27 00:00:00', '1小时', '小类型', '14', 12.00, '0', '1501-12-12 00:00:00');
INSERT INTO `repairs` VALUES (16, 's', 's斗鱼直播', 's', 's', '2019-12-27 00:00:00', '的', '小类型', '8', 12.00, '0', '1504-12-12 00:00:00');
INSERT INTO `repairs` VALUES (17, 's', 's斗鱼直播', 's', 's', '2019-12-27 00:00:00', '的', '小类型', '8', 12.00, '0', '1548-12-12 00:00:00');
INSERT INTO `repairs` VALUES (18, 's', 's斗鱼直播', 's', 's', '2019-12-27 00:00:00', '1小时', '小类型', '8', 12.00, '0', '2018-12-12 00:00:00');
INSERT INTO `repairs` VALUES (19, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', '1小时', '小类型', '20', 12.00, '0', '2018-12-12 00:00:00');
INSERT INTO `repairs` VALUES (20, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', '的', '小类型', '8', 12.00, '0', '2015-12-12 00:00:00');
INSERT INTO `repairs` VALUES (21, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', '1', '小类型', '3', 12.00, '0', '2015-12-12 00:00:00');
INSERT INTO `repairs` VALUES (22, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', '12', '大类型', '2', 12.00, '0', '2015-12-12 00:00:00');
INSERT INTO `repairs` VALUES (23, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', '的', '小类型', '7', 12.00, '0', '2015-12-12 00:00:00');
INSERT INTO `repairs` VALUES (24, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', '的', '小类型', '13', 12.00, '0', '2015-12-12 00:00:00');
INSERT INTO `repairs` VALUES (25, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', '的', '小类型', '7', 12.00, '0', '2015-12-12 00:00:00');
INSERT INTO `repairs` VALUES (26, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', '的', '小类型', '7', 12.00, '0', '2015-12-12 00:00:00');
INSERT INTO `repairs` VALUES (27, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', '1小时', '小类型', '7', 12.00, '0', '2015-12-12 00:00:00');
INSERT INTO `repairs` VALUES (28, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', '的', '小类型', '13', 12.00, '0', '2015-12-12 00:00:00');
INSERT INTO `repairs` VALUES (29, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', '的', '小类型', '7', 12.00, '0', '2015-12-12 00:00:00');
INSERT INTO `repairs` VALUES (30, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', '的', '小类型', '7', 12.00, '0', '2155-12-12 00:00:00');
INSERT INTO `repairs` VALUES (31, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', '的', '小类型', '7', 12.00, '0', '2015-12-12 00:00:00');
INSERT INTO `repairs` VALUES (32, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', 'd ', '小类型', '7', 12.00, '0', '2015-12-12 00:00:00');
INSERT INTO `repairs` VALUES (33, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', '1', '小类型', '14', 12.00, '0', '2015-12-21 00:00:00');
INSERT INTO `repairs` VALUES (34, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', '1', '小类型', '19', 12.00, '0', '2015-12-12 00:00:00');
INSERT INTO `repairs` VALUES (35, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', 'd', '小类型', '7', 12.00, '0', '2015-12-12 00:00:00');
INSERT INTO `repairs` VALUES (36, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', '1', '小类型', '13', 12.20, '0', '2015-12-12 00:00:00');
INSERT INTO `repairs` VALUES (37, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', 'd ', '小类型', '13', 12.00, '0', '2015-12-21 00:00:00');
INSERT INTO `repairs` VALUES (38, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', 'd ', '小类型', '7', 12.00, '0', '2015-12-12 00:00:00');
INSERT INTO `repairs` VALUES (39, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', '1', '小类型', '19', 12.00, '0', '2015-12-01 00:00:00');
INSERT INTO `repairs` VALUES (40, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', 'd ', '小类型', '7', 12.00, '0', '2018-12-12 00:00:00');
INSERT INTO `repairs` VALUES (41, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', 'd ', '小类型', '7', 12.00, '0', '2018-12-12 00:00:00');
INSERT INTO `repairs` VALUES (42, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', 'd ', '小类型', '7', 12.00, '0', '2018-12-12 00:00:00');
INSERT INTO `repairs` VALUES (43, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', 'd ', '小类型', '7', 12.00, '0', '1215-12-21 00:00:00');
INSERT INTO `repairs` VALUES (44, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', 'd ', '小类型', '7', 12.00, '0', '2015-12-12 00:00:00');
INSERT INTO `repairs` VALUES (45, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', '1', '小类型', '8', 12.50, '0', '2018-12-12 00:00:00');
INSERT INTO `repairs` VALUES (46, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', '的', '大类型', '7', 12.00, '0', '2015-12-12 00:00:00');
INSERT INTO `repairs` VALUES (47, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', '1小时', '大类型', '8', 120.00, '0', '2000-11-14 00:00:00');
INSERT INTO `repairs` VALUES (48, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', '1', '小类型', '李八', 12.00, '0', '2000-11-14 00:00:00');
INSERT INTO `repairs` VALUES (49, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2019-12-27 00:00:00', '1小时', '大类型', '张七', 200.00, '1', '2019-12-25 00:00:00');
INSERT INTO `repairs` VALUES (50, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '史四', 999.00, '1', '2020-05-29 16:00:00');
INSERT INTO `repairs` VALUES (51, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '史二', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (52, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '史四', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (53, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '史二', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (54, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '史四', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (55, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '张六', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (56, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '史二', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (57, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '史二', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (58, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '史四', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (59, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '张九', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (60, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '张八', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (61, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '史一', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (62, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '张八', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (63, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '史三', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (64, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '史二', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (65, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '史五', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (66, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '史一', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (67, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '李四', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (68, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '李七', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (69, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '王五', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (70, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '史一', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (71, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '史三', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (72, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '史一', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (73, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '李七', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (74, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '史一', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (75, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '史一', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (76, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '史三', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (77, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '张八', 0.00, '0', NULL);
INSERT INTO `repairs` VALUES (78, 'jack', '13019879875', '劳斯莱斯', '陕A2333', '2020-05-29 16:00:00', '2020-05-30', '大类型', '史一', 66.00, '1', '2020-05-29 16:00:00');

-- ----------------------------
-- Table structure for selling
-- ----------------------------
DROP TABLE IF EXISTS `selling`;
CREATE TABLE `selling`  (
  `SelId` int(11) NOT NULL AUTO_INCREMENT,
  `UserName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `SellDescribe` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `SelTime` datetime NOT NULL,
  `SelName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `SelNumber` int(11) NOT NULL,
  PRIMARY KEY (`SelId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of selling
-- ----------------------------
INSERT INTO `selling` VALUES (1, '李四', '更换轮胎', '2020-01-01 00:00:00', '轮胎', 4);

-- ----------------------------
-- Table structure for service
-- ----------------------------
DROP TABLE IF EXISTS `service`;
CREATE TABLE `service`  (
  `SerId` int(11) NOT NULL AUTO_INCREMENT,
  `SerName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `SerPrice` decimal(7, 2) NOT NULL,
  `SerIntroduce` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ServiceType` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`SerId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of service
-- ----------------------------
INSERT INTO `service` VALUES (1, '修车', 120.00, '介绍1', '大');
INSERT INTO `service` VALUES (3, '的', 12.00, '的', '小');
INSERT INTO `service` VALUES (4, 's', 13.00, 'asd ', '大');

-- ----------------------------
-- Table structure for storages
-- ----------------------------
DROP TABLE IF EXISTS `storages`;
CREATE TABLE `storages`  (
  `StoId` int(11) NOT NULL AUTO_INCREMENT,
  `UserName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `StoTime` datetime NOT NULL,
  `StoName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `StoNumber` int(11) NOT NULL,
  PRIMARY KEY (`StoId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of storages
-- ----------------------------
INSERT INTO `storages` VALUES (1, '李四', '2019-12-13 00:00:00', '轮胎', 22);
INSERT INTO `storages` VALUES (2, '搜索', '2020-06-09 16:00:00', '顶顶顶', 50);

SET FOREIGN_KEY_CHECKS = 1;
