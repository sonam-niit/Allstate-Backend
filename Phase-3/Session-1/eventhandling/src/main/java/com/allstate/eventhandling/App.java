package com.allstate.eventhandling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.allstate.eventhandling.custom.CustomEventpublisher;
import com.allstate.eventhandling.custom.CustomeEvent;

public class App 
{
    public static void main( String[] args )
    {
       ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
       
//       context.start();
//       System.out.println("Completed the task");
//       context.stop();
       
       CustomEventpublisher cep=(CustomEventpublisher)context.getBean("cep");
       cep.publish();
    }
}
