package com.oap.test1.model;

public class Student_choose_class {
    private int SCCID;
    private String SID;
    private String CCID;
    private int SCgrade;
    private int TCgrade;

    public void setCCID(String CCID) {
        this.CCID = CCID;
    }

    public String getCCID() {
        return CCID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getSID() {
        return SID;
    }

    public void setSCCID(int SCCID) {
        this.SCCID = SCCID;
    }

    public int getSCCID() {
        return SCCID;
    }

    public void setSCgrade(int SCgrade) {
        this.SCgrade = SCgrade;
    }

    public int getSCgrade() {
        return SCgrade;
    }

    public void setTCgrade(int TCgrade) {
        this.TCgrade = TCgrade;
    }

    public int getTCgrade() {
        return TCgrade;
    }

}
