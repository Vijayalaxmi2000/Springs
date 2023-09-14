package com.jsp;

public class Student
{
	private int id;
	private String sname;
	private double marks;
	public int getSid() {
		return id;
	}
	public void setSid(int sid) {
		this.id = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + id + ", sname=" + sname + ", marks=" + marks + "]";
	}
	
	

}
