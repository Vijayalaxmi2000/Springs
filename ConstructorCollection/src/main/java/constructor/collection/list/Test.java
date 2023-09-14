package constructor.collection.list;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("constructor/collection/list/Subject.xml");
		Subject s1=(Subject)c1.getBean("subject");
		System.out.println(s1);
		
		List<String> list=s1.getFrameworks();
		System.out.println(list.getClass());
	}

}
