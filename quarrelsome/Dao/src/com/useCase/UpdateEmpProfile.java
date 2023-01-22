package com.useCase;


import java.util.Scanner;

import com.models.Employee;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImp;

public class UpdateEmpProfile {
	public static void main(int eid) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter New Username  : ");
		String EmplUserName=sc.next();
		System.out.println("Enter New Password  : ");
		String pass=sc.next();
		
		EmployeeDao dao=new EmployeeDaoImp();
		
		
		String result = dao.updateEmployee(EmplUserName,pass, eid);
		System.out.println(result);
		

		
	}

}
