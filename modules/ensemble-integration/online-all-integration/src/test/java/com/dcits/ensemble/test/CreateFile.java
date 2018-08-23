package com.dcits.ensemble.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Tim on 2016/3/9.
 */
public class CreateFile {

    public static void main(String arg[]) {
        try {
            long start = System.currentTimeMillis();
            File f = new File("E:\\svn\\snapshot\\ensemble-demo\\modules\\ensemble-demo-integration\\online-all-integration\\src\\test\\resources\\param\\name.txt");
            BufferedWriter b = new BufferedWriter(new FileWriter(f));
            for (int i = 0; i < 1000; i++) {
                if (i == 1000 - 1)
                    b.write("TEST_" + i);
                else
//                        b.write(SeqUtils.getRandomNumber(20) + "\n");
                    b.write("TEST_" + i + "\n");
                if (i % 1000 == 0) b.flush();
            }
            b.close();
            long end = System.currentTimeMillis();
            System.out.println(end - start);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
