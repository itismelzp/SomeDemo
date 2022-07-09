package com.walker;

public class PoiInfo {

    public String poiId;

    public PoiInfo(String poiId) {
        this.poiId = poiId;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PoiInfo qzonePointInfo = (PoiInfo) obj;
        return qzonePointInfo.poiId.equals(this.poiId);
    }

    private static String getPoiName(String poi, String city) {

        System.out.print(String.format("poi=%10s, city=%5s", poi, city));
//        if (poi.indexOf("市") != poi.length() -1) {
//            poi = poi.replaceFirst("市", "·");
//        }
        String ret = "";
        if (!isEmpty(city)) {
            ret = poi.replace(city, city.replace("市", "·"));
        } else if (poi.indexOf("市") != poi.length() - 1) {
            ret = poi.replaceFirst("市", "·");
        }
        System.out.println("       getPoiName=" + ret);
        return ret;
    }

    private static boolean isEmpty(String str) {
        return str == null || "".equals(str);
    }

    public static void main(String[] args) {
        String poi0 = "", city0 = "";
        String poi1 = "北京市", city1 = "北京市";
        String poi2 = "郴州市嘉禾县", city2 = "郴州市";
        String poi3 = "郴州市嘉禾市", city3 = "郴州市";
        String poi4 = "某x市某县", city4 = "某x市";
        String poi5 = "郴州市嘉禾县", city5 = "";
        String poi6 = "郴州嘉禾县", city6 = "";
        String poi7 = "郴州市嘉禾市", city7 = "";
//        System.out.println(getPoiName(poi0, city0));
//        System.out.println(getPoiName(poi1, city1));
//        System.out.println(getPoiName(poi2, city2));
//        System.out.println(getPoiName(poi3, city3));
        getPoiName(poi0, city0);
        getPoiName(poi1, city1);
        getPoiName(poi2, city2);
        getPoiName(poi3, city3);
        getPoiName(poi4, city4);
        getPoiName(poi5, city5);
        getPoiName(poi6, city6);
        getPoiName(poi7, city7);


//        List<PoiInfo> list = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            list.add(new PoiInfo("" + i));
//        }
//
//        for (PoiInfo i : list) {
//            System.out.print(i.poiId + " ");
//
//        }
//        System.out.println();
//        PoiInfo info = new PoiInfo("6");
//        System.out.println(info.poiId);
//
//        list.remove(info);
//
//        for (PoiInfo i : list) {
//            System.out.print(i.poiId +" ");
//        }

    }

    @Override
    public String toString() {
        return "PoiInfo{\npoiId: " + poiId + "\n}";
    }
}
