package com.capgemini.ui;

import java.util.Scanner;

import com.capgemini.Service.BookService;

public class BookUI {
public static void main(String[] args) {
	int bookId=0;
	String title="";
	float price=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the bookId");
	bookId=s.nextInt();
	System.out.println("enter title of book");
	title=s.next();
	System.out.println("enter the price of book");
	price=s.nextFloat();
	BookService bookService=new BookService();
	int updateCount=bookService.addBook(bookId,title,price);
	System.out.println(updateCount);
}
}

