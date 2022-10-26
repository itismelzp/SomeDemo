package com.walker.huawei;

import java.util.Scanner;

public class HJ40 {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) {
            String str = in.nextLine();
            String s1 = str.replaceAll("[A-Za-z]+", "");
            System.out.println(str.length() - s1.length());
            String s2 = s1.replaceAll(" ", "");
            System.out.println(s1.length() - s2.length());
            String s3 = s2.replaceAll("[0-9]+", "");
            System.out.println(s2.length() - s3.length() + "\n" + s3.length());
        }
    }
}
