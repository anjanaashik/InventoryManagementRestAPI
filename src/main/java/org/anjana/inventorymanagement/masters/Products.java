package org.anjana.inventorymanagement.masters;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@SequenceGenerator(name ="seq",initialValue= 100)
public class Products {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "seq")
	private int ProductSlno;
	private String ProductSku; //ProductId
	private int ProductPurchaseSlno;
	private String ProductDesc;
	private int ProductNetPrice;
	private Date ProductEntDate;
	private Date ProductUpdDate;
	
	Products(){
		
	}
	
	Products(int productSlno, String productSku,
			int productPurchaseSlno, String productDesc, int productNetPrice,
			Date productEntDate, Date productUpdDate) {
		super();
		this.ProductSlno = productSlno;
		this.ProductSku = productSku;
		this.ProductPurchaseSlno = productPurchaseSlno;
		this.ProductDesc = productDesc;
		this.ProductNetPrice = productNetPrice;
		this.ProductEntDate = productEntDate;
		this.ProductUpdDate = productUpdDate;
	}


	public int getProductSlno() {
		return ProductSlno;
	}
	public String getProductSku() {
		return ProductSku;
	}
	public void setProductSku(String productSku) {
		this.ProductSku = productSku;
	}
	public int getProductPurchaseSlno() {
		return ProductPurchaseSlno;
	}
	public void setProductPurchaseSlno(int productPurchaseSlno) {
		this.ProductPurchaseSlno = productPurchaseSlno;
	}
	public String getProductDesc() {
		return ProductDesc;
	}
	public void setProductDesc(String productDesc) {
		this.ProductDesc = productDesc;
	}
	public int getProductNetPrice() {
		return ProductNetPrice;
	}
	public void setProductNetPrice(int productNetPrice) {
		this.ProductNetPrice = productNetPrice;
	}
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getProductEntDate() {
		return ProductEntDate;
	}
	
	public void setProductEntDate(Date productEntDate) {
		this.ProductEntDate = productEntDate;
	}
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getProductUpdDate() {
		return ProductUpdDate;
	}
	public void setProductUpdDate(Date productUpdDate) {
		this.ProductUpdDate = productUpdDate;
	}

	public void setProductSlno(int productSlno) {
		this.ProductSlno = productSlno;
		
	}
	
	
	
}
