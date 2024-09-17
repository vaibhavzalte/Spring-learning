package com.uv.autowiring.usingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uv.cInjection.Person;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/uv/autowiring/usingXml/config.xml") ;

		Emp e1=(Emp)context.getBean("emp1");

		System.out.println(e1);

	}

}
