package com.springcore.ci;

public class Addition {
	private int a;
	private int b;

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("cont int,int");
	}

	public Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("cont double,double");
	}
	public Addition(String a, String b) {
		this.a =Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("cont String ,String");
	}

	public void dosum() {
System.out.println("sum of two number"+(this.a+this.b));
	}
	
}
