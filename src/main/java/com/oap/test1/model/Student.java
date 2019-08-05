package com.oap.test1.model;

public class Student {
    private String SID;
    private String Sclass;
    private String Sprofession;

    public void setSclass(String sclass) {
        this.Sclass = sclass;
    }

    public String getSclass() {
        return Sclass;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getSID() {
        return SID;
    }

    public void setSprofession(String sprofession) {
        Sprofession = sprofession;
    }

    public String getSprofession() {
        return Sprofession;
    }

}
