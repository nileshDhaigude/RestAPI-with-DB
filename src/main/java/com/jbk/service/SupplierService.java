package com.jbk.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jbk.entity.Supplier;

@Component
public interface SupplierService 
{

	public boolean saveSupplier(Supplier supplier);

	public Supplier getSupplierById(int supplierId);

	public List<Supplier> getAllSuppliers();

	public Supplier getSupplierByname(String supplierName);
}
