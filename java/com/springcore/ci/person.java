package com.springcore.ci;

public class person {
private String name;
private int personid;

public person(String name, int personid) {
	
	this.name = name;
	this.personid = personid;
}

@Override
public String toString() {
	return this.name+" : "+this.personid;
}

}
