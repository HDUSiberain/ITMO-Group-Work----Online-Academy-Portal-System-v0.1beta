package com.oap.test1.model;

import java.util.Date;

public class File_upload {
    private int FID;
    private String Fname;
    private Date F_up_date;
    private int F_do_times;
    private String Furl;
    private int Feff;
    private String UID;
    private String CCID;

    public void setCCID(String CCID) {
        this.CCID = CCID;
    }

    public String getCCID() {
        return CCID;
    }

    public void setF_do_times(int f_do_times) {
        F_do_times = f_do_times;
    }

    public String getUID() {
        return UID;
    }

    public void setF_up_date(Date f_up_date) {
        F_up_date = f_up_date;
    }

    public Date getF_up_date() {
        return F_up_date;
    }

    public void setFeff(int feff) {
        Feff = feff;
    }

    public int getF_do_times() {
        return F_do_times;
    }

    public void setFID(int FID) {
        this.FID = FID;
    }

    public int getFeff() {
        return Feff;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public int getFID() {
        return FID;
    }

    public void setFurl(String furl) {
        Furl = furl;
    }

    public String getFname() {
        return Fname;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getFurl() {
        return Furl;
    }
}
