package com.jbk.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.jbk.entity.Category;
import com.jbk.service.CategoryService;

@Component
public class CategoryServiseIMPL implements CategoryService 
{

	@Autowired
	@Lazy
	CategoryService categoryService;
	
	@Override
	public boolean saveCategory(Category category) 
	{	
		return categoryService.saveCategory(category);
	}

	@Override
	public Category getCategoryById(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category getCategoryByname(String categoryName) {
		// TODO Auto-generated method stub
		return null;
	}

}
