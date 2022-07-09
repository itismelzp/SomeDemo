package com.walker.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HJ11 {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int num = Integer.parseInt(str);
            int ans;
            do {
                ans = num % 10;
                num = num / 10;
                System.out.print(ans);
            } while (num != 0);
            System.out.println();
        }
    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int num = in.nextInt();
//            int ans = 0;
//            do {
//                ans = num % 10;
//                num = num / 10;
//                System.out.print(ans);
//            } while (num != 0);
//            System.out.println();
//        }
//    }
}
