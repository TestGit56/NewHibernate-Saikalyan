package com.google.bean;

public class Stock {
	
	private ProductBean productRef = null;
	
	private Integer stockId = null;

	

	public Stock(Integer stockId) {
		super();
		this.stockId = stockId;
	}

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public void setProductRef(ProductBean productRef) {
		this.productRef = productRef;
	}
	
	public void getInfo()
	{
		System.out.println("ProductRef \n\n"
				+ ""+productRef.getProductId()+" : \n\n"
				+ " : "+productRef.getProductName()+":\n\n"
						+ ":"+productRef.getProductPrice());
		
		System.out.println("StockId "+stockId);
	}

}
