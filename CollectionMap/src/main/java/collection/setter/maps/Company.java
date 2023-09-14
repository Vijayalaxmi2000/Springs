package collection.setter.maps;

import java.util.Map;

public class Company 
{
	private String companyName;
	private Map<Integer,String> empIdAndempName;
	public String getCompanyName()
	{
		return companyName;
	}
	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}
	public Map<Integer, String> getEmpIdAndempName() 
	{
		return empIdAndempName;
	}
	public void setEmpIdAndempName(Map<Integer, String> empIdAndempName) 
	{
		this.empIdAndempName = empIdAndempName;
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", empIdAndempName=" + empIdAndempName + "]";
	}
	
	
	
	
	

}
