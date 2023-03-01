package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Category;
import com.jbk.entity.Product;
import com.jbk.serviceIMPL.CategoryServiseIMPL;
import com.jbk.serviceIMPL.ProductServiceIMPL;

@RestController
public class CategoryController
{

	@Autowired
	@Lazy
	CategoryServiseIMPL categoryServiceImpl;
	
	@PostMapping("save-category")
	public boolean saveCategory(@RequestBody Category category) 
	{	
		return categoryServiceImpl.saveCategory(category);
	}
}
