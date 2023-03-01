package com.jbk.daoIMPL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jbk.dao.ProductDao;
import com.jbk.entity.Product;

@Component
public class ProductDaoIMPL implements ProductDao
{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean saveProduct(Product product)
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(product);
		transaction.commit();
		return true;
	}

	@Override
	public Product getProductById(int productd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllproducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductByname(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
