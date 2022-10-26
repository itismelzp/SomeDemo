package com.walker.huawei;

import java.util.Scanner;

public class HJ22 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int k = sc.nextInt();
            if (k == 0) {
                return;
            }
            System.out.println(k / 2);
        }
    }
}
