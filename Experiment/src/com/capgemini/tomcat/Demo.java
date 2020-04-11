package com.capgemini.tomcat;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Demo extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse argl) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=argl.getWriter();
		pw.println("welcome");
		
	}
	
}
