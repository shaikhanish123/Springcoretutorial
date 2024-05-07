package com.springcore.ci;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		 person per=(person) context.getBean("person1");
		 System.out.println(per);
		 Addition ad=(Addition) context.getBean("add");
		 ad.dosum();
	}

}
