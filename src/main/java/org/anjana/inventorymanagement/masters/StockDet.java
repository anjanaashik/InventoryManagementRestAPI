package org.anjana.inventorymanagement.masters;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class StockDet {
	
@Id
private int StockSlno;
private int ProductSlno;
private int StockQty;
private int BlockQty;
private Date StockEntDate;
private Date StockUpdDate;

StockDet(){
	
}

public StockDet(int stockSlno, int productSlno, int stockQty, int blockQty,
		Date stockEntDate, Date stockUpdDate) {
	super();
	StockSlno = stockSlno;
	ProductSlno = productSlno;
	StockQty = stockQty;
	BlockQty = blockQty;
	StockEntDate = stockEntDate;
	StockUpdDate = stockUpdDate;
}

public int getStockSlno() {
	return StockSlno;
}

public void setStockSlno(int stockSlno) {
	StockSlno = stockSlno;
}

public int getProductSlno() {
	return ProductSlno;
}

public void setProductSlno(int productSlno) {
	ProductSlno = productSlno;
}

public int getStockQty() {
	return StockQty;
}

public void setStockQty(int stockQty) {
	StockQty = stockQty;
}

public int getBlockQty() {
	return BlockQty;
}

public void setBlockQty(int blockQty) {
	BlockQty = blockQty;
}

public Date getStockEntDate() {
	return StockEntDate;
}

public void setStockEntDate(Date stockEntDate) {
	StockEntDate = stockEntDate;
}

public Date getStockUpdDate() {
	return StockUpdDate;
}

public void setStockUpdDate(Date stockUpdDate) {
	StockUpdDate = stockUpdDate;
}




}
