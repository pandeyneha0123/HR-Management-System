package com.useCase;

import java.util.Scanner;
import com.models.Employee;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImp;

public class AddEmployeeUserCase {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name :");
		String Ename=sc.next();
		
		System.out.println("Enter Employee Username : ");
		String Username=sc.next();
		
		System.out.println("Enter Employee Password : ");
		String pass = sc.next();
		
		System.out.println("Enter Employee Department Id : ");
		int Edid=sc.nextInt();
		
		EmployeeDao dao =new EmployeeDaoImp();
		Employee emp = new Employee();
		emp.setEmplName(Ename);
		emp.setEmplUserName(Username);
		emp.setEmplPassword(pass);
		emp.setEdid(Edid);
		
		String result =dao.registerEmployee(emp);
		
		System.out.println(result);
	}

}
