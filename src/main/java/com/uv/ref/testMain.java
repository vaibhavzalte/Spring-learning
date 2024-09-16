package com.uv.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/uv/ref/refconfig.xml");
		A obj=(A)context.getBean("a");
		System.out.println(obj);
	}

}
