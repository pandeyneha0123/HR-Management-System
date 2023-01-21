package com.useCase;

import java.sql.SQLException;
import java.util.Scanner;
import com.models.Employee;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImp;
import com.exception.EmployeeException;

public class GetEmpByID {
	
	public static void main(int eid) {
		
		
		EmployeeDao dao= new EmployeeDaoImp();
		
		try {
			Employee emp = dao.getEmployeeById(eid);
			System.out.println(emp);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
