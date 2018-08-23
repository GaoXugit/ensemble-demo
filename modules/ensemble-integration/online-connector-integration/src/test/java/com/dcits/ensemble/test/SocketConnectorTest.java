package com.dcits.ensemble.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.alibaba.fastjson.JSON;
import com.dcits.galaxy.util.ClassLoaderUtils;
import com.dcits.galaxy.util.FileUtils;
import com.dcits.galaxy.util.JsonUtils;
import com.dcits.galaxy.util.StringUtils;

public class SocketConnectorTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("127.0.0.1", 9010);
			OutputStream netOut = socket.getOutputStream();
			DataOutputStream doc = new DataOutputStream(netOut);
			DataInputStream in = new DataInputStream(socket.getInputStream());
			String filePath = ClassLoaderUtils.getResource("RB31_01.txt")
					.getFile();
			System.out.println(filePath);
			String str = JSON.parseObject(FileUtils.readFile(filePath))
					.toJSONString();
			System.out.println(JsonUtils.formatJson(str));
			byte[] req = str.getBytes("UTF-8");
			int length = req.length;
			doc.write(StringUtils.lfillStr(String.valueOf(length), 10, "0")
					.getBytes());
			doc.write(req);
			String res = in.readLine().substring(10);
			System.out.println(JsonUtils.formatJson(res));

			doc.close();
			in.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
				}
			}
		}
	}

}
