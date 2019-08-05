package com.oap.test1.model;

public class Profession {
    private String PID;
    private String Pname;
    private String AID;

    public void setAID(String AID) {
        this.AID = AID;
    }

    public String getAID() {
        return AID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }

    public String getPID() {
        return PID;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public String getPname() {
        return Pname;
    }
}
