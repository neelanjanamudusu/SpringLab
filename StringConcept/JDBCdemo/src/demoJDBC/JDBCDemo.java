package demoJDBC;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","neelu","neeluramya");
		/*Statement s=c.createStatement();
		boolean b=s.execute("create table pretty(empid number(3),expname varchar2(20))");
		System.out.println("table is created");
		c.close();*/
		
		PreparedStatement s=c.prepareStatement("delete from pretty where empid=?");
		s.setInt(1, 36);
		int n=s.executeUpdate();
		System.out.println(n+"record updated");
		c.close();
		
		/*PreparedStatement s=c.prepareStatement("select *from pretty");
		ResultSet r=s.executeQuery();
		while(r.next()) {
			System.out.println(r.getInt(1)+" "+r.getString(2));
		}*/
		
		/*PreparedStatement s=c.prepareStatement("update pretty set empid=? where expname=?");
		s.setInt(1, 36);
		s.setString(2,"anurag");
		int n=s.executeUpdate();
		System.out.println(n+"record updated");
		c.close();*/
		
		/*PreparedStatement s=c.prepareStatement("insert into pretty values(?,?)");
		s.setInt(1, 10);
		s.setString(2,"anurag");
		int n=s.executeUpdate();
		System.out.println(n+"values are inserted");
		c.close();*/
}}