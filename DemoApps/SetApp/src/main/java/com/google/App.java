package com.google;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.bean.ProductBean;
import com.google.bean.SampleBean;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

		SampleBean s = container.getBean(SampleBean.class);
	Set<ProductBean> productSet = s.getProductList();

		for(ProductBean product: productSet )
		{
			System.out.println(product);
		}

	}
}
