package com.dcits.ensemble.util;

import com.dcits.galaxy.common.GalaxyConstants;
import com.dcits.galaxy.common.bean.ArgumentBean;
import com.dcits.galaxy.common.data.BeanResult;
import com.dcits.galaxy.common.tuple.TwoTuple;
import com.dcits.galaxy.exception.BusinessException;
import com.dcits.galaxy.exception.GalaxyException;
import com.dcits.galaxy.spring.SpringApplicationContext;
import com.dcits.galaxy.util.ObjectUtils;
import com.dcits.galaxy.util.StringUtils;
import org.springframework.beans.BeansException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * ensemble Created by cheng.liang on 2015/8/11.
 */
public class InvokeUtil {
    public static Object invokeObject(String clazz) {
        Object invokeObject = null;
        try {
            //invokeObject = BaseGenerator.create(Class.forName(clazz)).next();
            invokeObject = SpringApplicationContext.getContext().getBean(clazz);
        } catch (BeansException e) {
            return null;
        }
        return invokeObject;
    }


    /**
     * 获取参数配置
     *
     * @return
     * @description
     * @version 1.0
     * @author Tim
     * @update 2014年12月19日 上午9:29:57
     */
    public static List<ArgumentBean> getArgumentBean(String args, String argsClazz) {
        List<ArgumentBean> argsl = new ArrayList<ArgumentBean>();
        // 空参数
        if (StringUtils.isEmpty(args) && StringUtils.isEmpty(argsClazz))
            return argsl;
        String[] arg = args.split("\\|");
        String[] argClazz = argsClazz.split("\\|");
        ArgumentBean argBean;
        for (int i = 0; i < arg.length; i++) {
            argBean = new ArgumentBean();
            argBean.setArgType(argClazz[i]);
            argBean.setArgValue(arg[i]);
            argsl.add(argBean);
        }
        return argsl;
    }

    /**
     * 获取参数类型和对象
     *
     * @param argsl
     * @return
     * @throws ClassNotFoundException
     */
    public static TwoTuple<Class<?>[], Object[]> getArguments(List<ArgumentBean> argsl, Map<String, Object> map) throws ClassNotFoundException {
        TwoTuple<Class<?>[], Object[]> twoTuple = null;
        Object[] args = null;
        Class<?>[] clazzs = null;
        int i = 0;
        StringBuffer sb = new StringBuffer();
        for (ArgumentBean argbean : argsl) {
            if (null == args) {
                args = new Object[argsl.size()];
            }
            if (null == clazzs) {
                clazzs = new Class<?>[argsl.size()];
            }

            Class<?> c = ObjectUtils.getBaseDataType(argbean.getArgType());
            if (null == c)
                c = Class.forName(argbean.getArgType());
            try {
                clazzs[i] = c;
                Object o = null;
                if ("null".equals(argbean.getArgValue())) {// 传入参数获为null对象。
                    args[i] = o;
                    continue;
                } else {
                    try {
                        // 使用Spring spel表达式获取入参值
                        o = SpelExpressionUtil.eval(c, argbean.getArgValue(), map);
                    } catch (Throwable t) {
                        o = null;
                    }
                }
                args[i] = o;
            } finally {
                sb.append("\n入参类型 [" + c.getName() + "] 入参值 [" + args[i] + "] 表达式 [" + argbean.getArgValue() + "]");
                i++;
            }
        }
        //if (i > 0 && log.isDebugEnabled()) log.debug("执行方法入参类型和值" + sb.toString());
        twoTuple = new TwoTuple<>(clazzs, args);
        return twoTuple;
    }


    /**
     * 获取服务之星方法实例
     *
     * @return
     * @description
     * @version 1.0
     * @author Tim
     * @update 2014年12月19日 上午10:00:00
     */
    public static Method getMethod(Object object, String methodName, String args, String argsClazz) {
        Method m = null;
        try {
            m = ObjectUtils.getMethod(object, methodName,
                    getArgumentBean(args, argsClazz));
        } catch (ClassNotFoundException | NoSuchMethodException
                | SecurityException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException e) {
            throw new BusinessException(GalaxyConstants.CODE_FAILED, e
                    .getClass().getSimpleName() + ":" + e.getMessage());
        }
        return m;
    }

    public static BeanResult invoke(String clazz, String methodName, String args, String argsClazz, Map<String, Object> map) {
        BeanResult br = new BeanResult();
        try {
            Object[] args1 = getArguments(getArgumentBean(args, argsClazz), map).second;
            //Class<?> serviceClass = Class.forName(clazz);
            Object object = invokeObject(clazz);

            Method method = getMethod(object, methodName, args, argsClazz);
            br = (BeanResult) method.invoke(object, args1);
        } catch (Exception e) {
            if (e instanceof BusinessException)
                return new BeanResult(((BusinessException) e).getRets());
            throw new GalaxyException(e);
        }

        return br;
    }

}
