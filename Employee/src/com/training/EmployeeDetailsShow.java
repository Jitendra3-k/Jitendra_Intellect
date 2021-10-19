package com.training;

public class EmployeeDetailsShow {
	private int id;
	private String Fname;
	private String Lname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public EmployeeDetailsShow(int id, String fname, String lname) {
		this.id = id;
		Fname = fname;
		Lname = lname;
	}
	@Override
	public String toString() {
		return "EmployeeDetailsShow [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + "]";
	}
	
	

}
