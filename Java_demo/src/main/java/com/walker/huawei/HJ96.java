package com.walker.huawei;

import java.util.Scanner;

public class HJ96 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            System.out.println(input.replaceAll("([0-9]+)", "*$1*")); //把所有的数字段提取出来，前后加上星号再放回去
        }
    }
}
