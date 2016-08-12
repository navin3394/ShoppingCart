package com.niit.ShoppingCartDAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.ShoppingCartModel.Supplier;

@Repository
public interface SupplierDAO {
	public boolean save(Supplier Supplier);
	
	public boolean update(Supplier Supplier);
	
	public boolean delete(Supplier Supplier);
	
	public Supplier get(String id);
	
	public List<Supplier>list();

}
