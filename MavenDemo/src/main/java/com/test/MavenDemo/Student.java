package com.test.MavenDemo;

public class Student {
private int id;
private String names;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNames() {
	return names;
}
public void setName(String names) {
	this.names = names;
}
public void display(){
	System.out.println(id+" "+names);
}
@Override
public String toString() {
	return "Student [id=" + id + ", names=" + names + "]";
}

}
