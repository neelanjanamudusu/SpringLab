package demoJDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoJDBC1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","neelu","neeluramya");
		CallableStatement s=c.prepareCall("{call hi(?,?)}");
		s.setInt(1, 101);
		s.setString(2, "neelu");
		s.execute();
		System.out.println("success");
	}}
