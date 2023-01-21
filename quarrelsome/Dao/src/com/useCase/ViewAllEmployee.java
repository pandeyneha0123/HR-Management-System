package com.useCase;

import java.util.List;
import com.models.Employee;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImp;
import com.exception.EmployeeException;

public class ViewAllEmployee {

	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDaoImp();
		List<Employee> emp;
		try {
			 emp = dao.getAllEmployee();
			 
			 emp.forEach(e->{
					System.out.println("Employee Id is : "+ e.getEmplId());
					System.out.println("Employe name is : "+e.getEmplName());
					System.out.println("Employee username is : "+e.getEmplUserName());
					System.out.println("Employee Department Id is "+e.getEdid());
					
					System.out.println("=====================================");
			 });
		} catch (EmployeeException e1) {
				System.out.println(e1.getMessage());
			
		}
	}


}
