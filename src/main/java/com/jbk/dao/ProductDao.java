package com.jbk.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jbk.entity.Product;


@Component
public interface ProductDao
{
	public boolean saveProduct(Product product);

	public Product getProductById(int productd);

	public List<Product> getAllproducts();

	public Product getProductByname(String productName);

}
