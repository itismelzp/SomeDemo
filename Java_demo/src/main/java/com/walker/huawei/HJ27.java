package com.walker.huawei;


import java.util.*;

public class HJ27 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String[] ss = scanner.nextLine().split(" ");
            int a = Integer.parseInt(ss[0]);
            String x = ss[ss.length - 2];
            int k = Integer.parseInt(ss[ss.length - 1]);
            List<String> list = new ArrayList<>();

            for (int i = 1; i <= a; i++) {
                if (isBrother(x, ss[i])) {
                    list.add(ss[i]);
                }
            }
            int size = list.size();
            System.out.println(size);
            if (size >= k) {
                Collections.sort(list);
                System.out.println(list.get(k - 1));
            }

        }
    }

    public static boolean isBrother(String x, String y) {
        if (x.length() != y.length() || y.equals(x)) {
            return false;
        }
        char[] s = x.toCharArray();
        char[] j = y.toCharArray();
        Arrays.sort(s);
        Arrays.sort(j);
        return new String(s).equals(new String(j));
    }

}
