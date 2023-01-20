package com.dao;


import java.sql.SQLException;
import java.util.List;
import com.models.Employee;
import com.exception.EmployeeException;

public interface EmployeeDao {
	public Employee loginEmployee(String Username , String password) throws EmployeeException,SQLException;
	public String registerEmployee(Employee employee);
	public List<Employee> getAllEmployee()throws EmployeeException;
	public Employee getEmployeeById(int Eid) throws EmployeeException, SQLException;
	public String updateEmployee( String username,String password, int Eid);
	public String changePassword(int Eid, String Password);

}
