package com.dao;

import java.sql.SQLException;
import java.util.List;
import com.masai.bean.Department;
import com.masai.exception.DepartmentException;

public interface DepartmentDao {
	
	public String registerDepartment(Department department);
	public List<Department> allDepartment()throws DepartmentException,SQLException;
	 public String updateDepartment(Department department);
	public String acceptLeaves(int empId);
	public String rejectLeaves(int empId);

}
