package com.test.CVSR123;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
Student s=(Student)context.getBean("studentbean");
s.display();
	}

}
