package com.capgemini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.capgemini.bean.ProductBean;

public class ProductDAO {

	public int addProduct1(ProductBean pb)throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement pst=null;
		con=ProductDB.getConnection1();
		pst=con.prepareStatement("insert into product values(?,?,?,?,?)");
		pst.setInt(1,pb.getProductId());
		pst.setString(2,pb.getProductName());
		pst.setString(3,pb.getProductBrand());
		pst.setFloat(4,pb.getProductPrice());
		pst.setString(5,pb.getProductMaster());
		int n=pst.executeUpdate();
		return n;
	}


	public int updateProductName1(int productId,String productName) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement pst=null;
		con=ProductDB.getConnection1();
		pst=con.prepareStatement("update product set productName=? where productId=?");
		pst.setString(1,productName);
		pst.setInt(2,productId);
		int n=pst.executeUpdate();
		return n;
		
	}


	public int updateProductBrand1(int productId, String productBrand) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement pst=null;
		con=ProductDB.getConnection1();
		pst=con.prepareStatement("update product set productBrand=? where productId=?");
		pst.setString(1,productBrand);
		pst.setInt(2,productId);
		
		int n=pst.executeUpdate();
		return n;
	}


	public int updateProductPrice1(int productId, float productPrice) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement pst=null;
		con=ProductDB.getConnection1();
		pst=con.prepareStatement("update product set productPrice=? where productId=?");
		pst.setFloat(1,productPrice);
		pst.setInt(2,productId);
		
		int n=pst.executeUpdate();
		return n;
	}


	public int updateProductMaster1(int productId, String productMaster) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement pst=null;
		con=ProductDB.getConnection1();
		pst=con.prepareStatement("update product set productMaster=? where productId=?");
		
		pst.setString(1,productMaster);
		pst.setInt(2,productId);
		
		int n=pst.executeUpdate();
		return n;
	}
	public int deleteProduct1(int productId) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement pst=null;
		con=ProductDB.getConnection1();
		String sql="delete product where productId=?";
		pst=con.prepareStatement(sql);
		pst.setInt(1,productId);
		int n=pst.executeUpdate();
		return n;
	}

	public int searchProduct1(int productId) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		con=ProductDB.getConnection1();
		String sql="select * from product where productId=?";
		pst=con.prepareStatement(sql);
		pst.setInt(1,productId);
		rs=pst.executeQuery();
		System.out.println("PRODUCTID"+"\t"+"PRODUCTNAME"+"\t"+"PRODUCTBRAND"+"\t"+"PRODUCTPRICE"+"\t"+"PRODUCTMASTER");
		while(rs.next())
		{
		   System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getFloat(4)+"\t\t"+rs.getString(5));
		}
		con.close();
		return 1;
	}

	public int filterProduct1(String productBrand,float productPrice) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		con=ProductDB.getConnection1();
		String sql="select * from product where productBrand=? and productPrice=?";
		pst=con.prepareStatement(sql);
		pst.setString(1,productBrand);
		pst.setFloat(2,productPrice);
		rs=pst.executeQuery();
		System.out.println("PRODUCTID"+"\t"+"PRODUCTNAME"+"\t"+"PRODUCTBRAND"+"\t"+"PRODUCTPRICE"+"\t"+"PRODUCTMASTER");
		while(rs.next())
		{
		   System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getFloat(4)+"\t\t"+rs.getString(5));
		}
		con.close();
		return 1;
	}

	public int addProductMaster1(int productId,String productMaster) throws ClassNotFoundException, SQLException
	{
		Connection con=null;
		Statement st=null;
		con=ProductDB.getConnection1();
		PreparedStatement pst=null;
		con=ProductDB.getConnection1();
		pst=con.prepareStatement("update product set productmaster=? where productId=?");
		pst.setString(1,productMaster);
		pst.setInt(2,productId);
		int n=pst.executeUpdate();
		return n;
	}


}
