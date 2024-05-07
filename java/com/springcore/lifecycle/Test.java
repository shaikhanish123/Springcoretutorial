package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	  AbstractApplicationContext  context =new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
	 // Samosa sa=(Samosa) context.getBean("s1");
	  
	  System.out.println("run successfully");
	  
	//  System.out.println(sa.getPrice());
	  
	  context.registerShutdownHook();
	  
	  System.out.println("+++++++++");
	  
	  Pepsi px=(Pepsi) context.getBean("ps");
	  //
	  System.out.println(px);
} 
}
