package com.useCase;


import java.util.Scanner;
import com.models.Department;
import com.dao.DepartmentDaoImp;

public class UpdateDepartmentUsecase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Department DId : ");
		int did=sc.nextInt();
		
		System.out.println("Enter Department Name : ");
		String dname=sc.next();
		
		DepartmentDao dao=new DepartmentDaoImp();
		
		Department department = new Department();
		
		department.setDeptName(dname);
		department.setDeptNo(did);
		
		String result = dao.updateDepartment(department);
		
		System.out.println(result);
	}

}
