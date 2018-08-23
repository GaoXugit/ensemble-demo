package com.dcits.ensemble.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dcits.galaxy.util.ClassLoaderUtils;
import com.dcits.galaxy.util.FileUtils;
import com.dcits.galaxy.util.JsonUtils;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;

import java.io.*;

public class JettyConnectorTest {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String filePath = ClassLoaderUtils.getResource("inquiry-1400-9999.txt").getFile();
        String str = JSON.parseObject(FileUtils.readFile(filePath))
                .toJSONString();
        System.out.println(JsonUtils.formatJson(str));

        long start = System.currentTimeMillis();
        int i = -1;
        int count = 1;
        int success = 0;
        int fails = 0;
        int unknow = 0;
        try {
            for (i = 0; i < count; i++) {
                ObjectOutputStream oos = null;
                ObjectInputStream ois = null;
                PostMethod pm = null;
                try {
                    HttpClient hc = new HttpClient();
                    pm = new PostMethod("http://127.0.0.dad1:9001/galaxy");
                    pm.getParams().setSoTimeout(10 * 1000);

                    ByteArrayInputStream bais = new ByteArrayInputStream(
                            str.getBytes("UTF-8"));
                    pm.setRequestEntity(new InputStreamRequestEntity(bais));
                    int status = hc.executeMethod(pm);
                    if (status != 200) {
                        System.out.println("err...");
                    } else {
                        byte[] b_out = pm.getResponseBody();
                        String out = new String(b_out, "UTF-8");
                        if (count == 1)
                            System.out.println(JsonUtils.formatJson(out));
                        JSONObject outJson = JSON.parseObject(out);
                        if (outJson.containsKey("SYS_HEAD")
                                && outJson.getJSONObject("SYS_HEAD")
                                .containsKey("RET_STATUS")
                                && "S".equals(outJson.getJSONObject("SYS_HEAD")
                                .getString("RET_STATUS"))) {
                            success++;
                            System.out.println("第" + (i + 1) + "笔[SUCCESS]");
                        } else {
                            System.out.println("第"
                                    + (i + 1)
                                    + "笔"
                                    + JsonUtils
                                    .formatJson(outJson
                                            .getJSONObject("SYS_HEAD")
                                            .getJSONArray("RET")
                                            .toJSONString()));
                            fails++;
                        }
                    }
                } catch (Throwable t) {
                    t.printStackTrace();
                    unknow++;
                    try {
                        ByteArrayOutputStream baos = new ByteArrayOutputStream();
                        PrintStream ps = new PrintStream(baos);

                        t.printStackTrace(ps);

                        baos.close();
                        ps.close();

                        if (null != oos)
                            oos.close();
                        if (null != ois)
                            ois.close();
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                } finally {
                    pm.releaseConnection();
                }
            }
        } finally {
            long end = System.currentTimeMillis();
            System.out.println("交易笔数：" + i + " \n成功：" + success + " \n失败："
                    + fails + " \n未知：" + unknow + " \n平均时间：" + (end - start) / i);
        }
    }
}
