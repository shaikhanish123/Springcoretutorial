package com.springcore.standalone.collection;

import java.util.List;import javax.print.DocFlavor.STRING;

public class Person {
private List<String> friends;


public Person() {
	super();
	// TODO Auto-generated constructor stub
}

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}

@Override
public String toString() {
	return "Person [friends=" + friends + "]";
}
}
