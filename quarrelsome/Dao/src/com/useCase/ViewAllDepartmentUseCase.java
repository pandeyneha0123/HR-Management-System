package com.useCase;


import java.sql.SQLException;
import java.util.List;

import com.models.Department;
import com.dao.DepartmentDao;
import com.dao.DepartmentDaoImp;
import com.exception.DepartmentException;

public class ViewAllDepartmentUseCase {
	
	public static void main(String[] args) throws SQLException {
		
		DepartmentDao dao = new DepartmentDaoImp();
		try {
			
				List<Department> dep=dao.allDepartment();
				
				dep.forEach(e->{
					System.out.println("Employee name is : "+ e.getDeptName());
					System.out.println("Employe ID is : "+e.getDeptNo());
					
					
					System.out.println("=====================================");
				});
		} catch (DepartmentException e) {
			
			System.out.println(e.getMessage());
		}
	}	
}


