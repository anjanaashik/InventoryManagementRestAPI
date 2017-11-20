package org.anjana.inventorymanagement.masters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StocksService {
	
	@Autowired
	private StocksRepository stocksrepository;

	public List<StockDet> getAllStocks() {
		List<StockDet> stockdet = new ArrayList<>();
		stocksrepository.findAll().forEach(stockdet::add);
		return stockdet;
		
	}

	public StockDet getStock(int ProductSlno) {
		return stocksrepository.findOne(ProductSlno);
		
	}

}
