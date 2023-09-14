package collection.setter.set;

import java.util.Set;

public class Employee 
{
	private int empId;
	private String empName;
	private Set<String> projects;
	public int getEmpId() 
	{
		return empId;
	}
	public void setEmpId(int empId) 
	{
		this.empId = empId;
	}
	public String getEmpName() 
	{
		return empName;
	}
	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}
	public Set<String> getProjects() 
	{
		return projects;
	}
	public void setProjects(Set<String> projects) 
	{
		this.projects = projects;
	}
	@Override
	public String toString() 
	{
		return "Employee [empId=" + empId + ", empName=" + empName + ", projects=" + projects + "]";
	}
	
	
	

}
