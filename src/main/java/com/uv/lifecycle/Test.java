package com.uv.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/uv/lifecycle/config.xml");

		Samosa s1 = (Samosa) context.getBean("samosa1");
		
		System.out.println(s1);
		
		context.registerShutdownHook();

	}

}
