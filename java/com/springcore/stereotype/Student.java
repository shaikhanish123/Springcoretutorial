package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
// using annotation
@Component()
public class Student {
	@Value("abid")
private String studentname;
	@Value("sakinaka")
	private String city;
	@Value("#{kurlaaiba}")
private List<String> address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

public String getStudentname() {
	return studentname;
}

public void setStudentname(String studentname) {
	this.studentname = studentname;
}


public List<String> getAddress() {
	return address;
}

public void setAddress(List<String> address) {
	this.address = address;
}

@Override
public String toString() {
	return "Student [studentname=" + studentname + ", city=" + city + "]";
}


}
