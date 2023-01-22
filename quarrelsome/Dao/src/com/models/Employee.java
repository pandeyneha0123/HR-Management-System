package com.models;

public class Employee {
	private int EId;
	private String EmplName;
	private String EmplUserName;
	private String EmplPassword;
	private int Edid;
	
	public Employee() {
		
	}
	
public Employee(String ename, String username, String ePassword, int edid) {
		
		EmplName = ename;
		EmplUserName = username;
		EmplPassword = ePassword;
		Edid = edid;
	}
	public Employee(int eid, String ename, String username, String ePassword, int edid) {
			
			EId = eid;
			EmplName = ename;
			EmplUserName = username;
			EmplPassword = ePassword;
			Edid = edid;
		}
	
	public int getEmplId() {
		return EId;
	}
	public void setEmplId(int eid) {
		EId = eid;
	}
	
	
	public String getEmplName() {
		return EmplName;
	}
	public void setEmplName(String ename) {
		EmplName = ename;
	}
	
	
	public String getEmplUserName() {
		return EmplUserName;
	}
	public void setEmplUserName(String username) {
		EmplUserName = username;
	}
	
	
	public String getEmplPassword() {
		return EmplPassword;
	}
	public void setEmplPassword(String ePassword) {
		EmplPassword = ePassword;
	}
	
	
	public int getEdid() {
		return Edid;
	}
	public void setEdid(int edid) {
		Edid = edid;
	}
	
	
	@Override
	public String toString() {
		return "Employee [EmplId=" + EId + ", EmplName=" + EmplName + ", EmplUserName=" + EmplUserName + ", EmplPassword=" + EmplPassword
				+ ", Edid=" + Edid + "]";
	}
}
