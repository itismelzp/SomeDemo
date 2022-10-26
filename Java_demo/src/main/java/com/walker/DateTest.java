package com.walker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {


    public static void main(String[] args) {
        testBetweenDays("2020-03-10", "2020-03-12");
        testDateAfterDay("2020-03-10", 80);
        System.out.println(formatTimeToString(100000));
    }


    public static String formatTimeToString(long ms) {
        long s = ms / 1000L;
        int seconds = (int) s % 60;
        int minutes = (int) s / 60;
        String secondString = seconds > 9 ? String.valueOf(seconds) : "0" + seconds;
        String minuteString = minutes > 9 ? String.valueOf(minutes) : "0" + minutes;
        return minuteString + ":" + secondString;
    }

    /**
     * 计算startDay过day天后的日期
     *
     * @param startDay
     * @param day
     */
    public static void testDateAfterDay(String startDay, int day) {

        String ret = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {

            Date date = sdf.parse(startDay);
            Calendar cl = Calendar.getInstance();
            cl.setTime(date);
            cl.add(Calendar.DATE, day);
            ret = sdf.format(cl.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("(" + startDay + ") 过" + day + "天后是：(" + ret + ")");
    }

    /**
     * 计算两个日期之间相差的天数
     */
    public static void testBetweenDays(String dateStr1, String dateStr2) {
        // 获取日期
        Date date1 = parseDate(dateStr1, "yyyy-MM-dd");
        Date date2 = parseDate(dateStr2, "yyyy-MM-dd");

        // 获取相差的天数
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date1);
        long timeInMillis1 = calendar.getTimeInMillis();
        calendar.setTime(date2);
        long timeInMillis2 = calendar.getTimeInMillis();

        long betweenDays = (timeInMillis2 - timeInMillis1) / (1000L * 3600L * 24L);
        System.out.println("(" + dateStr1 + ") 与 (" + dateStr2 + ") 相差：" + betweenDays + "天");
    }

    public static Date parseDate(String dateStr, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date date;
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            throw new RuntimeException("日期转化错误");
        }

        return date;
    }

}