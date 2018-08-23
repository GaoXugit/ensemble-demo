package com.dcits.ensemble.util;

import com.dcits.galaxy.business.util.BusinessUtils;
import com.dcits.galaxy.common.data.Results;
import com.dcits.galaxy.exception.BusinessException;
import com.dcits.galaxy.util.DateUtils;
import com.dcits.galaxy.util.StringUtils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class BusiUtil extends BusinessUtils {

    /**
     * 获取异常
     *
     * @param ret
     * @return
     * @author chengliang
     */
    public static BusinessException createBusinessException(Results ret) {
        return createException(BusinessException.class, ret);
    }

    /**
     * 字符类型比较是否等于Y
     *
     * @param s
     * @return
     */
    public static boolean isEqualY(String s) {
        return isEquals(s, "Y");
    }

    /**
     * 字符类型比较指定位置字符串是否等于
     *
     * @param s
     * @param t
     * @param index
     * @return
     */
    public static boolean isEqualforIndex(String s, String t, int index) {

        if (isNotNull(s)) {
            int len = s.length();
            if (len < index) {
                return false;
            } else {
                return isEquals(s.substring(index, index + 1), t);
            }
        }
        return false;
    }

    /**
     * 当source与condition比较值大小时，return 较大值<br>
     *
     * @param source
     * @param condition
     * @return
     * @description
     * @version 1.0
     * @author furong
     * @update 2016年1月28日 下午20:35:46
     */
    public static String Max(String source, String condition) {
        if (source.compareTo(condition) >= 0)
            return source;
        return condition;
    }

    /**
     * 转换为BigDecimal类型
     *
     * @param obj
     * @return BigDecimal
     * @author xucxd
     * @update 2016年2月24日 下午16:50:50
     */


    public static BigDecimal toBigDecimal(Object obj) {
        if (obj == null) {
            return null;
        } else if (obj instanceof String) {
            String str = (String) obj;
            if ("".equals(str)) {
                return null;
            } else {
                return new BigDecimal(str);
            }
        }
        return new BigDecimal(String.valueOf(obj));
    }

    public static String formatArrayString(ArrayList list) {
        String ret = "";
        ret = list.toString();
        ret = ret.substring(1, ret.length());
        ret = ret.substring(0, ret.length() - 1);
        return ret;
    }

    /**
     * 判断对象是否为Null，数组size = 0,字符串 length = 0
     *
     * @param obj Object
     * @return boolean
     */
    private static boolean isNullObj(Object obj) {
        if (obj == null) {
            return true;
        }
        if (String.class.isInstance(obj)) {
            return StringUtils.isEmpty((String) obj);
        } else if (List.class.isInstance(obj)) {
            return ((List) obj).size() == 0;
        } else {
            return obj == null;
        }
    }

    /**
     * 对象是否为空
     *
     * @param obj Object
     * @return boolean
     */
    public static boolean isNull(Object obj) {
        return isNullObj(obj);
    }

    /**
     * 对象是否不为空
     *
     * @param obj Object
     * @return boolean
     */
    public static boolean isNotNull(Object obj) {
        return !isNull(obj);
    }


    /**
     * 对象是否全部为null
     *
     * @param objs
     * @return
     */
    public static boolean isNullAll(Object... objs) {

        for (int i = 0; i < objs.length; i++) {
            if (isNotNull(objs[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * 对象是否全部不为null
     *
     * @param objs
     * @return
     */
    public static boolean isNotNullAll(Object... objs) {

        for (int i = 0; i < objs.length; i++) {
            if (isNull(objs[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * 对象是否存在不为null
     *
     * @param objs
     * @return
     */
    public static boolean isNotNull(Object... objs) {

        for (int i = 0; i < objs.length; i++) {
            if (isNotNull(objs[i])) {
                return true;
            }
        }
        return false;
    }

    /**
     * 对象为空返回0，否则返回对应int类型的数值
     *
     * @param strNum
     * @return
     */
    public static int nvlZero(String strNum) {
        int ret = 0;

        if (BusiUtil.isNotNull(strNum)) {
            ret = Integer.parseInt(strNum);
        }
        return ret;
    }

    /**
     * 日期格式化
     *
     * @param date
     * @return
     */
    public static String dateFormat(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(DateUtils.DEFAULT_DATE_FORMAT);
        return sdf.format(date);
    }

    /**
     * 获取日期
     *
     * @param dateStr
     * @return
     */
    public static Date getDate(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat(DateUtils.DEFAULT_DATE_FORMAT);
        Date date = null;
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            //e.printStackTrace();
        }
        return date;
    }

    /**
     * 日期计算
     *
     * @param dateStr yyyyMMdd 格式日期
     * @param addNum  增加数值，负数代码减少数值
     * @param freq    周期类型 D：天数 M：月数 Y：年数
     * @return
     */
    public static String calcFreqDate(String dateStr, String addNum, String freq) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = null;
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        int add = Integer.parseInt(addNum);

        int freqType = -1;
        switch (freq) {
            case "D":
                freqType = Calendar.DAY_OF_YEAR;
                break;
            case "M":
                freqType = Calendar.MONTH;
                break;
            case "Y":
                freqType = Calendar.YEAR;
                break;
            default:
                break;
        }
        if (freqType < 0) {
            createBusinessException("FM4031", freq);
        }
        Date ret = addDate(date, add, freqType);
        return dateFormat(ret);
    }

    /**
     * 日期计算
     *
     * @param date 日期
     * @param num  增加数值
     * @param freq 周期类型
     * @return
     */
    private static Date addDate(Date date, int num, int freq) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(freq, num);
        Date ret = calendar.getTime();
        return ret;
    }

    /**
     * 两个日期间隔数
     *
     * @param dateStr1 日期1
     * @param dateStr2 日期2
     * @param freq     周期类型 D：天数 M：月数 Y：年数
     * @return int
     */

    public static int diff(String dateStr1, String dateStr2, String freq) {
        Date date1 = getDate(dateStr1);
        Date date2 = getDate(dateStr2);
        int diff = 0;
        if (BusiUtil.isNotNullAll(date1, date2)) {

            Calendar c1 = Calendar.getInstance();
            c1.setTime(date1);
            //设置时间为0
            c1.set(Calendar.HOUR_OF_DAY, 0);
            c1.set(Calendar.MINUTE, 0);
            c1.set(Calendar.SECOND, 0);

            Calendar c2 = Calendar.getInstance();
            c2.setTime(date2);
            //设置时间为0
            c2.set(Calendar.HOUR_OF_DAY, 0);
            c2.set(Calendar.MINUTE, 0);
            c2.set(Calendar.SECOND, 0);

            switch (freq) {
                case "D":
                    //跨年月计算
                    long days = (c2.getTimeInMillis() - c1.getTimeInMillis()) / (1000 * 3600 * 24);
                    diff = Integer.parseInt(String.valueOf(days));
                    break;
                case "M":
                    diff = c2.get(Calendar.MONTH) - c1.get(Calendar.MONTH);
                    break;
                case "Y":
                    diff = c2.get(Calendar.YEAR) - c1.get(Calendar.YEAR);
                    break;
                default:
                    break;
            }
        }
        return diff;
    }

}