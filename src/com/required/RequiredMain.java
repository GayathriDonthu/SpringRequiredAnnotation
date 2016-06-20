package com.required;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredMain {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Student s = (Student) context.getBean("student");
		
		System.out.println("Name: "+s.getName());
		System.out.println("Age: "+s.getAge());
		
	}
}
