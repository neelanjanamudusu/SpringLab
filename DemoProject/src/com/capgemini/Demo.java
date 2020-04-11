package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Demo extends HttpServlet {
public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
	PrintWriter pw=response.getWriter();
	String Uname=request.getParameter("user");
	String Pass=request.getParameter("pwd");
	try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","neelu","neeluramya");
	PreparedStatement pst=con.prepareStatement("select *from logindemo");
	ResultSet r=pst.executeQuery();
	while(!r.next()){
	if(Uname.equals("neelu")&&Pass.equals("neelu123")){
		pw.println("login is successful");
	}
	else{
		pw.println("login is failed");
	}
	}
	con.close();
	}
	catch(Exception e){
		System.out.println("exception");
	}
	
}
}
