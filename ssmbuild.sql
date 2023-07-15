/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80032
 Source Host           : localhost:3306
 Source Schema         : ssmbuild

 Target Server Type    : MySQL
 Target Server Version : 80032
 File Encoding         : 65001

 Date: 15/07/2023 20:51:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `bookID` int NOT NULL AUTO_INCREMENT COMMENT '书id',
  `bookName` varchar(100) NOT NULL COMMENT '书名',
  `bookCounts` int NOT NULL COMMENT '数量',
  `detail` varchar(200) NOT NULL COMMENT '描述',
  KEY `bookID` (`bookID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of books
-- ----------------------------
BEGIN;
INSERT INTO `books` (`bookID`, `bookName`, `bookCounts`, `detail`) VALUES (1, 'Java', 2, '从入门到放弃');
INSERT INTO `books` (`bookID`, `bookName`, `bookCounts`, `detail`) VALUES (2, 'MySQL', 6, '从删库到跑路');
INSERT INTO `books` (`bookID`, `bookName`, `bookCounts`, `detail`) VALUES (3, 'Linux', 5, '从进门到进牢');
INSERT INTO `books` (`bookID`, `bookName`, `bookCounts`, `detail`) VALUES (4, '肥猫猫学Java', 1, '详细记录的肥猫猫学Java的历程');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
