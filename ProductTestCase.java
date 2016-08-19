package com.niit.ShoppingCartBackEndProject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ShoppingCartDAO.ProductDAO;
import com.niit.ShoppingCartModel.Product;

public class ProductTestCase {
	
	@Autowired
	ProductDAO productDAO;
	@Autowired
	Product product;
	AnnotationConfigApplicationContext context;

	@Before
	@Test
	public void init(){
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
	productDAO=(ProductDAO)context.getBean("productDAO");
	product=(Product)context.getBean("product");
		
	}
	
	@Test
	public void addProductTestCase()
	{
		product.setId("prod_002");
		product.setName("samsung");
		product.setDesc("connect pepole");
		product.setPrice("12000");
		assertEquals("addProductTestCase",productDAO.save(product),true);
		
	}

 @Test
 public void deleteProductTestCase(){
	 product.setId("prod_001");
	 assertEquals("deleteProductTestCase",productDAO.delete(product),false);
	 
 }
 
 @Test
 public void listProductTestCase(){
	 assertEquals("listProductTestCase",productDAO.list().size(),1);
 }
 

}
