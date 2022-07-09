package com.walker.huawei;

import java.util.*;

public class HJ92 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] ss = line.split("[^0-9]+");
            int max = 0;
            ArrayList<String> list = new ArrayList<>();
            for (String s : ss) {
                if (s.length() > max) {
                    max = s.length();
                    list.clear();
                    list.add(s);
                } else if (s.length() == max) {
                    list.add(s);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (String item : list) {
                sb.append(item);
            }
            sb.append(",").append(max);
            System.out.println(sb);
        }
    }
}
