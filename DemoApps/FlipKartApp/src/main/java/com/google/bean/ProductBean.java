package com.google.bean;

public class ProductBean {
	
	private Integer productId = null;
	
	private String productName = null;
	
	 private Float productPrice = null;
	 
	  private Stock stockRef = null;

	
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}

	public void setStockRef(Stock stockRef) {
		this.stockRef = stockRef;
	}

	public Integer getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public Float getProductPrice() {
		return productPrice;
	}

	public ProductBean(Integer productId, String productName, Float productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	  
	  
	 

}
