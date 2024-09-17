package com.uv.myProject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uv.collections.Emp;

import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/uv/myProject/config.xml") ;

        Student student1=(Student)context.getBean("student1");
        System.out.println(student1);
        Student student2=(Student)context.getBean("student2");
        System.out.println(student2);

        ApplicationContext context2= new ClassPathXmlApplicationContext("com/uv/collections/collectionConfig.xml");
        Emp emp1=(Emp)context2.getBean("emp1");
        System.out.println(emp1);
    }
}
