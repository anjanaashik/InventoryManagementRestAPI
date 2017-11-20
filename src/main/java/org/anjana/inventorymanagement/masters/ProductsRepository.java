package org.anjana.inventorymanagement.masters;


import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends  CrudRepository<Products, Integer> {

	//public Products findByProductPurchaseSlno(int ProductPurchaseSlno);
	
}