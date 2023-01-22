package com.useCase;


import java.util.Scanner;

import com.models.Employee;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImp;

public class ChangePassword {
	
	public static void main(int id) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter New Password : ");
		String pass= sc.next();
		
		EmployeeDao dao=new EmployeeDaoImp();
		
		String rs = dao.changePassword(id, pass);
		
		System.out.println(rs);
		
	}

}
