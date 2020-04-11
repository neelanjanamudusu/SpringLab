package com.capgemini.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.capgemini.service.ProductService;

public class ProductUI {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	int productId=0;
	String productName="";
	String productBrand="";
	float productPrice=0;
	String productMaster="";
	Scanner sc=new Scanner(System.in);
    ProductService ps=new ProductService();
    while(true)
    {
    System.out.println("1.Add Product 2.Update Product 3.Delete Product 4.Search Product 5.Filter Product 6.Add Product Master 7.Exit");
    System.out.println("enter choice : ");
    int ch=sc.nextInt();
    switch(ch)
    {
    case 1:
    	System.out.println("Adding Product");
    	System.out.println("enter id : ");
    	productId=sc.nextInt();
       	System.out.println("enter product name : ");
    	productName=sc.next();
    	System.out.println("enter brand : ");
        productBrand=sc.next();
        System.out.println("enter price : ");
        productPrice=sc.nextFloat();
    	int n=ps.addProduct(productId,productName,productBrand,productPrice,productMaster);
    	System.out.println(n);
    	break;
    case 2:
    	System.out.println("1.Update ProductName 2.Update ProductBrand 3.Update ProductPrice 4.Update ProductMaster");
    	System.out.println("enter update option : ");
    	int opt=sc.nextInt();
        switch(opt)
        {
        case 1:
        	System.out.println("Updating ProductName");
        	System.out.println("enter id : ");
        	productId=sc.nextInt();
        	System.out.println("enter product name : ");
        	productName=sc.next();
        	int p2=ps.updateProductName(productId,productName);
    		System.out.println(p2);
        	break;
        case 2:
        	System.out.println("Updating ProductBrand");
        	System.out.println("enter id : ");
        	productId=sc.nextInt();
        	System.out.println("enter brand : ");
            productBrand=sc.next();
            int p3=ps.updateProductBrand(productId,productBrand);
    		System.out.println(p3);
        	break;
        case 3:
        	System.out.println("Updating ProductPrice");
        	System.out.println("enter id : ");
        	productId=sc.nextInt();
        	System.out.println("enter price : ");
            productPrice=sc.nextFloat();
            int p4=ps.updateProductPrice(productId,productPrice);
            System.out.println(p4);
            break;
        case 4:
        	System.out.println("Updating ProductMaster");
        	System.out.println("enter id : ");
        	productId=sc.nextInt();
         	System.out.println("enter product master : ");
        	productMaster=sc.next();
        	int p5=ps.updateProductMaster(productId,productMaster);
            System.out.println(p5);
            break;
        }
        break;
    case 3:
    	System.out.println("Deleting Product");
    	System.out.println("enter id : ");
    	productId=sc.nextInt();
    	int n2=ps.deleteProduct(productId);
    	System.out.println(n2);
    	break;
    case 4:
    	System.out.println("Searching Product");
    	System.out.println("enter id : ");
    	productId=sc.nextInt();
    	int n3=ps.searchProduct(productId);
    	System.out.println(n3);
    	break;
    case 5:
    	System.out.println("Filtering Product based on brand and price");
    	System.out.println("enter brand : ");
        productBrand=sc.next();
        System.out.println("enter price : ");
        productPrice=sc.nextFloat();
    	int n4=ps.filterProduct(productBrand,productPrice);
    	System.out.println(n4);
    	break;
    case 6:
    	System.out.println("Adding Product Master"); 
    	System.out.println("enter id : ");
    	productId=sc.nextInt();
    	System.out.println("enter product master");
        productMaster=sc.next();
    	int n5=ps.addProductMaster(productId,productMaster);
    	System.out.println(n5);
    	break;
    case 7:
    	System.out.println("exit");
    	System.exit(0);
    default:System.out.println("invalid choice");
    }
    }
}
}
