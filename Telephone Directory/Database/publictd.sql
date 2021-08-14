/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : PostgreSQL
 Source Server Version : 130001
 Source Host           : localhost:5432
 Source Catalog        : telephone_directory
 Source Schema         : publictd

 Target Server Type    : PostgreSQL
 Target Server Version : 130001
 File Encoding         : 65001

 Date: 14/08/2021 14:54:33
*/


-- ----------------------------
-- Table structure for enrolle
-- ----------------------------

DROP SCHEMA IF EXISTS "publictd";
CREATE SCHEMA "publictd";
DROP TABLE IF EXISTS "publictd"."enrolle";
CREATE TABLE "publictd"."enrolle" (
  "id" varchar(255) COLLATE "pg_catalog"."default" NOT NULL,
  "name" varchar(255) COLLATE "pg_catalog"."default",
  "surname" varchar(255) COLLATE "pg_catalog"."default",
  "phone_number" varchar(255) COLLATE "pg_catalog"."default",
  "description" varchar(255) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Primary Key structure for table enrolle
-- ----------------------------
ALTER TABLE "publictd"."enrolle" ADD CONSTRAINT "enrolle_pkey" PRIMARY KEY ("id");
