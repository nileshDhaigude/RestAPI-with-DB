package com.jbk.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Product
{
	@Id
	private String productId;
	
	private String productName;

	@OneToMany(targetEntity = Supplier.class,cascade = CascadeType.ALL,orphanRemoval =true)
	@JoinColumn(name = "productId",referencedColumnName = "productId")
	private List<Supplier> supplier;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "categoryId")
	private Category category;
	
	private long productQty;
	
	private double productPrice;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productId, String productName, List<Supplier> supplier, Category category, long productQty,
			double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.supplier = supplier;
		this.category = category;
		this.productQty = productQty;
		this.productPrice = productPrice;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<Supplier> getSupplierId() {
		return supplier;
	}

	public void setSupplierId(List<Supplier> supplier) {
		this.supplier = supplier;
	}

	public Category getCategoryId() {
		return category;
	}

	public void setCategoryId(Category category) {
		this.category = category;
	}

	public long getProductQty() {
		return productQty;
	}

	public void setProductQty(long productQty) {
		this.productQty = productQty;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", supplier=" + supplier
				+ ", category=" + category + ", productQty=" + productQty + ", productPrice=" + productPrice + "]";
	}	
}
