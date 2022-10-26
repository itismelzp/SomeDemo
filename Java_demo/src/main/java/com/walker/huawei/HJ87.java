package com.walker.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ87 {

    //可以，除了数字和字母真就全都是字符呗哈哈
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputs;
        while ((inputs = br.readLine()) != null) {
            int num = 0;
            int lower = 0;
            int upper = 0;
            int symbol = 0;
            int score = 0;
            char[] input = inputs.toCharArray();

            // 进行计数
            for (char c : input) {
                if (c <= '9' && c >= '0') {
                    num++;
                } else if (c <= 'Z' && c >= 'A') {
                    upper++;
                } else if (c <= 'z' && c >= 'a') {
                    lower++;
                } else {
                    symbol++;
                }
            }

            // 处理长度
            if (input.length <= 4) {
                score += 5;
            } else if (input.length <= 7) {
                score += 10;
            } else {
                score += 25;
            }

            // 处理字母
            if (upper != 0 && lower != 0) {
                score += 20;
            } else if (upper != 0 || lower != 0) {
                score += 10;
            }

            // 处理数字
            if (num == 1) {
                score += 10;
            } else if (num > 1) {
                score += 20;
            }

            // 处理符号
            if (symbol == 1) {
                score += 10;
            } else if (symbol > 1) {
                score += 25;
            }

            // 奖励
            if (upper != 0 && lower != 0 && num != 0 && symbol != 0) {
                score += 5;
            } else if (upper + lower != 0 && num != 0 && symbol != 0) {
                score += 3;
            } else if ((upper != 0 || lower != 0) && num != 0) {
                score += 2;
            }

            if (score >= 90) {
                System.out.println("VERY_SECURE");
            } else if (score >= 80) {
                System.out.println("SECURE");
            } else if (score >= 70) {
                System.out.println("VERY_STRONG");
            } else if (score >= 60) {
                System.out.println("STRONG");
            } else if (score >= 50) {
                System.out.println("AVERAGE");
            } else if (score >= 25) {
                System.out.println("WEAK");
            } else {
                System.out.println("VERY_WEAK");
            }
        }

    }
}
