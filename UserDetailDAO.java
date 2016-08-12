package com.niit.ShoppingCartDAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.ShoppingCartModel.UserDetail;

@Repository
public interface UserDetailDAO {
	public boolean save(UserDetail UserDetail);
	
	public boolean update(UserDetail UserDetail);
	
	public boolean delete(UserDetail UserDetail);
	
	public UserDetail get(String id);
	
	public List<UserDetail>list();

}
