package com.models;

public class Department {
	
	private String DeptName;
	private int DeptNo;
	
	public Department() {
		
	}
	
	public Department(String Dname, int DNo, int DID) {
		DeptName = Dname;
		DeptNo = DNo;
	}
	
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String Dname) {
		DeptName = Dname;
	}
	public int getDeptNo() {
		return DeptNo;
	}
	public void setDeptNo(int DNo) {
		DeptNo = DNo;
	}
	
	@Override
	public String toString() {
		return "Department: [DeptName = "+DeptName+", DeptNo = " + DeptNo + "]";
	}
	

}
