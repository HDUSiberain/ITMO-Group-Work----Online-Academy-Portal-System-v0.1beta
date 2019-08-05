package com.oap.test1.model;

public class Course_class {
    private String CCID;
    private String CID;
    private String TID;
    private int CCnum;
    private int CCnum_MAX;

    public void setCID(String CID) {
        this.CID = CID;
    }

    public String getCID() {
        return CID;
    }

    public void setTID(String TID) {
        this.TID = TID;
    }

    public String getTID() {
        return TID;
    }

    public void setCCID(String CCID) {
        this.CCID = CCID;
    }

    public String getCCID() {
        return CCID;
    }

    public void setCCnum_MAX(int CCnum_MAX) {
        this.CCnum_MAX = CCnum_MAX;
    }

    public int getCCnum() {
        return CCnum;
    }

    public void setCCnum(int CCnum) {
        this.CCnum = CCnum;
    }

    public int getCCnum_MAX() {
        return CCnum_MAX;
    }

}

