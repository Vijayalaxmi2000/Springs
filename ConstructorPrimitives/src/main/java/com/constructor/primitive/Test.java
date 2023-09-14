package com.constructor.primitive;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/constructor/primitive/Employee.xml");
		Employee e1=(Employee)c1.getBean("emp");
		
		System.out.println(e1);
	}

}
