package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Department;
import com.masai.exception.DepartmentException;
import com.utility.DbUtil;

public class DepartmentDaoImp {
	

	//------------------------------------------Add   Department----------------------------------------------------
	
	@Override
	public String registerDepartment(Department department) {
		String message = "Not inserted data...";
		
		try(Connection conn= DbUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into Department(DeptName, DeptNo) value(?,?)");
			ps.setString(1, department.getDeptName());
			ps.setInt(2, department.getDeptNo() );
			int X =  ps.executeUpdate();
			if(X>0)
				message="Department Added  Sucessfully !";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			message=e.getMessage();
		}
		
		return message;
	}

	
	//------------------------------------------View   All   Department----------------------------------------------------
	@Override
	public List<Department> allDepartment()throws DepartmentException, SQLException {
		
			List<Department> departments= new ArrayList<>();
		
			try(Connection conn= DbUtil.provideConnection()) {
			
					PreparedStatement ps= conn.prepareStatement("select * from department");
			
					ResultSet rs= ps.executeQuery();
				
					while(rs.next()) {
							String DeptName= rs.getString("DeptName");
							int DeptNo = rs.getInt("DeptNo");
							int Did=rs.getInt("Did");
							
							Department department= new Department(DeptName, DeptNo,Did) ;
			
							departments.add(department);
					}
			}catch (SQLException e) {
				throw new DepartmentException();
			
			}
			if(departments.size()==0) {
				throw new DepartmentException("No Department Found ! .. ");
			}
		
			return departments;
	}

	
	
	//------------------------------------------ Update   Department----------------------------------------------------
	
	@Override
	public String updateDepartment(Department department) {
		
		String message = null;
			try {
				 message = "Department Not found !...";
				Thread.sleep(30);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
					
					try(Connection conn= DbUtil.provideConnection()) {
						
								PreparedStatement ps=conn.prepareStatement("update department set DeptName=? where DeptNO=?");
								ps.setString(1, department.getDeptName());
								ps.setInt(2, department.getDeptNo());
								
								int x=ps.executeUpdate();
								
								if(x>0) {
										message="Department update";
								}
					} catch (SQLException e) {
							message=e.getMessage();
					}
					return message;
			}


//------------------------------------------ACCEPT   LEAVES----------------------------------------------------
	@Override
	public String acceptLeaves(int empId) {
		String message="Employee Not found !...";
		try(Connection conn= DbUtil.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("update leaves set status='Approve' where empId=?");
			ps.setInt(1, empId);
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="Employee leaves Accepted ";
			}
		} catch (SQLException e) {
			message=e.getMessage();
		}
		
		return message;
	}


	//------------------------------------------REJECT   LEAVES----------------------------------------------------
	@Override
	public String rejectLeaves(int empId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
