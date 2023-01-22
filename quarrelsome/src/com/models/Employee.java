package com.models;

public class Employee {
	
	private int EmpId;
	private String EmpName;
	private String EmpUserName;
	private String EmpPassword;
	private int Edid;
	
	public Employee() {
		
	}
	
public Employee(String ename, String username, String ePassword, int edid) {
		
		EmpName = ename;
		EmpUserName = username;
		EmpPassword = ePassword;
		Edid = edid;
	}
	public Employee(int eid, String ename, String username, String ePassword, int edid) {
			
			EmpId = eid;
			EmpName = ename;
			EmpUserName = username;
			EmpPassword = ePassword;
			Edid = edid;
		}
	
	public int getEmplId() {
		return EmpId;
	}
	public void setEmplId(int eid) {
		EmpId = eid;
	}
	
	
	public String getEmplName() {
		return EmpName;
	}
	public void setEmplName(String ename) {
		EmpName = ename;
	}
	
	
	public String getEmplUserName() {
		return EmpUserName;
	}
	public void setEmplUserName(String username) {
		EmpUserName = username;
	}
	
	
	public String getEmplPassword() {
		return EmpPassword;
	}
	public void setEmplPassword(String ePassword) {
		EmpPassword = ePassword;
	}
	
	
	public int getEdid() {
		return Edid;
	}
	public void setEdid(int edid) {
		Edid = edid;
	}
	
	
	@Override
	public String toString() {
		return "Employee [EmplId=" + EmpId + ", EmplName=" + EmpName + ", EmplUserName=" + EmpUserName + ", EmplPassword=" + EmpPassword
				+ ", Edid=" + Edid + "]";
	}
}
