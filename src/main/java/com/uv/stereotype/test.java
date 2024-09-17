package com.uv.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uv.cInjection.Person;

public class test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/uv/stereotype/config.xml") ;

		Student e1=(Student)context.getBean("student");

		System.out.println(e1);


	}

}
