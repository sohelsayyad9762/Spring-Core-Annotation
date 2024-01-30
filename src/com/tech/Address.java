package com.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "add123")
public class Address {
	
	@Autowired
	City city;
	
	public Address() {
		System.out.println("Address Constructor..");
	}
	
	public City getCity() {
		return city;
	}

}
