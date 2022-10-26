package com.walker.huawei;

import java.io.*;

public class HJ90 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = bf.readLine()) != null) {
            if (isLegalIP(str)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean isLegalIP(String str) {
        String[] subIP = str.split("\\.");
        if (subIP.length != 4) {
            return false;
        }
        for (String s : subIP) {
            if (s == null || s.equals("")) {
                return false;
            }
            if (s.contains("+")) {
                return false;
            }
            if (s.charAt(0) == '0' && s.length() != 1) {
                return false;
            }
            int intIP = Integer.parseInt(s);
            if (intIP < 0 || intIP > 255) {
                return false;
            }
        }
        return true;
    }
}
