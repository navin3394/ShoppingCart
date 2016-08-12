package com.niit.ShoppingCartDAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ShoppingCartModel.Category;
import com.niit.ShoppingCartModel.UserDetail;

@Repository
public class UserDetailDAOImpl implements UserDetailDAO {
@Autowired
private SessionFactory sessionFactory;

public UserDetailDAOImpl(SessionFactory sessionFactory){
	
this.sessionFactory=sessionFactory;

}
@Transactional
public boolean save(UserDetail userDetail){
	try {
		sessionFactory.getCurrentSession().save(userDetail);
		return true;
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
}
@Transactional
public boolean update(UserDetail userDetail){
	try {
		sessionFactory.getCurrentSession().update(userDetail);
		return true;
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
}
@Transactional
public boolean delete(UserDetail userDetail){
	try {
		sessionFactory.getCurrentSession().delete(userDetail);
		return true;
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
	}

public UserDetail get(String id){
	String hql="from userDetail where id="+"'"+id+"'";
	Query query=sessionFactory.getCurrentSession().createQuery(hql);
	List<UserDetail> list=query.list();
	if(list==null){
		return null;
	} else {
		return list.get(0);
	}
}

@Transactional
public List<UserDetail> list() {
String hql = "from Category";
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	return query.list();
}


	}

