package com.walker;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Test {

    private static final String GRADLE_RES_PREFIX = "Gradle: ";

    public static void main(String[] args) {


//        List<String> list = null;
//        for (String item : list) {
//            System.out.println("222");
//        }

        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, Calendar.DECEMBER, 31);
        Date strDate = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(dateFormat.format(strDate));



        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(dateFormat2.format(strDate));

        System.out.println(useNewTailStyle(9900));
        System.out.println(useNewTailStyle(9909));
        System.out.println(useNewTailStyle(9911));
        System.out.println(useNewTailStyle(9915));
        System.out.println(useNewTailStyle(9920));
        System.out.println(useNewTailStyle(9945));
        System.out.println(useNewTailStyle(9999));



        String libName1 = "Gradle: com.tencent.mobileqq:feed_interface:0.0.0.2-m-996c8f9@jar";
        String libName2 = "Gradle: com.tencent.mobileqq:feed_interface:0.0.0.2-m-996c8f9";
        String libName3 = "996c8f9@jar";
        String libName4 = "@jar";
        String libName5 = "@";

        printLibKey(libName1);
        printLibKey(libName2);
        printLibKey(libName3);
        printLibKey(libName4);
        printLibKey(libName5);


        printRotate(0);


        int a = 0;
        switch (a) {

            case 0:
            case 1: {
                System.out.println("----1");
                break;
            }

            case 2:
                System.out.println("----2");
                break;
            default:
                break;
        }



        int width = 3;
        float roundPx = width / 2f;
        System.out.println("roundPx: " + roundPx);
    }

    private static void printLibKey(String libraryName) {
        System.out.print(libraryName + "---");

        String gradlePrefix = "Gradle: ";
        if (libraryName.startsWith(gradlePrefix)) {
            libraryName = libraryName.substring(gradlePrefix.length()).trim();
        }

        int indexOfAt = libraryName.indexOf('@');
        if (indexOfAt >= 0) {
            libraryName = libraryName.substring(0, indexOfAt);
        }

        System.out.println(libraryName);
    }

    public static boolean useNewTailStyle(long uin) {
        String rangeStr = "11-20";

        try {
            String[] range = rangeStr.split("-");
            long start = Integer.parseInt(range[0]);
            long end = Integer.parseInt(range[1]);
            return (start <= uin % 100) && (uin % 100 <= end);
        } catch (Exception e) {
            return false;
        }
    }

    private static void printRotate(int rotate) {
        for (int i = 0; i < 5; i++) {
            rotate = (rotate + 90) % 360;
            System.out.println(rotate);
        }
    }


}
