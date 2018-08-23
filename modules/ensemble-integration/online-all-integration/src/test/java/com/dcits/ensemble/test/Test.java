package com.dcits.ensemble.test;

import com.dcits.galaxy.util.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * Created by Tim on 2016/5/30.
 */
public class Test {

    public static void main(String arg[]) throws FileNotFoundException {
        PrintWriter p = new PrintWriter(new FileOutputStream(new File("d:\\phone.txt")));
        PrintWriter p1 = new PrintWriter(new FileOutputStream(new File("d:\\seq.txt")));
        for (int i = 0; i < 1000000; i++) {
            p.println("133" + StringUtils.lfillStr(String.valueOf(i), 8, "0"));
            p1.println(StringUtils.lfillStr(String.valueOf(i), 8, "0"));
            if (i % 10000 == 0) {
                p.flush();
                p1.flush();
            }
        }
        p.close();
        p1.close();
    }
}
