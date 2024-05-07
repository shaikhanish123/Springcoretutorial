package com.springcore.stereotype;

public class PrototypeExample {
private String address;
 public PrototypeExample() {
	super();
	// TODO Auto-generated constructor stub
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return "PrototypeExample [address=" + address + "]";
}

}
