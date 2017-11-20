package org.anjana.inventorymanagement.masters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {

	@Autowired
	private ProductsRepository productrepository;

	public List<Products> getAllProducts() {
		List<Products> products = new ArrayList<>();
		productrepository.findAll().forEach(products::add);
		return products;
	}

	public Products getProduct(int productid) {
		return productrepository.findOne(productid);
	}

	public void addProduct(Products product) {
		productrepository.save(product);
	}

	public void updateProduct(Products product, int productid) {
		productrepository.save(product);
	}

	public void deleteProduct(int productid) {
		productrepository.delete(productid);
	}

	

}
