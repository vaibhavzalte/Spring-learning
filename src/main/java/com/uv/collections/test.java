package com.uv.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uv.cInjection.Person;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/uv/cInjection/conInjection.xml") ;
		
		Person person1=(Person)context.getBean("person1");
		
		System.out.println(person1);
		
	}

}
