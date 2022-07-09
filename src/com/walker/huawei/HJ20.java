package com.walker.huawei;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HJ20 {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            if (isLegal(str)) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }
    }

    private static boolean isLegal(String str) {
        return isLengthLegal(str) && hasThreeOrMoreType(str) && !hasSubStr(str);
    }

    private static boolean isLengthLegal(String str) {
        return str.length() > 8;
    }

    private static boolean hasThreeOrMoreType(String str) {
        int typeCount = 0;
        Pattern p1 = Pattern.compile("[A-Z]");
        Pattern p2 = Pattern.compile("[a-z]");
        Pattern p3 = Pattern.compile("[0-9]");
        Pattern p4 = Pattern.compile("[^a-zA-Z0-9]");
        if (p1.matcher(str).find()) {
            typeCount++;
        }
        if (p2.matcher(str).find()) {
            typeCount++;
        }
        if (p3.matcher(str).find()) {
            typeCount++;
        }
        if (p4.matcher(str).find()) {
            typeCount++;
        }
        return typeCount >= 3;
    }

    private static boolean hasSubStr(String str) {
        for (int i = 0, j = 3; j < str.length(); i++, j++) {
            if (str.substring(j).contains(str.substring(i, j))) {
                return true;
            }
        }
        return false;
    }
}
