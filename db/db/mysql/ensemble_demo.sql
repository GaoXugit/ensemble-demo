/*
Navicat MySQL Data Transfer

Source Server         : 192.168.165.219
Source Server Version : 50619
Source Host           : 192.168.165.219:3306
Source Database       : galaxy_stria

Target Server Type    : MYSQL
Target Server Version : 50619
File Encoding         : 65001

Date: 2016-04-15 18:02:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ac_settlement_rule
-- ----------------------------
DROP TABLE IF EXISTS `ac_settlement_rule`;
CREATE TABLE `ac_settlement_rule` (
  `BRANCH` varchar(6) NOT NULL COMMENT '机构',
  `SETTLE_LEVEL` varchar(2) NOT NULL COMMENT '清算层级',
  `SETTLE_BRANCH` varchar(16) NOT NULL COMMENT '清算机构',
  `SETTLE_SUBJECT` varchar(16) NOT NULL COMMENT '清算科目',
  `SETTLE_ACCT_SEQ` varchar(2) NOT NULL COMMENT '清算账户序号',
  `SETTLE_SUBJECT_UP` varchar(16) NOT NULL COMMENT '上级清算科目',
  `SETTLE_ACCT_SEQ_UP` varchar(2) NOT NULL COMMENT '上级清算账户序号',
  PRIMARY KEY (`BRANCH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='清算规则表';

-- ----------------------------
-- Table structure for batch_def
-- ----------------------------
DROP TABLE IF EXISTS `batch_def`;
CREATE TABLE `batch_def` (
  `BATCH_CLASS` varchar(4) NOT NULL,
  `EOD_SOD` varchar(3) DEFAULT NULL,
  `BATCH_DESC` varchar(100) DEFAULT NULL,
  UNIQUE KEY `BATCH_CLASS` (`BATCH_CLASS`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for batch_job_dependency
-- ----------------------------
DROP TABLE IF EXISTS `batch_job_dependency`;
CREATE TABLE `batch_job_dependency` (
  `DESCENDENT` varchar(30) NOT NULL,
  `PREDECESSOR` varchar(30) NOT NULL,
  `DEPENDENCY_TYPE` varchar(1) NOT NULL DEFAULT 'S',
  `STATUS` varchar(1) NOT NULL DEFAULT 'Y'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for batch_job_line_type
-- ----------------------------
DROP TABLE IF EXISTS `batch_job_line_type`;
CREATE TABLE `batch_job_line_type` (
  `DESCENDENT` varchar(30) NOT NULL,
  `PREDECESSOR` varchar(30) NOT NULL,
  `LINE_TYPE` varchar(10) NOT NULL DEFAULT 'sl',
  `M_VALUE` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for batch_job_pos
-- ----------------------------
DROP TABLE IF EXISTS `batch_job_pos`;
CREATE TABLE `batch_job_pos` (
  `JOB_ID` varchar(30) NOT NULL,
  `TOP_POS` int(11) NOT NULL,
  `LEFT_POS` int(11) NOT NULL,
  `WIDTH` int(11) NOT NULL,
  `HEIGHT` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for batch_job_split_param
-- ----------------------------
DROP TABLE IF EXISTS `batch_job_split_param`;
CREATE TABLE `batch_job_split_param` (
  `JOB_ID` varchar(30) NOT NULL,
  `SPLIT_CLASS` varchar(1) NOT NULL DEFAULT 'T',
  `SPLIT_TYPE` varchar(1) NOT NULL DEFAULT 'S',
  `SPLIT_CNT` int(11) DEFAULT NULL,
  `MAX_PER_SPLIT` int(11) DEFAULT NULL,
  `NAMESPACE` varchar(150) DEFAULT NULL,
  `SQL_ID` varchar(50) DEFAULT NULL,
  `FILE_PATH` varchar(100) DEFAULT NULL,
  `FILE_NAME` varchar(100) DEFAULT NULL,
  `FILE_FORMAT` varchar(50) DEFAULT NULL,
  `FILE_ROW_NAME` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for batch_param_table_def
-- ----------------------------
DROP TABLE IF EXISTS `batch_param_table_def`;
CREATE TABLE `batch_param_table_def` (
  `SEQ_NO` varchar(32) DEFAULT NULL,
  `TABLE_NAME` varchar(30) DEFAULT NULL,
  `TARGET_TABLE_NAME` varchar(30) DEFAULT NULL,
  `DATA_SOURCE` varchar(20) DEFAULT NULL,
  `SELECT_NAMESPACE` varchar(100) DEFAULT NULL,
  `SELECT_SQL_ID` varchar(50) DEFAULT NULL,
  `INSERT_NAMESPACE` varchar(100) DEFAULT NULL,
  `INSERT_SQL_ID` varchar(50) DEFAULT NULL,
  `WHERE_SQL` varchar(1000) DEFAULT NULL,
  `BATCH_SIZE` int(11) DEFAULT NULL,
  UNIQUE KEY `BATCH_PARAM_TABLE_DEF_PK` (`SEQ_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for batch_run_job
-- ----------------------------
DROP TABLE IF EXISTS `batch_run_job`;
CREATE TABLE `batch_run_job` (
  `JOB_ID` varchar(30) DEFAULT NULL,
  `JOB_STATUS` varchar(1) DEFAULT NULL,
  `SPLIT_CNT` int(11) DEFAULT NULL,
  `FINISH_CNT` int(11) DEFAULT NULL,
  `START_TIME` varchar(30) DEFAULT NULL,
  `END_TIME` varchar(30) DEFAULT NULL,
  `PERCENT` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for batch_run_task
-- ----------------------------
DROP TABLE IF EXISTS `batch_run_task`;
CREATE TABLE `batch_run_task` (
  `TASK_ID` varchar(50) NOT NULL,
  `JOB_ID` varchar(30) NOT NULL,
  `TASK_STATUS` varchar(1) NOT NULL DEFAULT 'N',
  `SEQ_NO` int(11) DEFAULT NULL,
  `START_ROW` int(11) DEFAULT NULL,
  `END_ROW` int(11) DEFAULT NULL,
  `FILE_OFFSET` int(11) DEFAULT NULL,
  `FILE_LIMIT` int(11) DEFAULT NULL,
  `SCHEMA_ID` varchar(30) DEFAULT NULL,
  `NODE_IP` varchar(30) DEFAULT NULL,
  `ERROR_DESC` varchar(5000) DEFAULT NULL,
  `START_TIME` varchar(30) DEFAULT NULL,
  `END_TIME` varchar(30) DEFAULT NULL,
  `SPLIT_JOB_ID` varchar(30) DEFAULT NULL,
  `SYSTEM_ID` varchar(30) DEFAULT NULL,
  `APP_ID` varchar(50) DEFAULT NULL,
  `RUN_MSG` varchar(200) DEFAULT NULL,
  `TASK_IND` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for batch_status
-- ----------------------------
DROP TABLE IF EXISTS `batch_status`;
CREATE TABLE `batch_status` (
  `RUN_DATE` varchar(8) DEFAULT NULL,
  `BATCH_CLASS` varchar(4) DEFAULT NULL,
  `BATCH_STATUS` varchar(3) DEFAULT NULL,
  `STOP_BATCH` varchar(1) DEFAULT NULL,
  `START_TIME` varchar(30) DEFAULT NULL,
  `END_TIME` varchar(30) DEFAULT NULL,
  `BATCH_IND` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for batch_std_job
-- ----------------------------
DROP TABLE IF EXISTS `batch_std_job`;
CREATE TABLE `batch_std_job` (
  `JOB_ID` varchar(30) NOT NULL,
  `JOB_NAME` varchar(100) NOT NULL,
  `BATCH_CLASS` varchar(4) NOT NULL,
  `JOB_TYPE` varchar(4) NOT NULL,
  `JOB_DESC` varchar(100) DEFAULT NULL,
  `MODULE_ID` varchar(4) NOT NULL,
  `SYSTEM_ID` varchar(30) NOT NULL,
  `DAY_END` varchar(1) NOT NULL DEFAULT 'Y',
  `WEEK_END` varchar(1) NOT NULL DEFAULT 'N',
  `MTH_END` varchar(1) NOT NULL DEFAULT 'N',
  `YR_END` varchar(1) NOT NULL DEFAULT 'N',
  `IS_SKIP` varchar(1) NOT NULL DEFAULT 'N',
  `GX_CLASS_NAME` varchar(100) DEFAULT NULL,
  `GX_METHOD` varchar(30) DEFAULT NULL,
  `STATIC_PARAM` varchar(100) DEFAULT NULL,
  `SHARD_MANAGER_ID` varchar(30) DEFAULT NULL,
  `BY_SCHEMA` varchar(1) NOT NULL DEFAULT 'N',
  `IS_SPLIT` varchar(1) NOT NULL DEFAULT 'N',
  `STATUS` varchar(1) NOT NULL DEFAULT 'Y',
  UNIQUE KEY `JOB_ID` (`JOB_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for batch_table_def
-- ----------------------------
DROP TABLE IF EXISTS `batch_table_def`;
CREATE TABLE `batch_table_def` (
  `BATCH_TABLE_ID` varchar(20) DEFAULT NULL,
  `TABLE_NAME` varchar(30) DEFAULT NULL,
  `TARGET_TABLE_NAME` varchar(30) DEFAULT NULL,
  `SELECT_NAMESPACE` varchar(100) DEFAULT NULL,
  `SELECT_SQL_ID` varchar(50) DEFAULT NULL,
  `INSERT_NAMESPACE` varchar(100) DEFAULT NULL,
  `INSERT_SQL_ID` varchar(50) DEFAULT NULL,
  `WHERE_SQL` varchar(1000) DEFAULT NULL,
  `BATCH_SIZE` int(11) DEFAULT NULL,
  UNIQUE KEY `BATCH_TABLE_ID` (`BATCH_TABLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for demo_acct
-- ----------------------------
DROP TABLE IF EXISTS `demo_acct`;
CREATE TABLE `demo_acct` (
  `uuid` varchar(32) NOT NULL,
  `acct_no` varchar(20) NOT NULL,
  `acct_name` varchar(50) NOT NULL,
  `create_time` varchar(9) NOT NULL,
  `create_date` varchar(8) NOT NULL,
  `bal` decimal(17,2) NOT NULL,
  `status` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for demo_clacct
-- ----------------------------
DROP TABLE IF EXISTS `demo_clacct`;
CREATE TABLE `demo_clacct` (
  `uuid` varchar(32) NOT NULL COMMENT '唯一编号',
  `acct_no` varchar(20) NOT NULL COMMENT '账号',
  `acct_name` varchar(50) NOT NULL COMMENT '账号名称',
  `create_time` varchar(9) NOT NULL COMMENT '创建时间',
  `create_date` varchar(8) NOT NULL COMMENT '创建日期',
  `bal` decimal(17,2) NOT NULL COMMENT '余额',
  `status` varchar(1) NOT NULL COMMENT '状态A-活动，C-销户',
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账户示例表';

-- ----------------------------
-- Table structure for dtp_branch
-- ----------------------------
DROP TABLE IF EXISTS `dtp_branch`;
CREATE TABLE `dtp_branch` (
  `bxid` varchar(32) NOT NULL,
  `parentBxid` varchar(32) DEFAULT NULL,
  `txid` varchar(32) NOT NULL,
  `indexInBranch` int(11) NOT NULL DEFAULT '-1',
  `indexInTrunk` int(11) NOT NULL DEFAULT '-1',
  `status` varchar(20) NOT NULL,
  `appGroup` varchar(50) NOT NULL,
  PRIMARY KEY (`bxid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for dtp_preparelog
-- ----------------------------
DROP TABLE IF EXISTS `dtp_preparelog`;
CREATE TABLE `dtp_preparelog` (
  `logId` varchar(32) NOT NULL,
  `bxid` varchar(32) NOT NULL,
  `txid` varchar(32) NOT NULL,
  `logIndex` int(11) NOT NULL DEFAULT '-1',
  `content` blob NOT NULL,
  `status` varchar(10) NOT NULL,
  PRIMARY KEY (`logId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for dtp_submitlog
-- ----------------------------
DROP TABLE IF EXISTS `dtp_submitlog`;
CREATE TABLE `dtp_submitlog` (
  `logId` varchar(32) NOT NULL,
  `bxid` varchar(32) NOT NULL,
  `txid` varchar(32) NOT NULL,
  `logIndex` int(11) NOT NULL DEFAULT '-1',
  `content` blob NOT NULL,
  `status` varchar(10) NOT NULL,
  PRIMARY KEY (`logId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for dtp_trunk
-- ----------------------------
DROP TABLE IF EXISTS `dtp_trunk`;
CREATE TABLE `dtp_trunk` (
  `txid` varchar(32) NOT NULL,
  `needOrder` varchar(8) NOT NULL,
  `status` varchar(20) NOT NULL,
  `appGroup` varchar(50) NOT NULL,
  `startTime` decimal(32,0) NOT NULL DEFAULT '0',
  PRIMARY KEY (`txid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for fm_resource_lock
-- ----------------------------
DROP TABLE IF EXISTS `fm_resource_lock`;
CREATE TABLE `fm_resource_lock` (
  `MODULE_ID` varchar(4) NOT NULL COMMENT '模块',
  `RESOURCE_ID` varchar(50) NOT NULL COMMENT '资源ID',
  `STATUS` varchar(1) DEFAULT NULL COMMENT '状态： L锁定',
  `TXID` varchar(20) NOT NULL COMMENT '事务ID',
  PRIMARY KEY (`MODULE_ID`,`RESOURCE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for fw_reversal_tran
-- ----------------------------
DROP TABLE IF EXISTS `fw_reversal_tran`;
CREATE TABLE `fw_reversal_tran` (
  `REVERSAL_ID` varchar(50) DEFAULT NULL,
  `REVERSAL_ARGS` blob,
  `TRAN_DATE` varchar(20) DEFAULT NULL,
  `REVERSAL_DATE` varchar(20) DEFAULT NULL,
  `MAX_REVERSAL_CNT` int(11) DEFAULT NULL,
  `REVERSAL_CNT` int(11) DEFAULT NULL,
  `REVERSAL_BEAN_ID` varchar(20) DEFAULT NULL,
  `RET_CODE` varchar(20) DEFAULT NULL,
  `RET_MSG` varchar(100) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  UNIQUE KEY `FW_REVERSAL_TRAN_pk` (`REVERSAL_ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for fw_tran_info
-- ----------------------------
DROP TABLE IF EXISTS `fw_tran_info`;
CREATE TABLE `fw_tran_info` (
  `SERVICE_ID` varchar(100) DEFAULT NULL,
  `KEY_VALUE` varchar(200) DEFAULT NULL,
  `TRAN_DATE` varchar(20) DEFAULT NULL,
  `TRAN_TIME` varchar(30) DEFAULT NULL,
  `IN_MSG` text,
  `OUT_MSG` text,
  `END_TIME` varchar(30) DEFAULT NULL,
  `BEAN_RESULT` blob,
  `SOURCE_TYPE` varchar(2) DEFAULT NULL,
  `SEQ_NO` varchar(50) DEFAULT NULL,
  `PROGRAM_ID` varchar(10) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `REFERENCE` varchar(50) DEFAULT NULL,
  `PLATFORM_ID` varchar(32) DEFAULT NULL,
  `REVERSAL_KEY_VALUE` varchar(200) DEFAULT NULL,
  UNIQUE KEY `fw_tran_info_pk` (`KEY_VALUE`) USING BTREE,
  KEY `fw_tran_info_idx1` (`TRAN_DATE`),
  KEY `fw_tran_info_idx2` (`TRAN_TIME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for stria_flow
-- ----------------------------
DROP TABLE IF EXISTS `stria_flow`;
CREATE TABLE `stria_flow` (
  `FLOWID` varchar(30) NOT NULL COMMENT '流程ID',
  `FLOW_TYPE` varchar(2) NOT NULL DEFAULT '01' COMMENT '流程类型 01-服务流程；02-事件流程',
  `TITLE` varchar(50) DEFAULT NULL COMMENT '流程描述',
  `INIT_NUM` decimal(4,0) DEFAULT NULL COMMENT '初始流程节数',
  `VERSION` varchar(10) DEFAULT NULL COMMENT '版本号',
  `STATE` decimal(1,0) DEFAULT '1' COMMENT '可用开关',
  `CREATETIME` varchar(20) DEFAULT NULL COMMENT '创建时间',
  `CREATOR` varchar(20) DEFAULT NULL COMMENT '创建人',
  `DTP_FLAG` varchar(1) DEFAULT NULL COMMENT '全局事物管理开关',
  `TIME_OUT` decimal(4,0) DEFAULT NULL COMMENT '流程处理超时时间',
  `PROD_TYPE` varchar(10) DEFAULT NULL COMMENT '产品类型',
  `EVENT_TYPE` varchar(20) DEFAULT NULL COMMENT '事件类型',
  PRIMARY KEY (`FLOWID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Stria流程定义';

-- ----------------------------
-- Table structure for stria_flow_lines
-- ----------------------------
DROP TABLE IF EXISTS `stria_flow_lines`;
CREATE TABLE `stria_flow_lines` (
  `FLOWID` varchar(30) NOT NULL COMMENT '流程ID',
  `ID` varchar(30) NOT NULL COMMENT '连接线ID',
  `NAME` varchar(50) NOT NULL COMMENT '连接线描述',
  `TYPE` varchar(20) NOT NULL COMMENT '节点类型',
  `FROM_NODE` varchar(20) DEFAULT NULL COMMENT '源节点',
  `TO_NODE` varchar(20) DEFAULT NULL COMMENT '目标节点',
  `EXPR` varchar(300) DEFAULT NULL COMMENT '布尔类型表达式，用于决策节点后的连接线',
  PRIMARY KEY (`FLOWID`,`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Stria流程连接线定义';

-- ----------------------------
-- Table structure for stria_flow_nodes
-- ----------------------------
DROP TABLE IF EXISTS `stria_flow_nodes`;
CREATE TABLE `stria_flow_nodes` (
  `FLOWID` varchar(30) NOT NULL COMMENT '流程ID',
  `ID` varchar(30) NOT NULL COMMENT '节点ID',
  `NAME` varchar(50) NOT NULL COMMENT '节点描述',
  `TYPE` varchar(20) NOT NULL COMMENT '节点类型',
  `CANVAS_TOP` decimal(4,0) DEFAULT NULL COMMENT '据上边界偏移量',
  `CANVAS_LEFT` decimal(4,0) DEFAULT NULL COMMENT '据左边界偏移量',
  `DIV_WIDTH` decimal(4,0) DEFAULT NULL COMMENT '节点图形宽度',
  `DIV_HEIGHT` decimal(4,0) DEFAULT NULL COMMENT '节点图形高度',
  `SOURCE_TYPE` varchar(50) DEFAULT NULL COMMENT '渠道',
  `SERVICE_TYPE` varchar(20) DEFAULT NULL COMMENT '服务类型',
  `CLAZZ` varchar(300) DEFAULT NULL COMMENT '服务执行class',
  `METHOD_NAME` varchar(30) DEFAULT NULL COMMENT '服务执行方法',
  `ARGS` varchar(300) DEFAULT NULL COMMENT '参数取值表达式',
  `ARGS_CLAZZ` varchar(300) DEFAULT NULL COMMENT '参数class',
  `VAR` varchar(20) DEFAULT NULL COMMENT '输出别名定义',
  `SUB_CONDITION` varchar(300) DEFAULT NULL,
  `REQUEST` varchar(20) DEFAULT NULL,
  `SERVICE_CODE` varchar(20) DEFAULT NULL,
  `MESSAGE_TYPE` varchar(4) DEFAULT NULL,
  `MESSAGE_CODE` varchar(4) DEFAULT NULL,
  `EVENT_ID` varchar(30) DEFAULT NULL COMMENT '事件ID',
  PRIMARY KEY (`FLOWID`,`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Stria流程节点定义';

-- ----------------------------
-- Table structure for test_partition
-- ----------------------------
DROP TABLE IF EXISTS `test_partition`;
CREATE TABLE `test_partition` (
  `id` varchar(10) DEFAULT NULL,
  `tran_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8
/*!50100 PARTITION BY LIST (DAYOFWEEK(tran_date))
(PARTITION p7 VALUES IN (7) ENGINE = InnoDB,
 PARTITION p5 VALUES IN (5) ENGINE = InnoDB) */;
