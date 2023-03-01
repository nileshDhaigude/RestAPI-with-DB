package com.jbk.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jbk.entity.Product;

@Component
public interface ProductService
{

	public boolean saveProduct(Product product);

	public Product getProductById(String productId);

	public List<Product> getAllProducts();

	public Product getProductByname(String ProductName);

	public boolean deleteProduct(String productid);

	public boolean updateProduct(Product product);

	public List<Product> sortProductByid_ASC();

	public List<Product> sortProductByName_DESC();

	public List<Product> getMaxPriceProducts();

	public double sumOfProductPrice();

	public long getTotalCountOfProducts();

}
