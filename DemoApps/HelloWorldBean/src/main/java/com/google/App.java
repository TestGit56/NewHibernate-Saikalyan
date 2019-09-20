package com.google;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.beans.HelloWorldBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
   ApplicationContext springcontainer = new ClassPathXmlApplicationContext("Applicationacontext.xml");
   
    HelloWorldBean bean1 = springcontainer.getBean(HelloWorldBean.class);
    bean1.getInfo();
      
    HelloWorldBean bean2 = springcontainer.getBean(HelloWorldBean.class);
    bean2.getInfo();
      
    HelloWorldBean bean3 = springcontainer.getBean(HelloWorldBean.class);
    bean3.getInfo();
    
    }
}
