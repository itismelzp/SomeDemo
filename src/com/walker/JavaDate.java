package com.walker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class JavaDate {

    public static void main(String[] args) {

        String url = "https://h5.qzone.qq.com/v2/shuoshuo-daily/calendar/{date}?_wv=1027";
        Date now = new Date();

        System.out.println(now);

        //1.Date 转化String
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM", Locale.getDefault());
        System.out.println(Locale.getDefault());
        String dateStr = sdf.format(new Date());
        System.out.println(dateStr);
        System.out.println(url.replace("{date}", dateStr));


        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        System.out.println(map);

        System.out.println("======");
        String material = "vedio^http://www.baidu.com";
        String[] datas = material.split("\\^");
        System.out.println(material);
        for (String data : datas) {
            System.out.println(data);
        }
    }
}
