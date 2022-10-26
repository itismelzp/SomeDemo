package com.walker;

import com.walker.bean.WinkPublishMediaRecord;

import java.util.ArrayList;
import java.util.Arrays;

import static com.walker.bean.WinkPublishMediaRecord.WINK_REPORT_TYPE_FILTER;
import static com.walker.bean.WinkPublishMediaRecord.WINK_REPORT_TYPE_MATERIAL;

public class StringArrayDemo {


    public static void main(String[] args) {


        ArrayList<ArrayList<WinkPublishMediaRecord>> publishParams = new ArrayList<>();
        ArrayList<WinkPublishMediaRecord> publishMediaRecords1 = new ArrayList<>();
        ArrayList<WinkPublishMediaRecord> publishMediaRecords2 = new ArrayList<>();
        ArrayList<WinkPublishMediaRecord> publishMediaRecords3 = new ArrayList<>();



        // pic one
        WinkPublishMediaRecord filter1  = new WinkPublishMediaRecord(WINK_REPORT_TYPE_FILTER, new ArrayList<>(Arrays.asList("filter11", "filter12")));
        WinkPublishMediaRecord meterial1  = new WinkPublishMediaRecord(WINK_REPORT_TYPE_MATERIAL, new ArrayList<>(Arrays.asList("meterial11", "meterial11")));
        publishMediaRecords1.add(filter1);
        publishMediaRecords1.add(meterial1);

        // pic two
        WinkPublishMediaRecord filter2  = new WinkPublishMediaRecord(WINK_REPORT_TYPE_FILTER, new ArrayList<>(Arrays.asList("filter21", "filter22")));
        WinkPublishMediaRecord meterial2  = new WinkPublishMediaRecord(WINK_REPORT_TYPE_MATERIAL, new ArrayList<>(Arrays.asList("meterial21", "meterial22")));
        publishMediaRecords2.add(filter2);
        publishMediaRecords2.add(meterial2);

        // pic three
        WinkPublishMediaRecord filter3  = new WinkPublishMediaRecord(WINK_REPORT_TYPE_FILTER, new ArrayList<>(Arrays.asList("filter31", "filter32")));
        WinkPublishMediaRecord meterial3  = new WinkPublishMediaRecord(WINK_REPORT_TYPE_MATERIAL, new ArrayList<>(Arrays.asList("meterial31", "meterial32")));
        publishMediaRecords3.add(filter3);
        publishMediaRecords3.add(meterial3);

        publishParams.add(publishMediaRecords1);
        publishParams.add(publishMediaRecords2);
        publishParams.add(publishMediaRecords3);

        generateDatongParams(publishParams);

    }

    private static void generateDatongParams(ArrayList<ArrayList<WinkPublishMediaRecord>> publishParams) {
        StringBuilder filterNames = new StringBuilder();
        StringBuilder materialNames = new StringBuilder();
        for (ArrayList<WinkPublishMediaRecord> publishParam : publishParams) {
            StringBuilder filterIdStr = new StringBuilder();
            StringBuilder materialIdStr = new StringBuilder();
            for (WinkPublishMediaRecord winkPublishMediaRecord : publishParam) {
                if (WINK_REPORT_TYPE_FILTER.equals(winkPublishMediaRecord.mediaType)) {
                    if (filterIdStr.length() == 0) {
                        filterIdStr.append(winkPublishMediaRecord.getMediaIdStr());
                    } else {
                        filterIdStr.append(",").append(winkPublishMediaRecord.getMediaIdStr());
                    }
                } else if (WINK_REPORT_TYPE_MATERIAL.equals(winkPublishMediaRecord.mediaType)) {
                    if (materialIdStr.length() == 0) {
                        materialIdStr.append(winkPublishMediaRecord.getMediaIdStr());
                    } else {
                        materialIdStr.append(",").append(winkPublishMediaRecord.getMediaIdStr());
                    }
                }
            }
            if (filterNames.length() == 0) {
                filterNames.append(filterIdStr);
            } else {
                filterNames.append(",").append(filterIdStr);
            }
            if (materialNames.length() == 0) {
                materialNames.append(materialIdStr);
            } else {
                materialNames.append(",").append(materialIdStr);
            }
        }

        System.out.println("filterNames: " + filterNames);
        System.out.println(materialNames);

    }

}
