package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		
		 Employee e1=(Employee) ctx.getBean("emp");
		 
		 System.out.println(e1.getAddress());
		 
		 Address a1=(Address) ctx.getBean("add123");
		 System.out.println(a1.getCity().getCityname());
		 
		 City c1= (City) ctx.getBean("city1");
		 System.out.println(c1.getCityname());

	}

}
