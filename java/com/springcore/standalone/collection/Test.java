package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	 ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collection/configstandalone.xml");
	 Person per=(Person) context.getBean("person1");
	 System.out.println(per);
	 System.out.println(per.getFriends().getClass().getName());
}
}
