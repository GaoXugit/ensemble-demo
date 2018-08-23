package com.dcits.ensemble.test;

import com.dcits.galaxy.client.ServiceProxy;
import com.dcits.galaxy.client.builder.Attributes;
import com.dcits.galaxy.client.builder.AttributesBuilderSupport;
import com.dcits.galaxy.client.builder.ServiceAttributesBuilder;
import com.dcits.galaxy.util.ObjectUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RpcServiceTest {

	public static void main(String[] args) throws ClassNotFoundException,
			NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		String api = "com.dcits.ensemble.gl.api.IGlIntAccrService";
		String method = "process";

		Attributes attributes = new ServiceAttributesBuilder().setAsync(false)
				.setLoadbalance(AttributesBuilderSupport.LOADBALANCE_RANDOM)
				.setCheck(false).build();
		Object o = ServiceProxy.getInstance().getService(Class.forName(api),
				attributes);
		Class<?>[] c = null;
		Method m = ObjectUtils.getMethod(o, method, c);
		Object[] os = null;
		Object rs = m.invoke(o, os);

		System.out.println(rs);
	}
}
