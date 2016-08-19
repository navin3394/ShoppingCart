package com.niit.ShoppingCartBackEndProject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ShoppingCartDAO.CategoryDAO;
import com.niit.ShoppingCartModel.Category;


public class CategoryTestCase {
	
	@Autowired
	CategoryDAO categoryDAO;
	@Autowired
	Category category;
	AnnotationConfigApplicationContext context;

	@Before
	@Test
	public void init(){
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
	categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	category=(Category)context.getBean("category");
		
	}
	
	@Test
	public void addCategoryTestCase()
	{
		category.setId("106");
		category.setName("samsung");
		category.setDesc("connect pepole");
		assertEquals("addcategoryTestCase",categoryDAO.save(category),true);
		
	}

 @Test
 public void deleteCategoryTestCase(){
	 category.setId("101");
	 assertEquals("deletecategoryTestCase",categoryDAO.delete(category),false);
	 
 }
 
 @Test
 public void listcategoryTestCase(){
	 assertEquals("listCategoryTestCase",categoryDAO.list().size(),1);
 }
 

}
