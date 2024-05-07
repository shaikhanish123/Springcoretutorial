package com.springcore.auto_wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	 ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/auto_wire/autoconfig.xml");
	 System.out.println("run successfully");
	Emp ad1=(Emp) context.getBean("emp");
	// System.out.println(Emp.class);
	System.out.println(ad1);
	System.out.println("getting the value injecting value of address:"+ad1.getAddress());
	 
	 }
}
