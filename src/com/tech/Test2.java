package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		
		 Employee e1=(Employee) ctx.getBean("employee");
		 
		 System.out.println(e1.getAddress().getCity().getCityname());

	}

}
