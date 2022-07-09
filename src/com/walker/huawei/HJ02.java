package com.walker.huawei;

import java.util.Scanner;

public class HJ02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str = in.nextLine();
        String c  = in.next();
        String newStr = str.toUpperCase().replaceAll(c.toUpperCase(), "");
        System.out.println(str.length() - newStr.length());
    }
}
