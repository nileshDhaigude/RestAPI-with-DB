package com.jbk.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jbk.daoIMPL.ProductDaoIMPL;
import com.jbk.entity.Product;
import com.jbk.service.ProductService;

@Component
public class ProductServiceIMPL implements ProductService
{

	@ Autowired
	ProductDaoIMPL productDaoIMPL;
	
	@Override
	public boolean saveProduct(Product product)
	{
		return productDaoIMPL.saveProduct(product);
	}

	@Override
	public Product getProductById(String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductByname(String ProductName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteProduct(String productid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> sortProductByid_ASC() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> sortProductByName_DESC() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getMaxPriceProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double sumOfProductPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getTotalCountOfProducts() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
