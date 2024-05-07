package com.springcore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
	public static void main(String[] args) {
		System.out.println("Hello aiba log");
		ApplicationContext  context=new ClassPathXmlApplicationContext("config.xml");
		 Student student1=(Student) context.getBean("Student1");
		// Student student2=(Student) context.getBean("Student2");
		 	System.out.println("getting the student object:"+student1);
//		 	System.out.println("getting the student2 object:"+student2);
	}
}
