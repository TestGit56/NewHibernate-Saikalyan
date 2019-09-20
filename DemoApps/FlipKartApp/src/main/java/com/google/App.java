package com.google;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.bean.ProductBean;
import com.google.bean.Stock;

public class App {
	public static void main(String[] args)
	{
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Stock stock = springContainer.getBean(Stock.class);
	
		stock.getInfo();
	}

}
