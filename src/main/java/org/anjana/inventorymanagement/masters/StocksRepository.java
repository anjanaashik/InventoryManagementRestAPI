package org.anjana.inventorymanagement.masters;

import org.springframework.data.repository.CrudRepository;

public interface StocksRepository extends CrudRepository<StockDet,Integer>{

	//public List<StockDet> findByProductSlno(int ProductSlno);

}
