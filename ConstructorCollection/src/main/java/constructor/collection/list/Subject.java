package constructor.collection.list;

import java.util.List;

public class Subject 
{
	private String subName;
	private List<String> frameworks;
	public Subject(String subName, List<String> frameworks)
	{
		super();
		this.subName = subName;
		this.frameworks = frameworks;
	}
	public String getSubName()
	{
		return subName;
	}
	public void setSubName(String subName) 
	{
		this.subName = subName;
	}
	public List<String> getFrameworks() 
	{
		return frameworks;
	}
	public void setFrameworks(List<String> frameworks)
	{
		this.frameworks = frameworks;
	}
	@Override
	public String toString() 
	{
		return "Subject [subName=" + subName + ", frameworks=" + frameworks + "]";
	}
	
	
	

}
