package com.jbk.serviceIMPL;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jbk.entity.Supplier;
import com.jbk.service.SupplierService;

@Component
public class SupplierServiceIMPL implements SupplierService
{

	@Override
	public boolean saveSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Supplier getSupplierById(int supplierId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Supplier> getAllSuppliers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Supplier getSupplierByname(String supplierName) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
