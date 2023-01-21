package com.useCase;

import java.util.Scanner;

import com.dao.DepartmentDao;
import com.dao.DepartmentDaoImp;

public class AcceptLeave {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id  : ");
		int empid=sc.nextInt();
		
		DepartmentDao dao = new DepartmentDaoImp();
		String result = dao.acceptLeaves(empid);
		System.out.println(result);
	}

}
