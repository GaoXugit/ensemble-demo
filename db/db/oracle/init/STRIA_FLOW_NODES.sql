SET DEFINE OFF;
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0104-flow', 'stria_node_2', '����', 'end round', 421, 895, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0104-flow', 'stria_node_1', '��ʼ', 'start round', 120, 123, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0104-flow', 'stria_node_4', '֧ȡ', 'atom', 205, 681, 120, 24, 'all', 'SPRING BEAN', 'com.dcits.ensemble.rb.online.service.financial.Fin99990104', 'withdraw', 'body.acctNo|body.bal', 'String|BigDecimal');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0104-flow', 'stria_node_7', '�����', 'check', 180, 493, 120, 24, 'all', 'RPC SERVICE API', 'com.dcits.ensemble.rb.api.inner.ICommonCheck', 'checkAcctBal', 'body.acctNo|body.bal', 'String|BigDecimal');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0104-flow', 'stria_node_17', '����', 'fork round', 340, 347, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0104-flow', 'stria_node_40', 'node_40', 'check', 471, 443, 120, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0104-flow', 'stria_node_29', '�˻����', 'check', 13, 260, 120, 24, 'all', 'RPC SERVICE API', 'com.dcits.ensemble.rb.api.inner.ICommonCheck', 'checkAcctNo', 'body.acctNo', 'String');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0104-flow', 'stria_node_19', '��Ȩ', 'auth', 270, 491, 120, 24, 'all', 'RPC SERVICE API', 'com.dcits.ensemble.rb.api.inner.ICommonCheck', 'checkAuth', 'body.acctNo', 'String');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0104-flow', 'stria_node_18', '�ϲ�', 'join round', 333, 731, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME)
 Values
   ('Financial-9999-0104-flow', 'stria_node_44', 'haha', 'eventService', 288, 847, 120, 24, 'all', 'GENERAL JAVA', 'com.dcits.ensemble.event.DemoEventService', 'getEeventInfo');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0104-flow', 'stria_node_12', '�ϲ�', 'join round', 86, 407, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0104-flow', 'stria_node_42', 'node_42', 'check', 409, 217, 120, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME)
 Values
   ('Financial-9999-0104-flow', 'stria_node_35', '�¼�����', 'eventService', 200, 852, 120, 24, 'all', 'GENERAL JAVA', 'com.dcits.ensemble.event.DemoEventService', 'getEeventInfo');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SERVICE_TYPE, REQUEST, SERVICE_CODE, MESSAGE_TYPE, MESSAGE_CODE)
 Values
   ('Financial-9999-0104-flow', 'stria_node_48', '�Ӳ�ѯ����', 'sub', 366, 942, 120, 24, 'GENERAL JAVA', '#FIN0101', 'Financial', '9999', '0101');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0104-flow', 'stria_node_20', 'ȷ��', 'confirm', 402, 486, 120, 24, 'all', 'RPC SERVICE API', 'com.dcits.ensemble.rb.api.inner.ICommonCheck', 'checkConfirm', 'body.acctNo', 'String');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0104-flow', 'stria_node_11', '����', 'fork round', 84, 202, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0104-flow', 'stria_node_37', 'node_37', 'eventService', 445, 288, 120, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0104-flow', 'stria_node_10', '��Դ����', 'check', 183, 262, 120, 24, 'all', 'RPC SERVICE API', 'com.dcits.ensemble.rb.api.inner.ICommonCheck', 'checkResource', 'body.acctNo', 'String');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('File-1220-9901-flow', 'stria_node_1', '��ʼ', 'start round', 83, 64, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('File-1220-9901-flow', 'stria_node_2', '����', 'end round', 84, 407, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('File-1220-9901-flow', 'stria_node_3', '�ļ�����', 'atom', 86, 199, 100, 24, 'all', 'SPRING BEAN', 'Core12209901', 'executeFile', 'sysHead.filePath', 'String');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0101-flow', 'stria_node_2', '����', 'end round', 126, 351, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0102-flow', 'stria_node_1', '��ʼ', 'start round', 141, 142, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0102-flow', 'stria_node_2', '����', 'end round', 140, 597, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0102-flow', 'stria_node_3', '�˻�����', 'atom', 142, 440, 100, 24, 'all', 'SPRING BEAN', 'com.dcits.ensemble.rb.online.service.financial.Fin99990102', 'createAcct', 'body.acctName', 'String');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0102-flow', 'stria_node_7', '����˻����Ƿ����', 'check', 140, 219, 135, 25, 'all', 'RPC SERVICE API', 'com.dcits.ensemble.rb.api.inner.ICommonCheck', 'checkAcctName', 'body.acctName', 'String');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0103-flow', 'stria_node_1', '��ʼ', 'start round', 123, 99, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0103-flow', 'stria_node_2', '����', 'end round', 123, 623, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0103-flow', 'stria_node_3', '����', 'atom', 123, 427, 100, 24, 'all', 'SPRING BEAN', 'com.dcits.ensemble.rb.online.service.financial.Fin99990103', 'deposit', 'body.acctNo|body.bal', 'String|BigDecimal');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0103-flow', 'stria_node_7', '��Դ����', 'check', 124, 223, 100, 24, 'all', 'RPC SERVICE API', 'com.dcits.ensemble.rb.api.inner.ICommonCheck', 'checkResource', 'body.acctNo', 'String');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0201-flow', 'stria_node_7', '��ʼ', 'start round', 128, 112, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0201-flow', 'stria_node_8', '����', 'end round', 125, 474, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0201-flow', 'stria_node_9', '�˻���ѯ', 'atom', 130, 242, 100, 24, 'all', 'SPRING BEAN', 'com.dcits.ensemble.cl.online.service.financial.Fin99990201', 'getAcct', 'body.acctNo', 'String');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0202-flow', 'stria_node_10', '��ʼ', 'start round', 151, 138, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0202-flow', 'stria_node_11', '����', 'end round', 151, 602, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0202-flow', 'stria_node_12', '����˻����Ƿ����', 'check', 150, 234, 137, 26, 'all', 'RPC SERVICE API', 'com.dcits.ensemble.cl.api.inner.ICommonCheck', 'checkAcctName', 'body.acctName', 'String');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0202-flow', 'stria_node_13', '�˻�����', 'atom', 152, 439, 100, 24, 'all', 'SPRING BEAN', 'com.dcits.ensemble.cl.online.service.financial.Fin99990202', 'createAcct', 'body.acctName', 'String');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0203-flow', 'stria_node_10', '��ʼ', 'start round', 118, 95, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0203-flow', 'stria_node_11', '����', 'end round', 121, 913, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0203-flow', 'stria_node_12', '������Դ���', 'check', 58, 230, 100, 24, 'all', 'RPC SERVICE API', 'com.dcits.ensemble.cl.api.inner.ICommonCheck', 'checkResource', 'body.acctNo', 'String');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0203-flow', 'stria_node_13', '���Ŷ�ȼ��', 'check', 121, 226, 100, 24, 'all', 'RPC SERVICE API', 'com.dcits.ensemble.cl.api.inner.ICommonCheck', 'checkAcctBal', 'body.acctNo|body.bal', 'String|BigDecimal');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0203-flow', 'stria_node_14', '����', 'fork round', 118, 170, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0203-flow', 'stria_node_15', '�ϲ�', 'join round', 120, 372, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ, VAR)
 Values
   ('Financial-9999-0203-flow', 'stria_node_21', '�����ȿۼ�', 'atom', 119, 448, 100, 24, 'all', 'SPRING BEAN', 'com.dcits.ensemble.cl.online.service.financial.Fin99990203', 'drawdown', 'body.acctNo|body.bal', 'String|BigDecimal', 'drawdownOut');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0203-flow', 'stria_node_24', '�������', 'atom', 120, 598, 100, 24, 'all', 'RPC SERVICE API', 'com.dcits.ensemble.demo.rb.api.mbsdcore.IFin99990103', 'deposit', 'body.rbAcctNo|body.bal', 'String|BigDecimal');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0203-flow', 'stria_node_27', '�����Դ���', 'check', 182, 231, 100, 24, 'all', 'RPC SERVICE API', 'com.dcits.ensemble.rb.api.inner.ICommonCheck', 'checkResource', 'body.rbAcctNo', 'String');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0203-flow', 'stria_node_31', '���', 'atom', 121, 765, 100, 24, 'all', 'SPRING BEAN', 'com.dcits.ensemble.cl.online.service.financial.Fin99990203', 'out', '#drawdownOut', 'com.dcits.galaxy.common.data.Response');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0204-flow', 'stria_node_17', '��ʼ', 'start round', 102, 86, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0204-flow', 'stria_node_18', '����', 'end round', 99, 777, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0204-flow', 'stria_node_19', '����˻������', 'check', 50, 224, 124, 26, 'all', 'RPC SERVICE API', 'com.dcits.ensemble.rb.api.inner.ICommonCheck', 'checkAcctBal', 'body.rbAcctNo|body.bal', 'String|BigDecimal');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0204-flow', 'stria_node_20', '����˻���Դ���', 'check', 101, 224, 124, 24, 'all', 'RPC SERVICE API', 'com.dcits.ensemble.rb.api.inner.ICommonCheck', 'checkResource', 'body.rbAcctNo', 'String');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0204-flow', 'stria_node_21', '�����˻���Դ���', 'check', 153, 225, 125, 24, 'all', 'RPC SERVICE API', 'com.dcits.ensemble.cl.api.inner.ICommonCheck', 'checkResource', 'body.acctNo', 'String');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0204-flow', 'stria_node_22', '����', 'fork round', 101, 156, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0204-flow', 'stria_node_27', '�ϲ�', 'join round', 102, 402, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0204-flow', 'stria_node_32', '�����˻��ۿ�', 'atom', 101, 480, 100, 24, 'all', 'RPC SERVICE API', 'com.dcits.ensemble.demo.rb.api.mbsdcore.IFin99990104', 'withdraw', 'body.rbAcctNo|body.bal', 'String|BigDecimal');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0204-flow', 'stria_node_33', '�����ȵ���', 'atom', 100, 623, 100, 24, 'all', 'SPRING BEAN', 'com.dcits.ensemble.cl.online.service.financial.Fin99990204', 'recycle', 'body.acctNo|body.bal', 'String|BigDecimal');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-9999-0101-flow', 'stria_node_1', '��ʼ', 'start round', 129, 85, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE, CLAZZ, METHOD_NAME, ARGS, ARGS_CLAZZ)
 Values
   ('Financial-9999-0101-flow', 'stria_node_4', '�˻���Ϣ��ѯ', 'atom', 131, 181, 120, 24, 'all', 'SPRING BEAN', 'com.dcits.ensemble.rb.online.service.financial.Fin99990101', 'getAcct', 'body.acctNo', 'String');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-1000-9101', 'stria_node_2', 'node_2', 'end round', 117, 684, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('Financial-1000-9101', 'stria_node_1', 'node_1', 'start round', 124, 187, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, SOURCE_TYPE, SERVICE_TYPE)
 Values
   ('Financial-1000-9101', 'stria_node_3', 'node_3', 'atom', 130, 389, 120, 24, 'all', 'SPRING BEAN');
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('RB203-WTD-flow', 'stria_node_1', '��ʼ', 'start round', 92, 92, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT)
 Values
   ('RB203-WTD-flow', 'stria_node_2', '����', 'end round', 92, 445, 24, 24);
Insert into STRIA_FLOW_NODES
   (FLOWID, ID, NAME, TYPE, CANVAS_TOP, CANVAS_LEFT, DIV_WIDTH, DIV_HEIGHT, EVENT_ID)
 Values
   ('RB203-WTD-flow', 'stria_node_3', '֧ȡ�¼�', 'event', 92, 252, 100, 24, '1');
COMMIT;
