package com.capgemini.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.capgemini.Beans.BookBean;

public class BookDAO {
public int addBook1(BookBean bookBean) {
	Connection c=null;
	PreparedStatement p=null;
	try {
		c=BookDB.getConnection1();
		p=c.prepareStatement("insert into book values(?,?,?,?)");
		p.setInt(1, bookBean.getBookId());
		p.setString(2,bookBean.getTitle());
		p.setFloat(3, bookBean.getPrice());
		p.setString(4, bookBean.getGrade());
		int updateCount=p.executeUpdate();

		return updateCount;
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return 0;
}
}
