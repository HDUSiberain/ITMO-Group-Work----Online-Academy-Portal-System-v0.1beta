package com.oap.test1.model.outputModel;

public class StudentInfo {
    private String classID;
    private String studentID;
    private String name;
    private String mailbox;
    private String sex;

    public void setName(String name) {
        this.name = name;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public String getClassID() {
        return classID;
    }

    public String getMailbox() {
        return mailbox;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentInfo(String classID, String studentID, String name, String mailbox, String sex) {
        this.classID = classID;
        this.mailbox = mailbox;
        this.name = name;
        this.sex = sex;
        this.studentID = studentID;
    }
}
