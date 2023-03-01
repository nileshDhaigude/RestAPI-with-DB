package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Product;
import com.jbk.serviceIMPL.ProductServiceIMPL;

@RestController
public class ProductController 
{

	@Autowired
	ProductServiceIMPL productServiceIMPL;
	
	@PostMapping("save-product")
	public boolean saveProduct(@RequestBody Product product) 
	{	
		return productServiceIMPL.saveProduct(product);
	}
}
