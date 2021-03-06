package com.walker.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ38 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = bf.readLine()) != null) { // 多组输入
            double h = Double.parseDouble(s); // 记录总的
            double temp = h / 2; // 弹跳多高
            for (int i = 1; i < 5; i++) {
                h += temp * 2;
                temp = temp / 2;
            }
            System.out.println(h);
            System.out.println(temp);
        }
    }
}
