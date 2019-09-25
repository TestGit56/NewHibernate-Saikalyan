package com.google.bean;

import java.util.Map;

public class SampleBean {
	
	private Map<String,String> productMap = null;
	
	 
	public Map<String , String> getProductIdNames()
	{
		return productMap;
	}

	public void setProductMap(Map<String, String> productMap) {
		this.productMap = productMap;
	}
	
	
	
	

}
