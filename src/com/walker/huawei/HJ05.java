package com.walker.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ05 {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) { // 注意 while 处理多个 case
            System.out.println(Long.parseLong(str.substring(2), 16));
        }
    }
}
