package com.walker.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HJ04 {


    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        // 注意 hasNext 和 hasNextLine 的区别
        while ((str = br.readLine()) != null) { // 注意 while 处理多个 case
//            String str = s.nextLine();
            int len = str.length();
            int start = 0;
            while (len >= 8) {
                System.out.println(str.substring(start, start + 8));
                start += 8;
                len -= 8;
            }

            if (len > 0) {
                char[] tmp = new char[8];
                for (int i = 0; i < 8; i++) {
                    if (i < len) {
                        tmp[i] = str.charAt(start + i);
                    } else {
                        tmp[i] = '0';
                    }
                }
                System.out.println(String.valueOf(tmp));
            }
        }
    }
}
