INSERT INTO Users(UID, Uname, Usex, Uidentity) VALUES ("17051111","CHI.CHEN","male","student");
INSERT INTO Users(UID, Uname, Usex, Uidentity) VALUES ("17051106", "ZHANG YU","female","student");
INSERT INTO Users(UID, Uname, Usex, Uidentity) VALUES ("18051704","HUANG.YING","female","student");
INSERT INTO Users(UID, Uname, Usex, Uidentity) VALUES ("18052002", "HE.JIA XIN","female","student");
INSERT INTO Users(UID, Uname, Usex, Uidentity) VALUES("66666","HUANG sir","male","teacher");
INSERT INTO Users(UID, Uname, Usex, Uidentity) VALUES("88888", "LIU","female","teacher");

INSERT INTO Academy(AID, Aname) VALUES ("1","College of Computer");

INSERT INTO Profession(PID, Pname, AID) VALUES ("1","Computer Science", "1");
INSERT INTO Profession(PID, Pname, AID) VALUES ("2","Software Engineering","1");

INSERT INTO Student(SID, Sclass, Sprofession) VALUES ("17051111","17052311","1");
INSERT INTO Student(SID, Sclass, Sprofession) VALUES ("17051106","17052311","1");
INSERT INTO Student(SID, Sclass, Sprofession) VALUES ("18051704","18050517","1");
INSERT INTO Student(SID, Sclass, Sprofession) VALUES ("18052002","18050520","1");

INSERT INTO Teacher(TID, Tacademy) VALUES ("88888", "1");
INSERT INTO Teacher(TID, Tacademy) VALUES ("66666", "1");

INSERT INTO Course(CID, Cname, Ccredit) VALUES ("1", "Computer science basics", 2);
INSERT INTO Course(CID, Cname, Ccredit) VALUES ("2", "Software engineering principle", 3);
INSERT INTO Course(CID, Cname, Ccredit) VALUES ("3", "Programing", 3);
INSERT INTO Course(CID, Cname, Ccredit) VALUES ("4", "Cloud computing", 3);
INSERT INTO Course(CID, Cname, Ccredit) VALUES ("5", "advanced mathematics", 5);
INSERT INTO Course(CID, Cname, Ccredit) VALUES ("6", "Principle of Compiler", 3);
INSERT INTO Course(CID, Cname, Ccredit) VALUES ("7", "Linear algebra", 2);
INSERT INTO Course(CID, Cname, Ccredit) VALUES ("8", "college physics", 3);

INSERT INTO Course_class(CCID, CID, TID) VALUES ("1", "1", "88888");
INSERT INTO Course_class(CCID, CID, TID) VALUES ("2", "1", "88888");
INSERT INTO Course_class(CCID, CID, TID) VALUES ("3", "6", "88888");
INSERT INTO Course_class(CCID, CID, TID) VALUES ("4", "6", "66666");
INSERT INTO Course_class(CCID, CID, TID) VALUES ("5", "8", "66666");
INSERT INTO Course_class(CCID, CID, TID) VALUES ("6", "7", "66666");
INSERT INTO Course_class(CCID, CID, TID) VALUES ("7", "3", "88888");
INSERT INTO Course_class(CCID, CID, TID) VALUES ("8", "2", "88888");
INSERT INTO Course_class(CCID, CID, TID) VALUES ("9", "5", "66666");

INSERT INTO Student_choose_class(SID, CCID) VALUES ("17051111","1");
UPDATE Course_class SET CCnum = CCnum + 1 WHERE CCID = "1"
INSERT INTO Student_choose_class(SID, CCID) VALUES ("17051111","6");
UPDATE Course_class SET CCnum = CCnum + 1 WHERE CCID = "6"