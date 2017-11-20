package org.anjana.inventorymanagement.masters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

	@Autowired
	private ProductsService prodservice;

	// Get All Product Details
	@RequestMapping("/Products")
	public List<Products> getAllProducts() {
		return prodservice.getAllProducts();
	}

	// Get Single Product Details By giving ProductID (here,productslno)
	@RequestMapping("/Products/{productid}")
	public Products getProduct(@PathVariable int productid) {
		return prodservice.getProduct(productid);
	}


	// Create/ADD new Product Details
	@RequestMapping(method = RequestMethod.POST, value = "/Products")
	public void addProduct(@RequestBody Products product) {
		prodservice.addProduct(product);
	}

	// UPDATE Product details
	@RequestMapping(method = RequestMethod.PUT, value = "/Products/{productid}")
	public void updateProduct(@RequestBody Products product, @PathVariable int productid) {
		prodservice.updateProduct(product, productid);
	}

	// DELETE Product Details
	@RequestMapping(method = RequestMethod.DELETE, value = "/Products/{productid}")
	public void deleteProduct(@PathVariable int productid) {
		prodservice.deleteProduct(productid);
	}

}
