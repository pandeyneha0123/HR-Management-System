package com.application;




import java.sql.SQLException;

import java.util.Scanner;

import com.models.Employee;
import com.colors.ColorsFile;
import com.exception.EmployeeException;
import com.useCase.LoginEmployee;

public class Main {
	
	public static final String ANSI_RESET = "\u001B[0m";

	
	public static void main(String[] args) throws SQLException{
		
		Scanner sc= new Scanner(System.in);
		try {
		System.out.print(ColorsFile.PURPLE_BOLD  +  "             WELCOME  ");
		Thread.sleep(300);
		System.out.print( "TO  ");
		Thread.sleep(300);
		System.out.print("HUMAN  ");
		Thread.sleep(300);
		System.out.print("RESOURCE  ");
		Thread.sleep(300);
		System.out.println("MANAGEMENT  "  + ANSI_RESET);
		Thread.sleep(300);
		System.out.println(ColorsFile.ANSI_BLUE +  "        ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀" );
		Thread.sleep(300);
		System.out.println();
		System.out.println("************************************************************");
		Thread.sleep(300);
		System.out.println(ColorsFile.RED_ITALIC  +  "               Please Choose Options               "  + ANSI_RESET);
		Thread.sleep(300);
		
		System.out.println(ColorsFile.CYAN_BOLD + "Press 1 --->  for Login As Admin");
		Thread.sleep(300);
		System.out.println();
		System.out.println("Press 2 ---> for login As Employee");
		Thread.sleep(300);
		System.out.println();
		System.out.println("Press 3 ---> for Exit" + ANSI_RESET);
		}catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println();
		System.out.println();
		
		int choice =sc.nextInt();
		
//----------------------------------Choose  Options  Results----------------------------------------
		switch (choice) {
			case 1: {
					System.out.println("Enter Admin Username : ");
					String username=sc.next();
					
					System.out.println("Enter Admin Password : ");
					String pass = sc.next();
					
					if(username.equals("admin") && pass.equals("123")) {
						AdminLink.linkingAdmin();
					}
						else  {
						System.out.println("Wrong Username And PassWord");
						}
					break;
				}
				case 2:{
					try {
						Employee emp=LoginEmployee.loginEmployee();
						EmployeeLink.linkingEmployeeMethod(emp);
					} catch (EmployeeException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
				}
				case 3:{
					System.out.println(ColorsFile.ANSI_CYAN+ "   Application  Closed");
					System.out.println("     Thank  You");
					System.out.println("-------------------------" + ANSI_RESET);
					break;
				}
				
				default:
					
					try {
						System.out.println("Invalid  key");
						Thread.sleep(200);
						System.out.println("Please choose a valid key");
						Thread.sleep(400);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		}
	}





}

