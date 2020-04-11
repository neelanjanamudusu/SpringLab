package com.test.CVSR123;

public class Student {
int studentid;
String studentname;
String studentaddress;
String collegename;
Double phonenumber;
/*public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public String getStudentaddress() {
	return studentaddress;
}
public void setStudentaddress(String studentaddress) {
	this.studentaddress = studentaddress;
}
public String getCollegename() {
	return collegename;
}
public void setCollegename(String collegename) {
	this.collegename = collegename;
}
public Double getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(Double phonenumber) {
	this.phonenumber = phonenumber;
}*/

public void display(){
	System.out.println(studentid+" "+studentname+" "+studentaddress+" "+collegename+" "+phonenumber);
}
public Student(int studentid, String studentname, String studentaddress, String collegename, Double phonenumber) {
	super();
	this.studentid = studentid;
	this.studentname = studentname;
	this.studentaddress = studentaddress;
	this.collegename = collegename;
	this.phonenumber = phonenumber;
}
}
