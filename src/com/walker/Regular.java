package com.walker;

public class Regular {

    public static void main(String[] args) {

        String prefix = "http(s)?://";

        String str1 = "http://www.baidu.com";
        String str2 = "https://www.baidu.com";

        System.out.println(str1.startsWith(prefix));
        System.out.println(str2.startsWith(prefix));





    }

}
