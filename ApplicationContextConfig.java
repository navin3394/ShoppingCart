package com.niit.ShoppingCartConfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.ShoppingCartModel.Category;
import com.niit.ShoppingCartModel.Product;

@Configuration
@ComponentScan("com.niit.ShoppingCartConfig")
@EnableTransactionManagement

public class ApplicationContextConfig {
	@Bean(name= "dataSource" )
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
	dataSource.setDriverClassName("org.h2.Driver");
	dataSource.setUrl("jdbc:h2:tcp/localhost//~/test");
	dataSource.setUsername("sa");
	dataSource.setPassword("sa");
		return dataSource;
	}
	
	private Properties getHibernateProperties(){
		Properties properties=new Properties();
		properties.put("hibernate_show sql","true");
		properties.put("hibernate dialect","org.hibernate.dialect.H2Dialect");
		properties.put("hibernate.hbm2dd1,auto","update");
		return properties;
	}
    @Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource){
		LocalSessionFactoryBuilder sessionBuilder=new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.addAnnotatedClass(Category.class);
		sessionBuilder.addAnnotatedClass(Product.class);
		return sessionBuilder.buildSessionFactory();
	}
    @Autowired
  	@Bean(name="transactionManager")
  	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory){
    	HibernateTransactionManager transactionManager	=new HibernateTransactionManager(sessionFactory);
   return transactionManager;
    }
}
