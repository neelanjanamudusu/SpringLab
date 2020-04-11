package com.test.MavenDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Appli 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World" );
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
       Student p=(Student) context.getBean("Studentbean");
       System.out.println(p.toString());
       //p.display();
       
    }
}
