package com.jbk.daoIMPL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jbk.dao.CategoryDao;
import com.jbk.entity.Category;

@Component
public class CategoryDaoIMPL implements CategoryDao
{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean saveCategory(Category category) 
	{
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(category);
		transaction.commit();
		
		return true;
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

//	public static void main(String[] args) 
//	{
//		CategoryDaoIMPL v = new CategoryDaoIMPL();
//		Category category = new Category(44, "engine part", "4 wheeler part", 300, 13, 101);
//	boolean b=	v.saveCategory(category);
//		System.out.println(b);
//	}
}
