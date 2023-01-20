package com.useCase;

import java.util.Scanner;
import com.models.Department;
import com.dao.DepartmentDao;
import com.dao.DepartmentDaoImp;

public class AddDepartmentUsecase {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Department Name :");
		String dname=sc.next();
		
		System.out.println("Enter Department no : ");
		int dNO=sc.nextInt();
		
		DepartmentDao dao = new DepartmentDaoImp();
		Department department = new Department();
		String result = dao.registerDepartment(department);
		System.out.println(result);
		
	}
	
	public static void register() {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Department Name :");
		String dname=sc.next();
		
		System.out.println("Enter Department no : ");
		int dNO=sc.nextInt();
		
		DepartmentDao dao = new DepartmentDaoImp();
		
		Department department = new Department();
		
		department.setDeptName(dname);
		department.setDeptNo(dNO);
		
		String result = dao.registerDepartment(department);
		
		System.out.println(result);
	}

}
