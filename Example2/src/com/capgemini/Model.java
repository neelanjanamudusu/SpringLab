package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Model extends HttpServlet {
public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
	PrintWriter pw=response.getWriter();
	String Uname=request.getParameter("user");
	String Pass=request.getParameter("pwd");
	if(Uname.equals("neelu")&&Pass.equals("neelu123")){
		pw.println("login is successful");
	}
	else{
		pw.println("login is failed");
	}
}
}
