package com.google;

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
       
  ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
  
  SampleBean bean = container.getBean(SampleBean.class);
  bean.service();
 container.registerShutdownHook();
  
    }
}
