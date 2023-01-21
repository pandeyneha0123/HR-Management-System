package com.useCase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.application.EmployeeLink;
import com.models.Employee;
import com.models.EmployeeDao;
import com.dao.EmployeeDaoImp;
import com.exception.EmployeeException;
import com.utility.DbUtil;

public class LoginEmployee {
	
public static void main(String[] args) {
		
	}
//----------------------------------------------------------------------------------------------------------------------------------------
	public static Employee  loginEmployee() throws EmployeeException, SQLException {
		Employee emp=null;
   		
   		Scanner sc=new Scanner(System.in);
   		
   		System.out.println("Enter Your User Name");
   		String email=sc.next();
   		
   		System.out.println("Enter Your Password");
   		String password=sc.next();
   		
   		try (Connection con=DbUtil.provideConnection()){
   			
   			PreparedStatement ps=con.prepareStatement("select * from employee where EmplUserName=?");
   			
   			ps.setString(1, email);
   			
   			ResultSet rs=ps.executeQuery();
   			
   			if(rs.next()) {
   				emp=new Employee();
   				emp.setEmplId(rs.getInt("Eid"));
   				emp.setEmplName(rs.getString("EmplName"));
   				emp.setEmplUserName(rs.getString("EmplUserName"));
   				emp.setEmplPassword(rs.getString("EmplPassword"));
   				emp.setEdid(rs.getInt("Edid"));
   				
   				if(!emp.getEmplPassword().equals(password)) {
   					
   					throw new EmployeeException("Wrong Password");
   					
   				}
   				
   			}
   			else {
   				throw new EmployeeException("Email ID not exist");
   			}
   			
   		} catch (SQLException e) {
   			throw new EmployeeException(e.getMessage());
   		}
   		
  return emp;		
   		
	}
}
