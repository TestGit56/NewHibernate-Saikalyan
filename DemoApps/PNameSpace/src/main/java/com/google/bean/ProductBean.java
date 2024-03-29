package com.google.bean;

import java.io.Serializable;

public class ProductBean {
	
	private Integer productId = null;
	private String productName = null;
	private Float productPrice =null;
	public Integer getProductId() {
		return productId;
	}
	
	
	public ProductBean() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "ProductBean [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	

}
