package com.walker.huawei;

import java.util.Scanner;

public class HJ33 {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String ip = in.nextLine();
            long num = in.nextLong();

            System.out.println(ip2Long(ip));
            System.out.println(long2Ip(num));
        }
    }

    private static long ip2Long(String ip) {
        String[] fields = ip.split("\\.");

        long num = 0;
        for (String field : fields) {
            num = num * 256 + Long.parseLong(field);
        }
        return num;
    }

    private static String long2Ip(long num) {
        long[] ipFields = new long[4];
        for (int i = 0; i < ipFields.length; i++) {
            ipFields[i] = num % 256;
            num /= 256;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = ipFields.length - 1; i >= 0; i--) {
            if (i != ipFields.length - 1) {
                sb.append('.');
            }
            sb.append(ipFields[i]);
        }
        return sb.toString();
    }
}
