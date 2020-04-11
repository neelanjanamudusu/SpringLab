package com.capgemini.emp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestEmployee e1=new TestEmployee("suresh","Hyderabad",30000);
TestEmployee e2=new TestEmployee("uresh","Hyderabad",31000);
TestEmployee e3=new TestEmployee("resh","Hyderabad",32000);
HashMap<Integer,TestEmployee> h=new HashMap<Integer,TestEmployee>();
h.put(1,e1);
h.put(2,e2);
h.put(3,e3);
System.out.println("Employee Application Details");
System.out.println("1. Read Employee Details");
System.out.println("2. Delete Record Details");
System.out.println("3. Fetching all Details");
System.out.println("4. Adding the records of employee");
System.out.println("5. updating the records of employee");
Scanner s=new Scanner(System.in);
System.out.println("select one option");
int option=s.nextInt();

switch(option) {
case 1:
	System.out.println("Read Employee Details");
	int eid=s.nextInt();
	TestEmployee result=h.get(eid);
	System.out.println(result);
	break;
case 2:
	System.out.println("Delete Record Details");
	int eid1=s.nextInt();
	TestEmployee result1=h.remove(eid1);
	System.out.println(h);
	break;
case 3:
	System.out.println("Fetching all Details");
	Set set=h.entrySet();
	Iterator i=set.iterator();
	while(i.hasNext()) {
		Entry emp=(Entry) i.next();
	System.out.println(emp.getKey()+" "+emp.getValue());
	}
	break;
case 4:
	System.out.println("Adding the records of Employee");
	int key=s.nextInt();
	System.out.println("enter the employee name");
	String name=s.next();
	System.out.println("enter the employee place");
	String place=s.next();
	System.out.println("enter the employee salary");
	int sal=s.nextInt();
	TestEmployee result2=new TestEmployee(name,place,sal) ;
	h.put(key, result2);
	System.out.println("after adding record");
	System.out.println(h);
	break;
case 5:
	System.out.println("updating the records of employee");
	int ei=s.nextInt();
	Object result3=h.get(ei);
	TestEmployee emp=(TestEmployee) result3 ;
	System.out.println("employee old salary is"+emp.getEmpsal());
	System.out.println("enter salary to update");
	emp.setEmpsal(10000);
	System.out.println("after update employee salary is"+emp);
break;	
default: 
		System.out.println("exit from option");
}	}}
