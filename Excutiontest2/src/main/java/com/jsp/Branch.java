package com.jsp;

public class Branch 
{
	private Student student;
	private int bid;
	private String bname;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "Branch [student=" + student + ", bid=" + bid + ", bname=" + bname + "]";
	}
	
	

}
