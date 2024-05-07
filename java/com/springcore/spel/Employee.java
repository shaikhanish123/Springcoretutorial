package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
@Value("#{11+12}")// for expression language
private int x;
@Value("#{10+10}")
private int y;
 public void sum() {
	 int result= x+y;
	 System.out.println("sum of two number is"+result); 
	 }
 @Value("#{T(java.lang.Math).sqrt(49)}")// calling the static method
 private int z;
 
  @Value("#{5>3}")
private boolean  isActive; 
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}

@Override
public String toString() {
	return "Employee [x=" + x + ", y=" + y + ", z=" + z + ", isActive=" + isActive + "]";
}





}
