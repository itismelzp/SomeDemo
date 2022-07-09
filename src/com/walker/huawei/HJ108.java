package com.walker.huawei;

import java.util.Scanner;

public class HJ108 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();
            int lcm = a * b / gcb(a, b);
            System.out.println(lcm);
        }

    }

    private static int gcb(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcb(b, a % b);
    }

}
