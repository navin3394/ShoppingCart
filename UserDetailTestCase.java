package com.niit.ShoppingCartBackEndProject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ShoppingCartDAO.UserDetailDAO;
import com.niit.ShoppingCartModel.UserDetail;

public class UserDetailTestCase {
	
	@Autowired
	UserDetailDAO userDetailDAO;
	@Autowired
	UserDetail UserDetail;
	AnnotationConfigApplicationContext context;

	@Before
	@Test
	public void init(){
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
	userDetailDAO=(UserDetailDAO)context.getBean("userDetailDAO");
	UserDetail=(UserDetail)context.getBean("UserDetail");
		
	}
	
	@Test
	public void addUserDetailTestCase()
	{
		UserDetail.setId("us_003");
		UserDetail.setName("ram");
		UserDetail.setEmail("www.gmail.com");
		UserDetail.setPhoneno("9876512340");
		UserDetail.setAddress("Banglore");
		
		assertEquals("addUserDetailTestCase",userDetailDAO.save(UserDetail),true);
		
	}

 @Test
 public void deleteUserDetailTestCase(){
	 UserDetail.setId("us_001");
	 assertEquals("deleteUserDetailTestCase",userDetailDAO.delete(UserDetail),false);
	 
 }
 
 @Test
 public void listUserDetailTestCase(){
	 assertEquals("listUserDetailTestCase",userDetailDAO.list().size(),1);
 }
 

}
