package com.google;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.google.dao.HelloWorldBeanFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
 Resource resource = new ClassPathResource("applicationContext.xml");
 BeanFactory springContainer = new XmlBeanFactory(resource);
 
 HelloWorldBeanFactory bean = springContainer.getBean(HelloWorldBeanFactory.class);
 bean.getInfo();
    }
}
