package com.jbk.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jbk.entity.Category;

@Component
public interface CategoryDao
{

public boolean saveCategory(Category category);
	
	public Category getCategoryById(int categoryId);
	
	public List<Category> getAllCategories();
	
	public Category getCategoryByname(String categoryName);
}
