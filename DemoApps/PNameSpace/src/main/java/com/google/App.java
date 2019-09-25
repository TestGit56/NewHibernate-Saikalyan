package com.google;

import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.bean.ProductBean;
import com.google.bean.SampleBean;

public class App {
	public static void main(String[] args)
	{
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SampleBean s = container.getBean(SampleBean.class);
		
		List<ProductBean> productList = s.getProductList();
		
		for(ProductBean product:productList)
		{
			System.out.println(product);
		}
		
	}

}
