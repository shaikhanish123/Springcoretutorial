package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	 ApplicationContext con =
			 new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
	  Student stud=(Student) con.getBean("student");
	  System.out.println(stud);
	  System.out.println(stud.getAddress().getClass().getName());
	  System.out.println("another object is running");
	  PrototypeExample em=(PrototypeExample) con.getBean("emp");
	  PrototypeExample em1=(PrototypeExample) con.getBean("emp");
	  PrototypeExample em2=(PrototypeExample) con.getBean("emp");
	  System.out.println(em.hashCode());
	  System.out.println(em1.hashCode());
	  System.out.println(em2.hashCode());
	 
	  
}
}
