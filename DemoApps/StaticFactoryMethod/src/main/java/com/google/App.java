package com.google;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.beans.SampleBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        

    	ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml"); 
    
    	SampleBean s = container.getBean("sampleBeanId",SampleBean.class);
    	
        s.getInfo();    
 
 
    }
}
