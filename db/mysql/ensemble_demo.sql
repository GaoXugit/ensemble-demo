/*
Navicat MySQL Data Transfer

Source Server         : 10.7.94.165
Source Server Version : 50557
Source Host           : 10.7.94.165:3306
Source Database       : ensemble_demo

Target Server Type    : MYSQL
Target Server Version : 50557
File Encoding         : 65001

Date: 2018-08-24 09:44:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for batch_data_sync_def
-- ----------------------------
DROP TABLE IF EXISTS `batch_data_sync_def`;
CREATE TABLE `batch_data_sync_def` (
  `SYNC_ID` varchar(30) NOT NULL COMMENT '同步ID',
  `SYNC_FLAG` varchar(4) NOT NULL COMMENT '同步标识',
  `SHARD_MANAGE_ID` varchar(50) DEFAULT NULL COMMENT '数据源ID',
  `TABLE_NAME` varchar(30) NOT NULL COMMENT '表名',
  `KEY_FIELD` varchar(30) DEFAULT NULL COMMENT '分段关键字',
  `WHERE_SQL` varchar(1000) DEFAULT NULL COMMENT '查询条件',
  `SELECT_NAMESPACE` varchar(100) DEFAULT NULL COMMENT '查询命名空间',
  `SELECT_SQL_ID` varchar(50) DEFAULT NULL COMMENT '查询SQL ID',
  `FILE_PATH` varchar(100) DEFAULT NULL COMMENT '文件路径',
  `FILE_NAME` varchar(100) DEFAULT NULL COMMENT '文件名',
  `FILE_WRITE_TYPE` varchar(2) DEFAULT NULL COMMENT '文件写入类型：增量和全量',
  `FILE_FORMAT` varchar(100) DEFAULT NULL COMMENT '文件格式',
  `INSERT_SHARD_MANAGE_ID` varchar(50) DEFAULT NULL COMMENT 'inser数据源ID',
  `TARGET_TABLE_NAME` varchar(30) DEFAULT NULL COMMENT '目标表名',
  `MATCH_FLAG` varchar(1) DEFAULT NULL COMMENT '是否匹配数据库',
  `INSERT_NAMESPACE` varchar(100) DEFAULT NULL COMMENT 'insert命名空间',
  `INSERT_SQL_ID` varchar(50) DEFAULT NULL COMMENT 'insertsqlID',
  UNIQUE KEY `SYNC_ID_INDEX` (`SYNC_ID`) USING HASH COMMENT 'index'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='数据同步定义表';

-- ----------------------------
-- Records of batch_data_sync_def
-- ----------------------------

-- ----------------------------
-- Table structure for batch_def
-- ----------------------------
DROP TABLE IF EXISTS `batch_def`;
CREATE TABLE `batch_def` (
  `BATCH_CLASS` varchar(4) NOT NULL COMMENT '分类',
  `EOD_SOD` varchar(3) DEFAULT NULL COMMENT '该批处理日切前跑还是日切后跑',
  `BATCH_DESC` varchar(100) DEFAULT NULL COMMENT '批处理描述',
  UNIQUE KEY `BATCH_CLASS` (`BATCH_CLASS`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='批处理定义表';

-- ----------------------------
-- Records of batch_def
-- ----------------------------

-- ----------------------------
-- Table structure for batch_job_dependency
-- ----------------------------
DROP TABLE IF EXISTS `batch_job_dependency`;
CREATE TABLE `batch_job_dependency` (
  `DESCENDENT` varchar(30) NOT NULL COMMENT 'JOB_ID',
  `PREDECESSOR` varchar(30) NOT NULL COMMENT '依赖的JOB_ID',
  `DEPENDENCY_TYPE` varchar(1) NOT NULL DEFAULT 'S' COMMENT '依赖类型',
  `STATUS` varchar(1) NOT NULL DEFAULT 'Y' COMMENT '状态'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='JOB依赖关系表';

-- ----------------------------
-- Records of batch_job_dependency
-- ----------------------------

-- ----------------------------
-- Table structure for batch_job_line_type
-- ----------------------------
DROP TABLE IF EXISTS `batch_job_line_type`;
CREATE TABLE `batch_job_line_type` (
  `DESCENDENT` varchar(30) NOT NULL COMMENT 'JOB_ID',
  `PREDECESSOR` varchar(30) NOT NULL COMMENT '依赖的JOB_ID',
  `LINE_TYPE` varchar(10) NOT NULL DEFAULT 'sl' COMMENT '线形状',
  `M_VALUE` double DEFAULT NULL COMMENT 'M值'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='JOB依赖关系图形化配置表';

-- ----------------------------
-- Records of batch_job_line_type
-- ----------------------------

-- ----------------------------
-- Table structure for batch_job_pos
-- ----------------------------
DROP TABLE IF EXISTS `batch_job_pos`;
CREATE TABLE `batch_job_pos` (
  `JOB_ID` varchar(30) NOT NULL COMMENT '批处理JOB标识',
  `TOP_POS` int(11) NOT NULL COMMENT '距离左边界',
  `LEFT_POS` int(11) NOT NULL COMMENT '距离上边界',
  `WIDTH` int(11) NOT NULL COMMENT '宽度',
  `HEIGHT` int(11) NOT NULL COMMENT '高度'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='批处理JOB图形化配置表';

-- ----------------------------
-- Records of batch_job_pos
-- ----------------------------

-- ----------------------------
-- Table structure for batch_job_split_param
-- ----------------------------
DROP TABLE IF EXISTS `batch_job_split_param`;
CREATE TABLE `batch_job_split_param` (
  `JOB_ID` varchar(30) NOT NULL COMMENT '批处理JOB标识',
  `SPLIT_CLASS` varchar(1) NOT NULL DEFAULT 'T' COMMENT '分段类型',
  `SPLIT_TYPE` varchar(1) NOT NULL DEFAULT 'S' COMMENT '分段类型',
  `SPLIT_CNT` int(11) DEFAULT NULL COMMENT '分几段',
  `MAX_PER_SPLIT` int(11) DEFAULT NULL COMMENT '每段最大执行条数',
  `NAMESPACE` varchar(150) DEFAULT NULL COMMENT '需要分段的表对应的统计SQL的命名空间',
  `SQL_ID` varchar(50) DEFAULT NULL COMMENT '需要分段的表对应的统计SQL',
  `FILE_PATH` varchar(100) DEFAULT NULL COMMENT '分段文件路径',
  `FILE_NAME` varchar(100) DEFAULT NULL COMMENT '分段文件名',
  `FILE_FORMAT` varchar(50) DEFAULT NULL COMMENT '文件格式',
  `FILE_ROW_NAME` varchar(50) DEFAULT NULL COMMENT '文件行数定义名'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='JOB分段参数表';

-- ----------------------------
-- Records of batch_job_split_param
-- ----------------------------

-- ----------------------------
-- Table structure for batch_machine
-- ----------------------------
DROP TABLE IF EXISTS `batch_machine`;
CREATE TABLE `batch_machine` (
  `GROUP_ID` varchar(32) NOT NULL COMMENT '服务组ID',
  `IP` varchar(32) NOT NULL COMMENT '服务器IP'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='批处理主调管理表';

-- ----------------------------
-- Records of batch_machine
-- ----------------------------

-- ----------------------------
-- Table structure for batch_machine_all
-- ----------------------------
DROP TABLE IF EXISTS `batch_machine_all`;
CREATE TABLE `batch_machine_all` (
  `GROUP_ID` varchar(32) NOT NULL COMMENT '服务组ID',
  `IP` varchar(32) NOT NULL COMMENT '服务器IP',
  `PRE_FLAG` varchar(1) NOT NULL COMMENT '主备标识'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='批处理主调管理表';

-- ----------------------------
-- Records of batch_machine_all
-- ----------------------------

-- ----------------------------
-- Table structure for batch_param_table_def
-- ----------------------------
DROP TABLE IF EXISTS `batch_param_table_def`;
CREATE TABLE `batch_param_table_def` (
  `SEQ_NO` varchar(32) DEFAULT NULL COMMENT '序号',
  `TABLE_NAME` varchar(30) DEFAULT NULL COMMENT '表名',
  `TARGET_TABLE_NAME` varchar(30) DEFAULT NULL COMMENT '目标表名',
  `DATA_SOURCE` varchar(20) DEFAULT NULL COMMENT '静态参数',
  `SELECT_NAMESPACE` varchar(100) DEFAULT NULL COMMENT '查询命名空间',
  `SELECT_SQL_ID` varchar(50) DEFAULT NULL COMMENT '查询ID',
  `INSERT_NAMESPACE` varchar(100) DEFAULT NULL COMMENT 'insert命名空间',
  `INSERT_SQL_ID` varchar(50) DEFAULT NULL COMMENT 'insert SQL ID',
  `WHERE_SQL` varchar(1000) DEFAULT NULL COMMENT '查询条件',
  `BATCH_SIZE` int(11) DEFAULT NULL COMMENT '批量提交数',
  UNIQUE KEY `BATCH_PARAM_TABLE_DEF_PK` (`SEQ_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='批量参数同步表';

-- ----------------------------
-- Records of batch_param_table_def
-- ----------------------------

-- ----------------------------
-- Table structure for batch_run_job
-- ----------------------------
DROP TABLE IF EXISTS `batch_run_job`;
CREATE TABLE `batch_run_job` (
  `JOB_ID` varchar(30) DEFAULT NULL COMMENT '批处理JOB标识',
  `JOB_STATUS` varchar(1) DEFAULT NULL COMMENT '状态',
  `SPLIT_CNT` int(11) DEFAULT NULL COMMENT '实际分段数',
  `FINISH_CNT` int(11) DEFAULT NULL COMMENT '已完成分段数',
  `START_TIME` varchar(30) DEFAULT NULL COMMENT '开始时间',
  `END_TIME` varchar(30) DEFAULT NULL COMMENT '结束时间',
  `PERCENT` varchar(30) DEFAULT NULL COMMENT '完成百分比',
  `FAIL_CNT` int(11) NOT NULL DEFAULT '0' COMMENT '失败task数',
  `SPLIT_FAIL_CNT` int(11) NOT NULL DEFAULT '0' COMMENT '分段失败个数',
  UNIQUE KEY `BATCH_RUN_JOB_ID` (`JOB_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运行JOB记录表';

-- ----------------------------
-- Records of batch_run_job
-- ----------------------------

-- ----------------------------
-- Table structure for batch_run_job_hist
-- ----------------------------
DROP TABLE IF EXISTS `batch_run_job_hist`;
CREATE TABLE `batch_run_job_hist` (
  `JOB_ID` varchar(30) DEFAULT NULL COMMENT '批处理JOB标识',
  `JOB_STATUS` varchar(1) DEFAULT NULL COMMENT '状态',
  `SPLIT_CNT` int(11) DEFAULT NULL COMMENT '实际分段数',
  `FINISH_CNT` int(11) DEFAULT NULL COMMENT '已完成分段数',
  `START_TIME` varchar(30) DEFAULT NULL COMMENT '开始时间',
  `END_TIME` varchar(30) DEFAULT NULL COMMENT '结束时间',
  `PERCENT` varchar(30) DEFAULT NULL COMMENT '完成百分比',
  `RUN_DATE` varchar(8) DEFAULT NULL COMMENT '执行时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运行JOB记录表';

-- ----------------------------
-- Records of batch_run_job_hist
-- ----------------------------

-- ----------------------------
-- Table structure for batch_run_task
-- ----------------------------
DROP TABLE IF EXISTS `batch_run_task`;
CREATE TABLE `batch_run_task` (
  `TASK_ID` varchar(50) NOT NULL COMMENT 'TASK标识',
  `JOB_ID` varchar(30) NOT NULL COMMENT '批处理过程标识',
  `TASK_STATUS` varchar(1) NOT NULL DEFAULT 'N' COMMENT '状态',
  `SEQ_NO` int(11) DEFAULT NULL COMMENT '是该JOB的第几个TASK',
  `START_ROW` bigint(20) DEFAULT NULL COMMENT '开始行数',
  `END_ROW` bigint(20) DEFAULT NULL COMMENT '结束行数',
  `FILE_OFFSET` int(11) DEFAULT NULL COMMENT '文件分段开始',
  `FILE_LIMIT` int(11) DEFAULT NULL COMMENT '文件分段结束',
  `SCHEMA_ID` varchar(30) DEFAULT NULL COMMENT 'SCHEMA',
  `NODE_IP` varchar(30) DEFAULT NULL COMMENT '执行节点IP',
  `ERROR_DESC` varchar(5000) DEFAULT NULL COMMENT '错误描述',
  `START_TIME` varchar(30) DEFAULT NULL COMMENT '开始时间',
  `END_TIME` varchar(30) DEFAULT NULL COMMENT '结束时间',
  `SPLIT_JOB_ID` varchar(30) DEFAULT NULL COMMENT '需要分段的JOB_ID',
  `SYSTEM_ID` varchar(30) DEFAULT NULL COMMENT '系统ID',
  `APP_ID` varchar(50) DEFAULT NULL COMMENT 'HADOOP系统返回的值，用于监听JOB是否完成',
  `RUN_MSG` varchar(200) DEFAULT NULL COMMENT 'task运行信息',
  `TASK_IND` varchar(50) DEFAULT NULL COMMENT 'TASK标识',
  `START_KEY` varchar(100) DEFAULT NULL COMMENT '开始行数关键字',
  `END_KEY` varchar(100) DEFAULT NULL COMMENT '结束行数关键字',
  `ERROR_MSG` varchar(500) DEFAULT NULL COMMENT '错误信息',
  `TIME_ELAPSED` bigint(20) DEFAULT NULL COMMENT '结束行数关键字',
  `ROW_COUNT` int(11) DEFAULT NULL COMMENT '每段条数',
  UNIQUE KEY `BATCH_RUN_TASK_ID` (`TASK_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运行TASK记录表';

-- ----------------------------
-- Records of batch_run_task
-- ----------------------------

-- ----------------------------
-- Table structure for batch_run_task_hist
-- ----------------------------
DROP TABLE IF EXISTS `batch_run_task_hist`;
CREATE TABLE `batch_run_task_hist` (
  `TASK_ID` varchar(50) NOT NULL COMMENT 'TASK标识',
  `JOB_ID` varchar(30) NOT NULL COMMENT '批处理过程标识',
  `TASK_STATUS` varchar(1) NOT NULL DEFAULT 'N' COMMENT '状态',
  `SEQ_NO` int(11) DEFAULT NULL COMMENT '是该JOB的第几个TASK',
  `START_ROW` bigint(20) DEFAULT NULL COMMENT '开始行数',
  `END_ROW` bigint(20) DEFAULT NULL COMMENT '结束行数',
  `FILE_OFFSET` int(11) DEFAULT NULL COMMENT '文件分段开始',
  `FILE_LIMIT` int(11) DEFAULT NULL COMMENT '文件分段结束',
  `SCHEMA_ID` varchar(30) DEFAULT NULL COMMENT 'SCHEMA',
  `NODE_IP` varchar(30) DEFAULT NULL COMMENT '执行节点IP',
  `ERROR_DESC` varchar(5000) DEFAULT NULL COMMENT '错误描述',
  `START_TIME` varchar(30) DEFAULT NULL COMMENT '开始时间',
  `END_TIME` varchar(30) DEFAULT NULL COMMENT '结束时间',
  `SPLIT_JOB_ID` varchar(30) DEFAULT NULL COMMENT '需要分段的JOB_ID',
  `SYSTEM_ID` varchar(30) DEFAULT NULL COMMENT '系统ID',
  `APP_ID` varchar(50) DEFAULT NULL COMMENT 'HADOOP系统返回的值，用于监听JOB是否完成',
  `RUN_MSG` varchar(200) DEFAULT NULL COMMENT '运行信息',
  `TASK_IND` varchar(50) DEFAULT NULL COMMENT 'TASK标识',
  `START_KEY` varchar(100) DEFAULT NULL COMMENT '开始行数关键字',
  `END_KEY` varchar(100) DEFAULT NULL COMMENT '结束行数关键字',
  `ERROR_MSG` varchar(500) DEFAULT NULL COMMENT '出错信息',
  `TIME_ELAPSED` bigint(20) DEFAULT NULL COMMENT '结束行数关键字',
  `RUN_DATE` varchar(8) DEFAULT NULL COMMENT '运行日期',
  `ROW_COUNT` int(11) DEFAULT NULL COMMENT '记录数'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运行TASK记录表';

-- ----------------------------
-- Records of batch_run_task_hist
-- ----------------------------

-- ----------------------------
-- Table structure for batch_status
-- ----------------------------
DROP TABLE IF EXISTS `batch_status`;
CREATE TABLE `batch_status` (
  `RUN_DATE` varchar(8) DEFAULT NULL COMMENT '运行日期',
  `BATCH_CLASS` varchar(4) DEFAULT NULL COMMENT '批处理类型',
  `BATCH_STATUS` varchar(3) DEFAULT NULL COMMENT '批处理状态',
  `STOP_BATCH` varchar(1) DEFAULT NULL COMMENT '手动停止',
  `START_TIME` varchar(30) DEFAULT NULL COMMENT '开始时间',
  `END_TIME` varchar(30) DEFAULT NULL COMMENT '完成时间',
  `BATCH_IND` varchar(50) DEFAULT NULL COMMENT '批处理系统标识'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='批处理运行状态表';

-- ----------------------------
-- Records of batch_status
-- ----------------------------

-- ----------------------------
-- Table structure for batch_status_hist
-- ----------------------------
DROP TABLE IF EXISTS `batch_status_hist`;
CREATE TABLE `batch_status_hist` (
  `RUN_DATE` varchar(8) DEFAULT NULL COMMENT '运行日期',
  `BATCH_CLASS` varchar(4) DEFAULT NULL COMMENT '批处理类型',
  `BATCH_STATUS` varchar(3) DEFAULT NULL COMMENT '批处理历史状态',
  `STOP_BATCH` varchar(1) DEFAULT NULL COMMENT '手动停止',
  `START_TIME` varchar(30) DEFAULT NULL COMMENT '开始时间',
  `END_TIME` varchar(30) DEFAULT NULL COMMENT '完成时间',
  `BATCH_IND` varchar(50) DEFAULT NULL COMMENT '批处理系统标识'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='批处理运行状态表';

-- ----------------------------
-- Records of batch_status_hist
-- ----------------------------

-- ----------------------------
-- Table structure for batch_std_job
-- ----------------------------
DROP TABLE IF EXISTS `batch_std_job`;
CREATE TABLE `batch_std_job` (
  `JOB_ID` varchar(30) NOT NULL COMMENT '批处理JOB标识',
  `JOB_NAME` varchar(100) NOT NULL COMMENT '调用JOB的名字',
  `BATCH_CLASS` varchar(4) NOT NULL COMMENT '分类',
  `JOB_TYPE` varchar(4) NOT NULL COMMENT 'JOB类型',
  `JOB_DESC` varchar(100) DEFAULT NULL COMMENT 'JOB描述',
  `MODULE_ID` varchar(4) NOT NULL COMMENT '模块',
  `SYSTEM_ID` varchar(30) NOT NULL COMMENT '系统ID',
  `DAY_END` varchar(1) NOT NULL DEFAULT 'Y' COMMENT '日跑',
  `WEEK_END` varchar(1) NOT NULL DEFAULT 'N' COMMENT '周末跑',
  `MTH_END` varchar(1) NOT NULL DEFAULT 'N' COMMENT '月末跑',
  `YR_END` varchar(1) NOT NULL DEFAULT 'N' COMMENT '年末跑',
  `IS_SKIP` varchar(1) NOT NULL DEFAULT 'N' COMMENT '是否可以跳过',
  `GX_CLASS_NAME` varchar(100) DEFAULT NULL COMMENT 'Galaxy job 类名',
  `GX_METHOD` varchar(30) DEFAULT NULL COMMENT 'Galaxy job 方法',
  `STATIC_PARAM` varchar(100) DEFAULT NULL COMMENT '静态参数',
  `BY_SCHEMA` varchar(1) NOT NULL DEFAULT 'N' COMMENT '是否分库',
  `IS_SPLIT` varchar(1) NOT NULL DEFAULT 'N' COMMENT '是否分段',
  `STATUS` varchar(1) NOT NULL DEFAULT 'Y' COMMENT '状态',
  `SHARD_MANAGER_ID` varchar(30) DEFAULT NULL COMMENT '数据源ID',
  `BATCH_SIZE` int(11) DEFAULT NULL COMMENT '小分段数据量',
  `DTP_FLAG` varchar(1) DEFAULT NULL COMMENT 'JOBDTP开关',
  `JOB_GROUP_ID` varchar(40) DEFAULT NULL COMMENT 'JOB组',
  UNIQUE KEY `JOB_ID` (`JOB_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='JOB定义表';

-- ----------------------------
-- Records of batch_std_job
-- ----------------------------

-- ----------------------------
-- Table structure for batch_table_def
-- ----------------------------
DROP TABLE IF EXISTS `batch_table_def`;
CREATE TABLE `batch_table_def` (
  `BATCH_TABLE_ID` varchar(20) DEFAULT NULL COMMENT '表ID',
  `TABLE_NAME` varchar(30) DEFAULT NULL COMMENT '表名',
  `TARGET_TABLE_NAME` varchar(30) DEFAULT NULL COMMENT '目标表名',
  `SELECT_NAMESPACE` varchar(100) DEFAULT NULL COMMENT '查询命名空间',
  `SELECT_SQL_ID` varchar(50) DEFAULT NULL COMMENT '查询sqlID',
  `INSERT_NAMESPACE` varchar(100) DEFAULT NULL COMMENT 'insert命名空间',
  `INSERT_SQL_ID` varchar(50) DEFAULT NULL COMMENT 'insertSQLID',
  `WHERE_SQL` varchar(1000) DEFAULT NULL COMMENT '查询条件',
  `BATCH_SIZE` int(11) DEFAULT NULL COMMENT '批量提交数',
  UNIQUE KEY `BATCH_TABLE_ID` (`BATCH_TABLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='跑批抽数定义表';

-- ----------------------------
-- Records of batch_table_def
-- ----------------------------

-- ----------------------------
-- Table structure for batch_timer_def
-- ----------------------------
DROP TABLE IF EXISTS `batch_timer_def`;
CREATE TABLE `batch_timer_def` (
  `TIMER_ID` varchar(32) DEFAULT NULL COMMENT '定时器ID',
  `CRON_EXPRESSION` varchar(32) DEFAULT NULL COMMENT '定时器表达式',
  `SYSTEM_ID` varchar(32) DEFAULT NULL COMMENT '系统标识',
  `STATIC_PARAM` varchar(100) DEFAULT NULL COMMENT '静态参数',
  `GX_CLASS_NAME` varchar(100) DEFAULT NULL COMMENT '类名',
  `GX_METHOD` varchar(100) DEFAULT NULL COMMENT '方法名',
  `STATUS` varchar(1) DEFAULT NULL COMMENT '是否可用',
  `PAUSE_BATCH` varchar(4) DEFAULT NULL COMMENT '暂停批处理',
  `REC_FLAG` varchar(1) DEFAULT NULL COMMENT '是否记录定时任务到BATCH_TIMER_REC',
  `IS_SPLIT` varchar(1) DEFAULT NULL COMMENT '是否分片',
  UNIQUE KEY `BATCH_TIMER_DEF_PK` (`TIMER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='定时任务定义表';

-- ----------------------------
-- Records of batch_timer_def
-- ----------------------------

-- ----------------------------
-- Table structure for batch_timer_rec
-- ----------------------------
DROP TABLE IF EXISTS `batch_timer_rec`;
CREATE TABLE `batch_timer_rec` (
  `TIME_EXE_IND` varchar(100) DEFAULT NULL COMMENT '定时任务执行记录ID',
  `TIMER_ID` varchar(32) DEFAULT NULL COMMENT '定时器ID',
  `SYSTEM_ID` varchar(32) DEFAULT NULL COMMENT '系统标识',
  `STATIC_PARAM` varchar(100) DEFAULT NULL COMMENT '静态参数',
  `GX_CLASS_NAME` varchar(100) DEFAULT NULL COMMENT '类名',
  `GX_METHOD` varchar(100) DEFAULT NULL COMMENT '方法名',
  `EXE_RESULT` varchar(1) DEFAULT NULL COMMENT '执行结果',
  `NODE_IP` varchar(32) DEFAULT NULL COMMENT '执行节点IP',
  `START_TIME` varchar(32) DEFAULT NULL COMMENT '开始时间',
  `END_TIME` varchar(32) DEFAULT NULL COMMENT '完成时间',
  `TIME_ELAPSED` int(11) DEFAULT NULL COMMENT '消耗时间',
  `ERROR_DESC` varchar(4000) DEFAULT NULL COMMENT '错误信息',
  UNIQUE KEY `BATCH_TIMER_REC_PK` (`TIME_EXE_IND`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='定时任务执行记录表';

-- ----------------------------
-- Records of batch_timer_rec
-- ----------------------------

-- ----------------------------
-- Table structure for batch_to_commit
-- ----------------------------
DROP TABLE IF EXISTS `batch_to_commit`;
CREATE TABLE `batch_to_commit` (
  `TASK_ID` varchar(50) NOT NULL COMMENT 'TASK ID',
  `SHARD_MANAGER_ID` varchar(50) DEFAULT NULL COMMENT '待提交数据的shardManager',
  `SHARD_ID` varchar(50) DEFAULT NULL COMMENT '待提交数据的shard',
  `COMMIT_DATA` blob COMMENT '提交数据',
  `GROUP_ID` varchar(50) DEFAULT NULL COMMENT 'Task的GroupID',
  `BATCH_GROUP_ID` varchar(50) DEFAULT NULL COMMENT '主调group',
  `IDEM_ID` varchar(50) DEFAULT NULL COMMENT '幂等ID',
  `RECORD_DATE` varchar(20) DEFAULT NULL COMMENT '记录日期'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='批处理待提交数据表';

-- ----------------------------
-- Records of batch_to_commit
-- ----------------------------

-- ----------------------------
-- Table structure for cif_client
-- ----------------------------
DROP TABLE IF EXISTS `cif_client`;
CREATE TABLE `cif_client` (
  `CLIENT_KEY` varchar(30) NOT NULL COMMENT '内部Key',
  `CLIENT_NO` varchar(12) DEFAULT NULL COMMENT '客户号',
  `GLOBAL_ID` varchar(25) DEFAULT NULL COMMENT '证件号码',
  `GLOBAL_ID_TYPE` varchar(3) DEFAULT NULL COMMENT '证件类型，参数表：CIF_DOCUMENT_TYPE',
  `CLIENT_TYPE` varchar(3) DEFAULT NULL COMMENT '客户类型',
  `CLIENT_NAME` varchar(100) NOT NULL COMMENT '客户名称（英）',
  `LOCATION` varchar(140) DEFAULT NULL COMMENT '地址',
  `ACCT_EXEC` varchar(30) DEFAULT NULL COMMENT '客户经理',
  `COUNTRY_LOC` varchar(3) DEFAULT NULL COMMENT '国籍',
  `STATE_LOC` varchar(10) DEFAULT NULL COMMENT '省、州',
  `CLIENT_CITY` varchar(8) DEFAULT NULL COMMENT '城市代码',
  `COUNTRY_CITIZEN` varchar(3) DEFAULT NULL COMMENT '居住国家',
  `NARRATIVE` varchar(300) DEFAULT NULL COMMENT '备注',
  `POSTAL_CODE` varchar(6) DEFAULT NULL COMMENT '邮政代码',
  `CREATION_USER` varchar(30) DEFAULT NULL COMMENT '创建用户',
  `CREATION_DATE` varchar(8) DEFAULT NULL COMMENT '创建日期',
  `UPDATE_USER` varchar(30) DEFAULT NULL COMMENT '更新用户',
  `UPDATE_DATE` varchar(8) DEFAULT NULL COMMENT '更新日期',
  PRIMARY KEY (`CLIENT_KEY`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户信息表 1、保存全行的所有客户信息：客户号、联系方式、证件号码、国家、客户经理、客户分类等信息，供整个系统使用。';

-- ----------------------------
-- Records of cif_client
-- ----------------------------

-- ----------------------------
-- Table structure for cif_client_document
-- ----------------------------
DROP TABLE IF EXISTS `cif_client_document`;
CREATE TABLE `cif_client_document` (
  `CLIENT_NO` varchar(12) NOT NULL COMMENT '客户号',
  `ISS_COUNTRY` varchar(3) NOT NULL COMMENT '签发国家',
  `DOCUMENT_TYPE` varchar(3) NOT NULL COMMENT '证件类型，参数定义表：  CIF_DOCUMENT_TYPE',
  `DOCUMENT_ID` varchar(25) NOT NULL COMMENT '证件号码',
  `ISS_DATE` varchar(8) DEFAULT NULL COMMENT '签发日期',
  `EXPIRY_DATE` varchar(8) DEFAULT NULL COMMENT '到期日期',
  `ISS_PLACE` varchar(30) DEFAULT NULL COMMENT '签发地',
  `ISS_AUTHORITY` varchar(30) DEFAULT NULL COMMENT '签发机构',
  `PREF_FLAG` varchar(1) DEFAULT NULL COMMENT '是否首选证件 Y-首选证件信息 N-不是首选证件信息',
  `LAST_CHANGE_DATE` varchar(8) DEFAULT NULL COMMENT '更新日期',
  PRIMARY KEY (`CLIENT_NO`,`DOCUMENT_TYPE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户证件信息';

-- ----------------------------
-- Records of cif_client_document
-- ----------------------------

-- ----------------------------
-- Table structure for demo_acct
-- ----------------------------
DROP TABLE IF EXISTS `demo_acct`;
CREATE TABLE `demo_acct` (
  `UUID` varchar(50) NOT NULL COMMENT '唯一编号',
  `ACCT_NO` varchar(50) NOT NULL COMMENT '账号',
  `ACCT_NAME` varchar(10) NOT NULL COMMENT '账号名称',
  `CREATE_DATE` varchar(8) NOT NULL COMMENT '创建日期',
  `CREATE_TIME` varchar(17) NOT NULL COMMENT '创建时间',
  `BAL` decimal(17,2) DEFAULT NULL COMMENT '余额',
  `STATUS` varchar(1) DEFAULT NULL COMMENT '状态A-活动，C-销户',
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='存款账户信息';

-- ----------------------------
-- Records of demo_acct
-- ----------------------------
INSERT INTO `demo_acct` VALUES ('DC36B2A22A854D949E49FF76916B08DA', '51878982503717275762', '啦啦啦', '20180823', '184052452', '0.00', null);

-- ----------------------------
-- Table structure for demo_cl_acct
-- ----------------------------
DROP TABLE IF EXISTS `demo_cl_acct`;
CREATE TABLE `demo_cl_acct` (
  `UUID` varchar(50) NOT NULL COMMENT '唯一编号',
  `ACCT_NO` varchar(50) NOT NULL COMMENT '账号',
  `ACCT_NAME` varchar(10) NOT NULL COMMENT '账号名称',
  `CREATE_DATE` varchar(8) NOT NULL COMMENT '创建日期',
  `CREATE_TIME` varchar(17) NOT NULL COMMENT '创建时间',
  `BAL` decimal(17,2) DEFAULT NULL COMMENT '余额',
  `STATUS` varchar(1) DEFAULT NULL COMMENT '状态A-活动，C-销户',
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='贷款账户信息';

-- ----------------------------
-- Records of demo_cl_acct
-- ----------------------------

-- ----------------------------
-- Table structure for fw_sequences
-- ----------------------------
DROP TABLE IF EXISTS `fw_sequences`;
CREATE TABLE `fw_sequences` (
  `SEQ_NAME` varchar(50) NOT NULL COMMENT '序列名称',
  `SEQ_CURRENT_VALUE` decimal(10,0) NOT NULL DEFAULT '1' COMMENT '序列值',
  `SEQ_MAX_VALUE` decimal(32,0) DEFAULT '9999999999' COMMENT '最大序列值',
  `SEQ_MIN_VALUE` decimal(10,0) DEFAULT '1' COMMENT '最小序列值',
  `SEQ_INCREMENT_BY` decimal(10,0) DEFAULT '1' COMMENT '序列步长',
  `SEQ_CYCLE` varchar(1) DEFAULT 'Y' COMMENT '是否周期序列',
  `SEQ_CACHE` decimal(10,0) DEFAULT '200' COMMENT '缓存系列数',
  UNIQUE KEY `SEQ_NAME` (`SEQ_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='自增序列表';

-- ----------------------------
-- Records of fw_sequences
-- ----------------------------
INSERT INTO `fw_sequences` VALUES ('fm.referenceSeq.20180823', '4', '9223372036854775807', '1', '1', 'Y', '200');

-- ----------------------------
-- Table structure for mb_acct
-- ----------------------------
DROP TABLE IF EXISTS `mb_acct`;
CREATE TABLE `mb_acct` (
  `INTERNAL_KEY` varchar(10) NOT NULL COMMENT '账户标识符',
  `BASE_ACCT_NO` varchar(10) DEFAULT NULL COMMENT '账号',
  `PROD_TYPE` varchar(10) DEFAULT NULL COMMENT '产品类型',
  `CCY` varchar(10) DEFAULT NULL COMMENT '账户币种，对于AIO账户和一本通账户，账户币种为XXX',
  `SEQ_NO` varchar(10) DEFAULT NULL COMMENT '序列号，采用顺序数字，表示在同一账号、账户类型、币种下的不同子账户，比如定期存款序列号',
  `BRANCH` varchar(20) DEFAULT NULL COMMENT '开户行',
  `CLIENT_NO` varchar(12) DEFAULT NULL COMMENT '客户号',
  `ACCT_STATUS` varchar(10) DEFAULT NULL COMMENT '账户状态  H：待激活 A：活动 D：睡眠  S：久悬  O：转营业外 C：关闭 P：逾期   \r\n            以下废弃： R：撤销  C：自动关闭  E：手工关闭 M：到期已结清  B：未到期结清',
  `ACCT_NAME` varchar(10) DEFAULT NULL COMMENT '账户名称，一般指中文账户名称',
  `SOURCE_TYPE` varchar(20) DEFAULT NULL COMMENT '开户渠道',
  `SOURCE_MODULE` varchar(10) DEFAULT NULL COMMENT '源模块',
  `USER_ID` varchar(30) DEFAULT NULL COMMENT '开户柜员ID',
  `LAST_CHANGE_DATE` varchar(8) DEFAULT NULL COMMENT '上次修改日期'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账户表';

-- ----------------------------
-- Records of mb_acct
-- ----------------------------

-- ----------------------------
-- Table structure for mb_agreement
-- ----------------------------
DROP TABLE IF EXISTS `mb_agreement`;
CREATE TABLE `mb_agreement` (
  `AGREEMENT_ID` varchar(50) NOT NULL COMMENT '协议号',
  `AGREEMENT_TYPE` varchar(3) NOT NULL COMMENT '协议类型\r\n            LOA 贷款协议\r\n            ',
  `START_DATE` varchar(8) NOT NULL COMMENT '开始日期',
  `END_DATE` varchar(8) NOT NULL COMMENT '终止日期',
  `AGREEMENT_KEY_TYPE` varchar(3) DEFAULT NULL COMMENT '协议键类型：\r\n            	IK:INTERNAL_KEY\r\n            	CN:CLIENT_NO',
  `AGREEMENT_KEY` varchar(30) DEFAULT NULL COMMENT '协议键值',
  `BASE_ACCT_NO` varchar(10) DEFAULT NULL COMMENT '账号',
  `PROD_TYPE` varchar(10) DEFAULT NULL COMMENT '产品类型',
  `CCY` varchar(10) DEFAULT NULL COMMENT '账户币种，对于AIO账户和一本通账户，账户币种为XXX',
  `ACCT_SEQ_NO` varchar(8) DEFAULT NULL COMMENT '账户序列号，采用顺序数字，表示在同一账号、账户类型、币种下的不同子账户，比如定期存款序列号',
  `CLIENT_NO` varchar(12) DEFAULT NULL COMMENT '客户号',
  `AGREEMENT_STATUS` varchar(1) DEFAULT NULL COMMENT '协议状态:\r\n            	A：有效\r\n            	E：无效',
  `BRANCH` varchar(20) DEFAULT NULL COMMENT '开户行',
  `AGREEMENT_OPEN_DATE` varchar(8) DEFAULT NULL COMMENT '签约时间',
  `USER_ID` varchar(30) DEFAULT NULL COMMENT '开户柜员ID',
  `LAST_CHANGE_USER_ID` varchar(30) DEFAULT NULL COMMENT '上一修改柜员',
  `LAST_CHANGE_DATE` varchar(8) DEFAULT NULL COMMENT '上次修改日期',
  `COMPANY` varchar(20) DEFAULT NULL COMMENT '法人代码',
  PRIMARY KEY (`AGREEMENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='合同/协议信息表';

-- ----------------------------
-- Records of mb_agreement
-- ----------------------------

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
  `TX_FLAG` varchar(1) DEFAULT 'Y' COMMENT '事务开关',
  UNIQUE KEY `FLOWID` (`FLOWID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Stria流程定义';

-- ----------------------------
-- Records of stria_flow
-- ----------------------------
INSERT INTO `stria_flow` VALUES ('MbsdCore-1000-0203-flow', '01', '贷款发放（demo）', '23', '1', '1', '20180823 18:47:39', 'Author', 'N', '-1', null, null, 'Y');
INSERT INTO `stria_flow` VALUES ('MbsdCore-1000-0204-flow', '01', '贷款还款（demo）', '9', '1', '1', '20180823 18:48:10', 'Author', 'N', '-1', null, null, 'Y');
INSERT INTO `stria_flow` VALUES ('MbsdCore-1000-9102-flow', '01', '存款账户创建（demo）', '14', '1', '1', '20180823 18:40:46', 'Author', 'N', '-1', null, null, 'Y');
INSERT INTO `stria_flow` VALUES ('MbsdCore-1000-9103-flow', '01', '存款存入（demo）', '7', '1', '1', '20180823 18:42:25', 'Author', 'N', '-1', null, null, 'Y');
INSERT INTO `stria_flow` VALUES ('MbsdCore-1000-9104-flow', '01', '存款支取（demo）', '7', '1', '1', '20180823 18:42:53', 'Author', 'N', '-1', null, null, 'Y');
INSERT INTO `stria_flow` VALUES ('MbsdCore-1200-0202-flow', '01', '贷款账户创建（demo）', '9', '1', '1', '20180823 18:48:41', 'Author', 'N', '-1', null, null, 'Y');
INSERT INTO `stria_flow` VALUES ('MbsdCore-1200-9100-flow', '01', '快速建立客户信息', '20', '1', '1', '20180823 18:49:51', 'Author', 'N', '-1', null, null, 'Y');
INSERT INTO `stria_flow` VALUES ('MbsdCore-1200-9101-flow', '01', '快速建立客户信息', '14', '1', '1', '20180823 18:49:58', 'Author', 'N', '-1', null, null, 'Y');
INSERT INTO `stria_flow` VALUES ('MbsdCore-1200-9200-flow', '01', '客户信息维护', '15', '1', '1', '20180823 18:50:06', 'Author', 'N', '-1', null, null, 'Y');
INSERT INTO `stria_flow` VALUES ('MbsdCore-1400-0201-flow', '01', '贷款账户查询（demo）', '9', '1', '1', '20180823 18:49:07', 'Author', 'N', '-1', null, null, 'Y');
INSERT INTO `stria_flow` VALUES ('MbsdCore-1400-8001-flow', '01', '客户信息查询', '10', '1', '1', '20180823 18:50:13', 'Author', 'N', '-1', null, null, 'Y');
INSERT INTO `stria_flow` VALUES ('MbsdCore-1400-9101-flow', '01', '存款账户查询（demo）', '7', '1', '1', '20180823 18:45:53', 'Author', 'N', '-1', null, null, 'Y');

-- ----------------------------
-- Table structure for stria_flow_lines
-- ----------------------------
DROP TABLE IF EXISTS `stria_flow_lines`;
CREATE TABLE `stria_flow_lines` (
  `FLOWID` varchar(30) NOT NULL COMMENT '流程ID',
  `ID` varchar(30) NOT NULL COMMENT '连接线ID',
  `NAME` varchar(50) DEFAULT NULL COMMENT '连接线描述',
  `TYPE` varchar(20) DEFAULT NULL COMMENT '节点类型',
  `FROM_NODE` varchar(20) DEFAULT NULL COMMENT '源节点',
  `TO_NODE` varchar(20) DEFAULT NULL COMMENT '目标节点',
  `EXPR` varchar(300) DEFAULT NULL COMMENT '布尔类型表达式，用于决策节点后的连接线',
  UNIQUE KEY `FLOWID` (`FLOWID`,`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Stria流程连接线定义';

-- ----------------------------
-- Records of stria_flow_lines
-- ----------------------------
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1000-0203-flow', '0016', '', 'sl', '0008', '0012', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1000-0203-flow', '0017', '', 'sl', '0012', '0010', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1000-0203-flow', '0018', '', 'sl', '0012', '0011', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1000-0203-flow', '0019', '', 'sl', '0011', '0014', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1000-0203-flow', '0020', '', 'sl', '0010', '0014', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1000-0203-flow', '0021', '', 'sl', '0014', '0015', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1000-0203-flow', '0022', '', 'sl', '0015', '0009', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1000-0204-flow', '0007', '', 'sl', '0003', '0005', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1000-0204-flow', '0008', '', 'sl', '0005', '0006', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1000-0204-flow', '0009', '', 'sl', '0006', '0004', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1000-9102-flow', '0013', '', 'sl', '0010', '0012', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1000-9102-flow', '0014', '', 'sl', '0012', '0011', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1000-9103-flow', '0006', '', 'sl', '0003', '0005', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1000-9103-flow', '0007', '', 'sl', '0005', '0004', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1000-9104-flow', '0006', '', 'sl', '0003', '0005', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1000-9104-flow', '0007', '', 'sl', '0005', '0004', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1200-0202-flow', '0007', '', 'sl', '0003', '0005', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1200-0202-flow', '0008', '', 'sl', '0005', '0006', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1200-0202-flow', '0009', '', 'sl', '0006', '0004', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1200-9100-flow', '0019', '', 'sl', '0016', '0018', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1200-9100-flow', '0020', '', 'sl', '0018', '0017', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1200-9101-flow', '0013', '', 'sl', '0010', '0012', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1200-9101-flow', '0014', '', 'sl', '0012', '0011', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1200-9200-flow', '0013', '', 'sl', '0010', '0012', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1200-9200-flow', '0014', '', 'sl', '0012', '0011', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1400-0201-flow', '0007', '', 'sl', '0003', '0005', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1400-0201-flow', '0008', '', 'sl', '0005', '0006', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1400-0201-flow', '0009', '', 'sl', '0006', '0004', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1400-8001-flow', '0009', '', 'sl', '0006', '0008', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1400-8001-flow', '0010', '', 'sl', '0008', '0007', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1400-9101-flow', '0006', '', 'sl', '0003', '0005', null);
INSERT INTO `stria_flow_lines` VALUES ('MbsdCore-1400-9101-flow', '0007', '', 'sl', '0005', '0004', null);

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
  UNIQUE KEY `FLOWID` (`FLOWID`,`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Stria流程节点定义';

-- ----------------------------
-- Records of stria_flow_nodes
-- ----------------------------
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1000-0203-flow', '0008', '开始', 'start round', '86', '50', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1000-0203-flow', '0009', '结束', 'end round', '90', '581', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1000-0203-flow', '0010', '贷款账号检查', 'check', '60', '177', '144', '27', 'all', 'SPRING BEAN', 'com.dcits.ensemble.cl.service.application.CommonCheck', 'checkAcctNo', 'body.acctNo', 'java.lang.String', null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1000-0203-flow', '0011', '贷款余额检查', 'check', '116', '177', '144', '27', 'all', 'SPRING BEAN', 'com.dcits.ensemble.cl.service.application.CommonCheck', 'checkAcctBal', 'body.acctNo|body.bal', 'java.lang.String|java.math.BigDecimal', null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1000-0203-flow', '0012', '分派', 'fork round', '84', '117', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1000-0203-flow', '0014', '合并', 'join round', '95', '343', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1000-0203-flow', '0015', '贷款发放', 'atom', '93', '436', '102', '27', null, 'SPRING BEAN', 'com.dcits.ensemble.cl.service.mbsdcore.Core10000203', 'drawdown', null, 'java.lang.String|java.math.BigDecimal', null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1000-0204-flow', '0003', '开始', 'start round', '100', '100', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1000-0204-flow', '0004', '结束', 'end round', '105', '494', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1000-0204-flow', '0005', '贷款账号检查', 'check', '102', '158', '144', '27', 'all', 'SPRING BEAN', 'com.dcits.ensemble.cl.service.application.CommonCheck', 'checkAcctNo', 'body.acctNo', 'java.lang.String', null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1000-0204-flow', '0006', '贷款还款', 'atom', '102', '353', '102', '27', 'all', 'SPRING BEAN', 'com.dcits.ensemble.cl.service.mbsdcore.Core10000204', 'recycle', 'body.acctNo|body.bal', 'java.lang.String|java.math.BigDecimal', null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1000-9102-flow', '0010', '开始', 'start round', '100', '100', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1000-9102-flow', '0011', '结束', 'end round', '100', '400', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1000-9102-flow', '0012', '存款账户创建', 'atom', '106', '200', '144', '27', 'all', 'SPRING BEAN', 'com.dcits.ensemble.rb.service.mbsdcore.Core10009102', 'createAcct', 'body.acctName', 'java.lang.String', null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1000-9103-flow', '0003', '开始', 'start round', '100', '100', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1000-9103-flow', '0004', '结束', 'end round', '100', '400', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1000-9103-flow', '0005', '存款存入', 'atom', '104', '240', '102', '27', 'all', 'SPRING BEAN', 'com.dcits.ensemble.rb.service.mbsdcore.Core10009103', 'deposit', 'body.acctNo|body.bal', 'java.lang.String|java.math.BigDecimal', null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1000-9104-flow', '0003', '开始', 'start round', '100', '100', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1000-9104-flow', '0004', '结束', 'end round', '100', '400', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1000-9104-flow', '0005', '存款支取', 'atom', '99', '209', '102', '27', 'all', 'SPRING BEAN', 'com.dcits.ensemble.rb.service.mbsdcore.Core10009104', 'withDraw', 'body.acctNo|body.bal', 'java.lang.String|java.math.BigDecimal', null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1200-0202-flow', '0003', '开始', 'start round', '104', '97', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1200-0202-flow', '0004', '结束', 'end round', '109', '552', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1200-0202-flow', '0005', '账户名称检查', 'check', '104', '163', '144', '27', 'all', 'SPRING BEAN', 'com.dcits.ensemble.cl.service.application.CommonCheck', 'checkAcctName', 'body.acctName', 'java.lang.String', null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1200-0202-flow', '0006', '贷款开立', 'atom', '109', '373', '102', '27', 'all', 'SPRING BEAN', 'com.dcits.ensemble.cl.service.mbsdcore.Core12000202', 'createAcct', 'body.acctName', 'java.lang.String', null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1200-9100-flow', '0016', '开始', 'start round', '100', '100', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1200-9100-flow', '0017', '结束', 'end round', '100', '400', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1200-9100-flow', '0018', '创建客户信息', 'atom', '97', '193', '144', '27', 'all', 'SPRING BEAN', 'com.dcits.ensemble.cif.service.mbsdcore.Core12009100', 'createClient', '*', 'com.dcits.ensemble.cif.model.mbsdcore.Core12009100In', null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1200-9101-flow', '0010', '开始', 'start round', '100', '100', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1200-9101-flow', '0011', '结束', 'end round', '100', '400', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1200-9101-flow', '0012', '快速建立客户信息', 'atom', '100', '181', '170', '27', 'all', 'SPRING BEAN', 'com.dcits.ensemble.cif.service.mbsdcore.Core12009101', 'createClient', '*', 'com.dcits.ensemble.cif.model.mbsdcore.Core12009101In', null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1200-9200-flow', '0010', '开始', 'start round', '100', '100', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1200-9200-flow', '0011', '结束', 'end round', '100', '400', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1200-9200-flow', '0012', '客户信息维护', 'atom', '99', '201', '144', '27', 'all', 'SPRING BEAN', 'com.dcits.ensemble.cif.service.mbsdcore.Core12009200', 'updateClientInfo', '*', 'com.dcits.ensemble.cif.model.mbsdcore.Core12009200In', null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1400-0201-flow', '0003', '开始', 'start round', '100', '100', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1400-0201-flow', '0004', '结束', 'end round', '102', '578', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1400-0201-flow', '0005', '贷款账号检查', 'check', '100', '165', '144', '27', 'all', 'SPRING BEAN', 'com.dcits.ensemble.cl.service.application.CommonCheck', 'checkAcctNo', 'body.acctNo', 'java.lang.String', null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1400-0201-flow', '0006', '贷款账户查询', 'atom', '104', '370', '144', '27', 'all', 'SPRING BEAN', 'com.dcits.ensemble.cl.service.mbsdcore.Core14000201', 'getAcct', 'body.acctNo', 'java.lang.String', null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1400-8001-flow', '0006', '开始', 'start round', '100', '100', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1400-8001-flow', '0007', '结束', 'end round', '100', '400', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1400-8001-flow', '0008', '客户信息查询', 'atom', '102', '208', '144', '27', 'all', 'SPRING BEAN', 'com.dcits.ensemble.cif.service.mbsdcore.Core14008001', 'queryClientInfo', '*', 'com.dcits.ensemble.cif.model.mbsdcore.Core14008001In', null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1400-9101-flow', '0003', '开始', 'start round', '100', '100', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1400-9101-flow', '0004', '结束', 'end round', '100', '400', '40', '27', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `stria_flow_nodes` VALUES ('MbsdCore-1400-9101-flow', '0005', '存款账户查询', 'atom', '103', '207', '144', '27', 'all', 'SPRING BEAN', 'com.dcits.ensemble.rb.service.mbsdcore.Core14009101', 'getAcct', 'body.acctNo', 'java.lang.String', null, null, null, null, null, null, null);
