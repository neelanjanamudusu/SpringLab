package com.capgemini.service;

import java.sql.SQLException;

import com.capgemini.bean.ProductBean;
import com.capgemini.dao.ProductDAO;

public class ProductService {

	public int addProduct(int productId, String productName, String productBrand, float productPrice, String productMaster) {
		ProductDAO pd=new ProductDAO();
		ProductBean pb=new ProductBean();
		pb.setProductId(productId);
		pb.setProductName(productName);
		pb.setProductBrand(productBrand);
		pb.setProductPrice(productPrice);
		int n=0;
		try 
		{
			n=pd.addProduct1(pb);
			return n;
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			
			e.printStackTrace();
		}
		return 0;	
	}

	public int updateProductName(int productId,String productName) throws ClassNotFoundException, SQLException {
		ProductDAO pd=new ProductDAO();
		ProductBean pb=new ProductBean();
		int n=0;
		n=pd.updateProductName1(productId,productName);
		return n;
		
	}



	public int updateProductBrand(int productId, String productBrand) throws ClassNotFoundException, SQLException {
		ProductDAO pd=new ProductDAO();
		ProductBean pb=new ProductBean();
		int n=0;
		n=pd.updateProductBrand1(productId,productBrand);
		return n;
		
	}



	public int updateProductPrice(int productId, float productPrice) throws ClassNotFoundException, SQLException {
		ProductDAO pd=new ProductDAO();
		ProductBean pb=new ProductBean();
		int n=0;
		n=pd.updateProductPrice1(productId,productPrice);
		return n;
		
	}



	public int updateProductMaster(int productId, String productMaster) throws ClassNotFoundException, SQLException {
		ProductDAO pd=new ProductDAO();
		ProductBean pb=new ProductBean();
		int n=0;
		n=pd.updateProductMaster1(productId,productMaster);
		return n;
		
	}
	


	public int deleteProduct(int productId) throws ClassNotFoundException, SQLException {
		ProductDAO pd=new ProductDAO();
		ProductBean pb=new ProductBean();
		int n=0;
		n=pd.deleteProduct1(productId);
		return n;
	}

	public int searchProduct(int productId) throws ClassNotFoundException, SQLException {
		ProductDAO pd=new ProductDAO();
		ProductBean pb=new ProductBean();
		int n=0;
		n=pd.searchProduct1(productId);
		return n;
	}

	public int filterProduct(String productBrand, float productPrice) throws ClassNotFoundException, SQLException {
		ProductDAO pd=new ProductDAO();
		ProductBean pb=new ProductBean();
		int n=0;
		n=pd.filterProduct1(productBrand,productPrice);
		return n;
	}

	public int addProductMaster(int productId, String productMaster) throws ClassNotFoundException, SQLException {
		ProductDAO pd=new ProductDAO();
		ProductBean pb=new ProductBean();
		int n=0;
		n=pd.addProductMaster1(productId,productMaster);
		return n;
	}

	
}
