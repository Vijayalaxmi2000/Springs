package collection.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext c1=new
				ClassPathXmlApplicationContext("collection/constructor/Vehicle.xml");		
		Vehicle vehi=(Vehicle)c1.getBean("vehicle");		
		System.out.println(vehi);
		System.out.println(c1.getBean("vehicle2"));
	}

}
