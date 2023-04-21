package com.java.spring.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
        
//        //**xml configuration**
//        Vehicle obj= (Vehicle)context.getBean("vehicle");
//        obj.drive();
        
        //=======================================================================================//
        
//		  //**annotation configuration**
//        Vehicle obj= (Vehicle)context.getBean("bike");
//        obj.drive();
        
        Car c=(Car)context.getBean("car");
        c.drive();
        
//        Tyre t=(Tyre)context.getBean("tyre");
//        System.out.println(t);
    }
}
