SET DEFINE OFF;
Insert into STRIA_FLOW
   (FLOWID, FLOW_TYPE, TITLE, INIT_NUM, VERSION, STATE, CREATETIME, CREATOR, DTP_FLAG, TIME_OUT)
 Values
   ('Financial-9999-0104-flow', '01', '存款支取（demo）', 51, '1', 1, '20160707 16:50:13', 'admin', 'Y', -1);
Insert into STRIA_FLOW
   (FLOWID, FLOW_TYPE, TITLE, INIT_NUM, VERSION, STATE, CREATETIME, CREATOR, DTP_FLAG, TIME_OUT)
 Values
   ('File-1220-9901-flow', '01', '文件处理DEMO', 6, '1', 1, '20160201 13:25:52', 'Tim', 'N', -1);
Insert into STRIA_FLOW
   (FLOWID, FLOW_TYPE, TITLE, INIT_NUM, VERSION, STATE, CREATETIME, CREATOR, DTP_FLAG, TIME_OUT)
 Values
   ('Financial-9999-0101-flow', '01', '存款账户查询（demo）', 7, '1', 1, '20160708 13:53:38', 'admin', 'N', -1);
Insert into STRIA_FLOW
   (FLOWID, FLOW_TYPE, TITLE, INIT_NUM, VERSION, STATE, CREATETIME, CREATOR, DTP_FLAG, TIME_OUT)
 Values
   ('Financial-9999-0102-flow', '01', '存款账户创建（demo）', 10, '1', 1, '20150928 14:44:22', 'Tim', 'N', -1);
Insert into STRIA_FLOW
   (FLOWID, FLOW_TYPE, TITLE, INIT_NUM, VERSION, STATE, CREATETIME, CREATOR, DTP_FLAG, TIME_OUT)
 Values
   ('Financial-9999-0103-flow', '01', '存款存入（demo）', 10, '1', 1, '20150928 15:54:06', 'Tim', 'N', -1);
Insert into STRIA_FLOW
   (FLOWID, FLOW_TYPE, TITLE, INIT_NUM, VERSION, STATE, CREATETIME, CREATOR, DTP_FLAG, TIME_OUT)
 Values
   ('Financial-9999-0201-flow', '01', '贷款账户查询（demo）', 18, '1', 1, '20150928 14:56:29', 'Tim', 'N', -1);
Insert into STRIA_FLOW
   (FLOWID, FLOW_TYPE, TITLE, INIT_NUM, VERSION, STATE, CREATETIME, CREATOR, DTP_FLAG, TIME_OUT)
 Values
   ('Financial-9999-0202-flow', '01', '贷款账户创建（demo）', 19, '1', 1, '20150928 14:59:41', 'Tim', 'N', -1);
Insert into STRIA_FLOW
   (FLOWID, FLOW_TYPE, TITLE, INIT_NUM, VERSION, STATE, CREATETIME, CREATOR, DTP_FLAG, TIME_OUT)
 Values
   ('Financial-9999-0203-flow', '01', '贷款发放（demo）', 34, '1', 1, '20150929 11:13:56', 'Tim', 'Y', -1);
Insert into STRIA_FLOW
   (FLOWID, FLOW_TYPE, TITLE, INIT_NUM, VERSION, STATE, CREATETIME, CREATOR, DTP_FLAG, TIME_OUT)
 Values
   ('Financial-9999-0204-flow', '01', '贷款回收（demo）', 38, '1', 1, '20150928 18:17:11', 'Tim', 'Y', -1);
Insert into STRIA_FLOW
   (FLOWID, FLOW_TYPE, TITLE, INIT_NUM, VERSION, STATE, CREATETIME, CREATOR, DTP_FLAG, TIME_OUT)
 Values
   ('Financial-1000-9101', '01', '测试1', 7, '1', 1, '20160423 15:20:03', 'Tim', 'N', -1);
Insert into STRIA_FLOW
   (FLOWID, FLOW_TYPE, TITLE, INIT_NUM, VERSION, STATE, CREATETIME, CREATOR, DTP_FLAG, TIME_OUT, PROD_TYPE, EVENT_TYPE)
 Values
   ('RB203-WTD-flow', '02', '支取事件', 7, '1', 1, '20160218 09:25:06', 'furong', 'N', -1, 'RB203', 'WTD');
COMMIT;
