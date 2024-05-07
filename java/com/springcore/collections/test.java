package com.springcore.collections;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String[] args) {
	System.out.println("run successfully");
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collconfig.xml");
	  
	  emp emp1=(emp) context.getBean("emp");
	  System.out.println(emp1.getName());
	  System.out.println(emp1.getPhones());
	  System.out.println(emp1.getAddress());
	  System.out.println(emp1.getCousres());
	  System.out.println(emp1.getPhones().getClass().getName());// getting the implementation
	

}

}
