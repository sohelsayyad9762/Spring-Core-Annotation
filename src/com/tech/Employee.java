package com.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "emp")
public class Employee {
	
	@Autowired
	Address address;
	
	public Employee() {
		System.out.println("Employee Constructor..");
	}
	
	public Address getAddress() {
		return address;
	}

}
