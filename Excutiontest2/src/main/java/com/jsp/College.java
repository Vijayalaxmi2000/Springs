package com.jsp;

public class College 
{
	private Branch branch;
    private String collegeName;
    private String loc;
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "College [branch=" + branch + ", collegeName=" + collegeName + ", loc=" + loc + "]";
	}
    
    
}
