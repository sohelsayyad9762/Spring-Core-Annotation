package com.tech;

import org.springframework.stereotype.Repository;


public class City {
	
	private String cityname;
	
	public City() {
		System.out.println("inside City Cnstructor..");
	}
	
	public void setCityname(String cityname) {
		System.out.println("set cityname");
		this.cityname = cityname;
	}
	
	public String getCityname() {
		return cityname;
	}

}
