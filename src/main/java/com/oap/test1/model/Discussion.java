package com.oap.test1.model;

import java.util.Date;

public class Discussion {
    private int DID;
    private String UID;
    private String CCID;
    private String Dtext;
    private Date Ddate;

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getUID() {
        return UID;
    }

    public void setCCID(String CCID) {
        this.CCID = CCID;
    }

    public String getCCID() {
        return CCID;
    }

    public void setDdate(Date ddate) {
        Ddate = ddate;
    }

    public Date getDdate() {
        return Ddate;
    }

    public void setDID(int DID) {
        this.DID = DID;
    }

    public int getDID() {
        return DID;
    }

    public void setDtext(String dtext) {
        Dtext = dtext;
    }

    public String getDtext() {
        return Dtext;
    }
}
