package com.walker.bean;

import java.io.Serializable;
import java.util.List;

public class WinkPublishMediaRecord implements Serializable {

    public final static String WINK_REPORT_TYPE_STICKER = "sticker";
    public final static String WINK_REPORT_TYPE_FILTER = "filter";
    public final static String WINK_REPORT_TYPE_TEMPLATE = "template";
    public final static String WINK_REPORT_TYPE_MUSIC = "music";
    public final static String WINK_REPORT_TYPE_MATERIAL = "meterial"; // 拍摄页道具

    public String mediaType;
    public List<String> mediaId;

    public WinkPublishMediaRecord(String type, List<String> idList) {
        mediaId = idList;
        mediaType = type;
    }

//    public String getMediaIdStr() {
//        StringBuilder mediaIdStr = new StringBuilder();
//        if (mediaId != null && mediaId.size() > 0) {
//
//            for (String s : mediaId) {
//                if (mediaIdStr.length() == 0) {
//                    mediaIdStr.append(s);
//                } else {
//                    mediaIdStr.append(",").append(s);
//                }
//            }
//        }
//
//        System.out.println("getMediaIdStr: " + mediaIdStr);
//        return mediaIdStr.toString();
//    }

    public String getMediaIdStr() {
        StringBuilder mediaIdStr = new StringBuilder();
        if (mediaId != null && mediaId.size() > 0) {
            for (int i = 0; i < mediaId.size(); i++) {
                mediaIdStr.append(i == 0 ? mediaId.get(i) : "," + mediaId.get(i));
            }
        }

        System.out.println("getMediaIdStr: " + mediaIdStr);
        return mediaIdStr.toString();
    }

}
