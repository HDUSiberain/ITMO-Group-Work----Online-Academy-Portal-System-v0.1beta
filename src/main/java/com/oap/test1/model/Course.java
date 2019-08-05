package com.oap.test1.model;

public class Course {
    private String CID;
    private String Cname;
    private int Ccredit;

    public void setCcredit(int ccredit) {
        Ccredit = ccredit;
    }

    public int getCcredit() {
        return Ccredit;
    }

    public void setCID(String CID) {
        this.CID = CID;
    }

    public String getCID() {
        return CID;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public String getCname() {
        return Cname;
    }

}
