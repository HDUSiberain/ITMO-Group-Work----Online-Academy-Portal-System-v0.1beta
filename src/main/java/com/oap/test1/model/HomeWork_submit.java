package com.oap.test1.model;

public class HomeWork_submit {
    private String HSID;
    private int HID;
    private String SID;
    private String HSText;
    private int FID;
    private int Hgrade;

    public void setHID(int HID) {
        this.HID = HID;
    }

    public int getHID() {
        return HID;
    }

    public void setFID(int FID) {
        this.FID = FID;
    }

    public int getFID() {
        return FID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getSID() {
        return SID;
    }

    public void setHgrade(int hgrade) {
        Hgrade = hgrade;
    }

    public int getHgrade() {
        return Hgrade;
    }

    public void setHSID(String HSID) {
        this.HSID = HSID;
    }

    public String getHSID() {
        return HSID;
    }

    public void setHSText(String HSText) {
        this.HSText = HSText;
    }

    public String getHSText() {
        return HSText;
    }
}
