/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019/7/30 13:59:49                           */
/*==============================================================*/

CREATE DATABASE Test1;

drop table if exists Users;

drop table if exists Student;

drop table if exists Teacher;

drop table if exists Course;

drop table if exists Course_class;

drop table if exists Student_choose_class;

drop table if exists Profession;

drop table if exists Academy;

drop table if exists File_upload;

drop table if exists Discussion;

drop table if exists Discussion_with;

drop table if exists Homework;

drop table if exists HomeWork_submit;



/*==============================================================*/
/* Table: Users                                                */
/*==============================================================*/
create table Users
(
    UID                 char(8) not null,
    Uname               varchar(16) not null ,
    Upw                 char(16)not null default '123456',
    Usex                varchar(6) null default 'male',
    Uemail              varchar(64) null,
    Uidentity           char(7) not null default 'student',/*include teacher, student and admin*/
    primary key (UID)
);

/*==============================================================*/
/* Table: Student                                               */
/*==============================================================*/
create table Student
(
    SID                 char(8) not null unique,
    Sclass              char(8) not null,
    Sprofession         char(3) null
);

/*==============================================================*/
/* Table: Teacher                                               */
/*==============================================================*/
create table Teacher
(
    TID                 char(8) not null unique,
    Tacademy            char(3) null
);


/*==============================================================*/
/* Table: Course                                                */
/*==============================================================*/
create table Course
(
    CID                 char(16) not null,
    Cname               varchar(64) not null,
    Ccredit             int DEFAULT 2,
    primary key (CID)
);

/*==============================================================*/
/* Table: Course_Class                                          */
/*==============================================================*/
create table Course_class
(
    CCID                char(10) not null,
    CID                 char(16) not null,
    TID                 char(8) not null,
    CCnum               int default 0,
    CCnum_MAX           int default 40,
    primary key (CCID)
);

/*==============================================================*/
/* Table: Student_choose_class                                  */
/*==============================================================*/
create table Student_choose_class
(
    SCCID               int AUTO_INCREMENT,
    SID                 char(8) not null,
    CCID                char(10) not null,
    SCgrade             int default -1,
    TCgrade             int default -1,
    primary key (SCCID)
);

/*==============================================================*/
/* Table: Profession                                            */
/*==============================================================*/
create table Profession
(
    PID                 char(3) not null,
    Pname               varchar(32) not null,
    AID                 char(3) not null,
    primary key (PID)
);

/*==============================================================*/
/* Table: Academy                                               */
/*==============================================================*/
create table Academy
(
    AID                 char(3) not null,
    Aname               varchar(32) not null,
    primary key (AID)
);

/*==============================================================*/
/* Table: File                                                  */
/*==============================================================*/
create table File_upload
(
    FID                 int AUTO_INCREMENT,
    Fname               varchar(32) not null,
    F_up_date           timestamp default current_timestamp,
    F_do_times          int default 0,
    Furl                varchar(100),
    /*
        To show the file which has been upload that who can see ,
        0 means everyone in course class can see ,
        1 means only teacher in course class can see,
        2 means only admin can see etc...
    */
    Feff                int default 0 ,
    UID                 char(8) null , /*To show the person who upload the file*/
    CCID                char(10) null,/*To show the file are in which Course class*/
    PRIMARY KEY (FID)
);

/*==============================================================*/
/* Table: Discussion                                            */
/*==============================================================*/
create table Discussion
(
    DID                 int AUTO_INCREMENT,
    UID                 char(8) null, /*To show the person who start the discussion*/
    CCID                char(10) not null, /*To show the discussion start in which course class*/
    Dtext               text,    /*To show what did the person want to say*/
    Ddate               timestamp default current_timestamp,
    PRIMARY KEY (DID)
);

/*==============================================================*/
/* Table: Discussion_with                                       */
/*==============================================================*/
create table Discussion_with
(
    DWID                int AUTO_INCREMENT,
    DID                 int not null,/*To show which problem the are discussion with*/
    UID                 char(8) null, /*The same as the last one*/
    DWtext              text,   /*The same as the last one*/
    DWDate              timestamp default current_timestamp,
    PRIMARY KEY (DWID)
);

/*==============================================================*/
/* Table: Homework                                              */
/*==============================================================*/
create table Homework
(
    HID                 int AUTO_INCREMENT,
    Hname               varchar(64) not null,
    Htext               text null,
    Hdeadline           timestamp null default '2038-01-19 03:14:06',
    CCID                char(10) not null, /*To show which the Homework are in which course class*/
    FID                 int null, /*When teacher Upload Home work, He may upload a file to show the HomeWork*/
    primary key (HID)
);

/*==============================================================*/
/* Table: Homework_submit                                       */
/*==============================================================*/
create table HomeWork_submit
(
    HSID                char(18) not null,
    HID                 int not null,/*To show which HomeWork has been upload*/
    SID                 char(8)  not null,/*To show the student who submit his homework*/
    HSText              text null,
    FID                 int null,/*To submit their homework*/
    Hgrade              int default -1,
    primary key (HSID)
);

alter table Student add index Student_index(SID);

alter table Teacher add index Teacher_index(TID);

alter table Student add constraint FK_Student_belong foreign key (SID)
    references Users (UID) on delete cascade on update cascade;

alter table Student add constraint FK_Student_choose foreign key (Sprofession)
    references Profession(PID) on update cascade on delete set null;

alter table Teacher add constraint FK_Teacher_belong foreign key (TID)
    references Users (UID) on delete cascade on update cascade;

alter table Teacher add constraint FK_Teacher_choose foreign key (Tacademy)
    references Academy (AID) on update cascade on delete set null;

alter table Course_class add constraint FK_Course_class_course foreign key (CID)
    references Course (CID) on update cascade on delete cascade;

alter table Course_class add constraint FK_Course_class_teacher foreign key (TID)
    references Teacher (TID) on update cascade on delete cascade;

alter table Student_choose_class add constraint FK_Student_choose_class_SID foreign key (SID)
    references Student (SID) on update cascade on delete cascade;

alter table Student_choose_class add constraint FK_Student_choose_class_CCID foreign key (CCID)
    references Course_class (CCID) on update cascade on delete cascade;

alter table Profession add constraint FK_Profession foreign key (AID)
    references Academy (AID) on delete cascade on update cascade;

alter table File_upload add constraint FK_File_upload_UID foreign key (UID)
    references Users (UID) on update cascade;

alter table File_upload add constraint FK_File_upload_CCID foreign key (CCID)
    references  Course_class (CCID) on update cascade;

alter table Discussion add constraint FK_Discussion_UID foreign key (UID)
    references Users (UID) on update cascade on delete set null;

alter table Discussion add constraint FK_Discussion_CCID foreign key (CCID)
    references Course_class (CCID) on update cascade on delete cascade;

alter table Discussion_with add constraint FK_Discussion_with_DID foreign key (DID)
    references Discussion (DID) on update cascade on delete cascade;

alter table Discussion_with add constraint FK_Discussion_with_UID foreign key (UID)
    references Users (UID) on update cascade on delete set null;

alter table Homework add constraint FK_Homework_CCID foreign key (CCID)
    references Course_class (CCID) on update cascade on delete cascade;

alter table Homework add constraint FK_Homework_FID foreign key (FID)
    references File_upload (FID) on update cascade on delete set null;

alter table HomeWork_submit add constraint FK_Homework_submit_HID foreign key (HID)
    references Homework (HID) on update cascade on delete cascade;

alter table HomeWork_submit add constraint  FK_Homework_submit_SID foreign key (SID)
    references Student (SID) on update cascade on delete cascade;

alter table HomeWork_submit add  constraint FK_Homework_submit_FID foreign key (FID)
    references File_upload (FID) on update cascade on delete set null;



/*
alter table Course_Class add constraint FK_Have foreign key (Course_id)
      references Course (Course_id) on delete restrict on update restrict;

alter table Course_Class add constraint FK_Teach foreign key (Tid)
      references Teacher (Tid) on delete restrict on update restrict;

alter table "Select" add constraint FK_Select foreign key (Sid)
      references Student (Sid) on delete restrict on update restrict;

alter table "Select" add constraint FK_Select2 foreign key (CCid)
      references Course_Class (CCid) on delete restrict on update restrict;
*/