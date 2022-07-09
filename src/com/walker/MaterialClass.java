package com.walker;

import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MaterialClass {

    private String mMaterialID;
    private String mMateiralIcon;


    public MaterialClass(@Nullable String materialID, @Nullable String mateiralIcon) {
        mMaterialID = materialID;
        mMateiralIcon = mateiralIcon;
    }

    public String getMaterialID() {
        return mMaterialID;
    }

    public String getMaterialIcon() {
        return mMateiralIcon;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof MaterialClass)) {
            return false;
        }

        MaterialClass materialClass = (MaterialClass) obj;
        return materialClass.getMaterialID().equals(mMaterialID)
                && materialClass.getMaterialIcon().equals(this.mMateiralIcon);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (mMateiralIcon == null ? 0 : mMateiralIcon.hashCode());
        result = 31 * result + (mMaterialID == null ? 0 : mMaterialID.hashCode());
        return result;
    }

    @Override
    public String toString() {

        return "mMaterialID=" +  mMaterialID + ",mMateiralIcon:" + mMateiralIcon;
    }

    public static void main(String[] args) {

        MaterialClass a = new MaterialClass("1", "one");
        MaterialClass b = new MaterialClass("2", "two");
        MaterialClass c = new MaterialClass("3", "three");

        MaterialClass cc = new MaterialClass("3", "three");

        List<MaterialClass> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        for (MaterialClass tmp : list) {
            if (tmp.equals(cc)) {
                System.out.println(tmp.toString());
            }
        }

        if (list.contains(cc)) {
            System.out.println("contains:"+cc.toString());
        }

        System.out.println("".hashCode());


        StringBuilder sb = new StringBuilder();
        sb.append("a").append("b");
        System.out.println(sb.toString());
    }

}
