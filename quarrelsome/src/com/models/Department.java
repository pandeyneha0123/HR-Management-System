package com.models;

public class Department {
	
	private String DepName;
	private int DepNo;
	
	public Department() {
		
	}
	
	public Department(String Dname, int DNo, int DID) {
		DepName = Dname;
		DepNo = DNo;
	}
	
	public String getDeptName() {
		return DepName;
	}
	public void setDeptName(String Dname) {
		DepName = Dname;
	}
	public int getDeptNo() {
		return DepNo;
	}
	public void setDeptNo(int DNo) {
		DepNo = DNo;
	}
	
	@Override
	public String toString() {
		return "Department: [DeptName = "+DepName+", DeptNo = " + DepNo + "]";
	}

}
