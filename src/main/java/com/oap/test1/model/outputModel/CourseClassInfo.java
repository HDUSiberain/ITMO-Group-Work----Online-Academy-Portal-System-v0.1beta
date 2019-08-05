package com.oap.test1.model.outputModel;

public class CourseClassInfo {
    private String CCID;
    private String Cname;
    private String Uname;
    private String CID;
    private int CCnum;
    private int CCnum_MAX;

    public void setCCID(String CCID) {
        this.CCID = CCID;
    }

    public String getCCID() {
        return CCID;
    }

    public void setCCnum(int CCnum) {
        this.CCnum = CCnum;
    }

    public void setCCnum_MAX(int CCnum_MAX) {
        this.CCnum_MAX = CCnum_MAX;
    }

    public void setCID(String CID) {
        this.CID = CID;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public void setUname(String uname) {
        Uname = uname;
    }

    public int getCCnum_MAX() {
        return CCnum_MAX;
    }

    public int getCCnum() {
        return CCnum;
    }

    public String getCID() {
        return CID;
    }

    public String getCname() {
        return Cname;
    }

    public String getUname() {
        return Uname;
    }

}
