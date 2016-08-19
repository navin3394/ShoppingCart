package com.niit.ShoppingCartBackEndProject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ShoppingCartDAO.SupplierDAO;
import com.niit.ShoppingCartModel.Supplier;

public class SupplierTestCase {

	@Autowired
	SupplierDAO supplierDAO;
	@Autowired
	Supplier supplier;
	
	AnnotationConfigApplicationContext context;
	@Before
	@Test
	public void init(){
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		supplierDAO=(SupplierDAO) context.getBean("supplierDAO");
		supplier=(Supplier) context.getBean("supplier");
	}
	
	public void addSupplierTestCase()
	{
		
		supplier.setId("511");
		supplier.setName("ktech");
		supplier.setAddress("goa");
		assertEquals("addSupplierTestCase",supplierDAO.save(supplier),true);
	}
}
