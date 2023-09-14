package collection.setter.maps;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args) 
	{
        ClassPathXmlApplicationContext c1= new ClassPathXmlApplicationContext("collection/setter/maps/Company.xml");
        
        Company e1=(Company)c1.getBean("company");
        System.out.println(e1);
        
        Map<Integer,String> m1= e1.getEmpIdAndempName();
        System.out.println(m1.getClass());
	}

}
