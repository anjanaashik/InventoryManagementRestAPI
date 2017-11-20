package org.anjana.inventorymanagement.masters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StocksController {

 @Autowired
 private StocksService stockservice;

   //Get All Stocks Details
	@RequestMapping("/Stocks")
	public List<StockDet> getAllStocks(){
		return stockservice.getAllStocks();
	}
	
	//Get StockDetails by giving product sku
	
	@RequestMapping("/Stocks/{ProductSlno}")
	public StockDet getStock(@PathVariable int ProductSlno){
		return stockservice.getStock(ProductSlno);
	}
	
	
}
