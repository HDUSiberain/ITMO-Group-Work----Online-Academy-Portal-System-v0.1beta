package com.oap.test1.model;

public class Users {

    private String UID;
    private String Uname;
    private String Upw;
    private String Usex;
    private String Uemail;
    private String Uidentity;

    public void setUID(String uId) {
        this.UID = uId;
    }

    public String getUID() {
        return UID;
    }

    public void setUname(String uname) {
        this.Uname = uname;
    }

    public String getUname() {
        return Uname;
    }

    public void setUemail(String uemail) {
        this.Uemail = uemail;
    }

    public String getUemail() {
        return Uemail;
    }

    public void setUidentity(String uidentity) {
        this.Uidentity = uidentity;
    }

    public String getUidentity() {
        return Uidentity;
    }

    public void setUpw(String upw) {
        this.Upw = upw;
    }

    public String getUpw() {
        return Upw;
    }

    public void setUsex(String usex) {
        this.Usex = usex;
    }

    public String getUsex() {
        return Usex;
    }
}
