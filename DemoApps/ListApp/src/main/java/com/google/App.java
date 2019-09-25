package com.google;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.bean.SampleBean;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

		SampleBean s = container.getBean(SampleBean.class);
	List<String> UserNames = s.getUserNames();

		for(String name: UserNames)
		{
			System.out.println(name);
		}

	}
}
