package com.oap.test1.model;

import java.util.Date;

public class Discussion_with {
    private int DWID;
    private int DID;
    private String UID;
    private String DWtext;
    private Date DWDate;

    public void setDID(int DID) {
        this.DID = DID;
    }

    public int getDID() {
        return DID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getUID() {
        return UID;
    }

    public void setDWDate(Date DWDate) {
        this.DWDate = DWDate;
    }

    public Date getDWDate() {
        return DWDate;
    }

    public void setDWID(int DWID) {
        this.DWID = DWID;
    }

    public int getDWID() {
        return DWID;
    }

    public void setDWtext(String DWtext) {
        this.DWtext = DWtext;
    }

    public String getDWtext() {
        return DWtext;
    }
}
