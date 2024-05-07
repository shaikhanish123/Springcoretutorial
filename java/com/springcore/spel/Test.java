package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	 ApplicationContext context=new  ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
	  Employee E1=context.getBean("employee",Employee.class);
	  System.out.println(E1);
	  E1.sum();
}

}
