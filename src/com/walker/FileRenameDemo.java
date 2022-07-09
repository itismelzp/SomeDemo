package com.walker;

import java.io.File;

public class FileRenameDemo {


    public static void main(String[] args) {

        String desttDir = "/Users/walkerzpli/walker/需求目录/848/动画/白色对勾_bmp/";
        File dir = new File("/Users/walkerzpli/walker/需求目录/848/动画/白色对勾_bmp/rename/");

        String str1 = "";
        String str2 = "";
        str1.compareTo(str2);

        File destRoot= new File(desttDir);
        if (!destRoot.exists()) {
            destRoot.mkdir();
        }
//
//        for (File file: dir.listFiles()) {
////            System.out.println(file.getName());
//            File destFile = new File(desttDir + file.getName().replace("follow_show_bmp", "follow_bmp"));
////            System.out.println(destFile.getName());
//            String destName = destFile.getName();
//            System.out.println(String.format("<item android:drawable=\"@drawable/%s\" android:duration=\"60\"/>", destName.substring(0, destName.length() - 4)));
//
//
//            if (!destFile.exists()) {
//                file.renameTo(destFile);
//            }
//        }

        System.out.println("========");
//
//        for (int i = 0; i < dir.listFiles().length; i++) {
//            System.out.println(String.format("<item android:drawable=\"@drawable/qzone_video_left_follow_bmp_000%02d\" android:duration=\"60\"/>", i));
//        }

        for (int i = 5; i < 30; i++) {
            System.out.println(String.format("<item android:drawable=\"@drawable/bmp_000%02d\" android:duration=\"100\" />", i));
        }

//        System.out.println("========");
//
//        for (int i = dir.listFiles().length -1;i>=0 ;i--) {
//            System.out.println(String.format("<item android:drawable=\"@drawable/qzone_video_left_follow_bmp_000%02d\" android:duration=\"60\"/>", i));
//        }

    }

}
