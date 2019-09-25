package com.google;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.bean.SampleBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
    
    SampleBean s = container.getBean(SampleBean.class);
    System.out.println(s.getProductProperties());
    
    
    
    
    }
}
