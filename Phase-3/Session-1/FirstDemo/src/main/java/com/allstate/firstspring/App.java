package com.allstate.firstspring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
//    	Resource resource= new ClassPathResource("beans.xml");
//    	BeanFactory factory= new XmlBeanFactory(resource);
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
    	
    	Hello h=(Hello)context.getBean("h");
    	h.helloWorld();
    	
    	Student s1= (Student) context.getBean("s1");
    	System.out.println("Id: "+s1.getId());
    	System.out.println("Name: "+s1.getName());
    	Address a1= s1.getAddress();
    	System.out.println(a1.getState()+" "+a1.getCity()+" "+a1.getPincode());
    }
}
