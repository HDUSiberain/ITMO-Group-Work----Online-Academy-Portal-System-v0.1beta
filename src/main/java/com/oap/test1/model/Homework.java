package com.oap.test1.model;

import java.util.Date;

public class Homework {
    private int HID;
    private String Hname;
    private String Htext;
    private Date Hdeadline;
    private String CCID;
    private int FID;

    public void setCCID(String CCID) {
        this.CCID = CCID;
    }

    public String getCCID() {
        return CCID;
    }

    public void setFID(int FID) {
        this.FID = FID;
    }

    public int getFID() {
        return FID;
    }

    public void setHdeadline(Date hdeadline) {
        Hdeadline = hdeadline;
    }

    public Date getHdeadline() {
        return Hdeadline;
    }

    public void setHID(int HID) {
        this.HID = HID;
    }

    public int getHID() {
        return HID;
    }

    public void setHname(String hname) {
        Hname = hname;
    }

    public String getHname() {
        return Hname;
    }

    public void setHtext(String htext) {
        Htext = htext;
    }

    public String getHtext() {
        return Htext;
    }
}
