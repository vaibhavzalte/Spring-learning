package com.uv.standalone_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uv.cInjection.Person;

public class test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/uv/standalone_collections/config.xml") ;

		Student e1=(Student)context.getBean("student1");
		Student e2=(Student)context.getBean("student2");

		System.out.println(e1);
		System.out.println(e1.getNames().getClass());
		System.out.println(e2);

	}

}
