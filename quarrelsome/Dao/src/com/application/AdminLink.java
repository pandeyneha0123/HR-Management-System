package com.application;

import java.sql.SQLException;
import java.util.Scanner;

import com.colors.ColorsFile;
import com.useCase.AcceptLeave;
import com.useCase.AddDepartmentUsecase;
import com.useCase.AddEmployeeUserCase;
import com.useCase.UpdateDepartmentUsecase;
import com.useCase.ViewAllDepartmentUseCase;
import com.useCase.ViewAllEmployee;

public class AdminLink {
	
	public static final String ANSI_RESET = "\u001B[0m";
	
	static boolean	ordering=true;
	
	public  static void linkingAdmin() throws SQLException {
		Scanner sc=new Scanner(System.in);
//		do {
			System.out.println(ColorsFile.BLACK_BOLD_BRIGHT +   "===================================");
			System.out.println( " ***Welcome  To   My   Admin   Panel***");
			System.out.println( "===================================" + ANSI_RESET);
			System.out.println();
			try {
				System.out.println(ColorsFile.RED_ITALIC  +  "               Please Choose Options               "  + ANSI_RESET);
				Thread.sleep(300);
				System.out.println(ColorsFile.CYAN_BOLD + "Press 1 --->  For Adding New Departments");
				Thread.sleep(300);
				System.out.println();
				System.out.println("Press 2 --->. View all Department ");
				Thread.sleep(300);
				System.out.println();
				System.out.println("Press 3 --->. View all Employee ");
				Thread.sleep(300);
				System.out.println();
				System.out.println("Press 4 ---> Update The Department ");
				Thread.sleep(300);
				System.out.println();
				System.out.println("Press 5 ---> For Adding New Employees ");
				Thread.sleep(300);
				System.out.println();
				System.out.println("Press 6 ---> Transfer Employee To Other Department");
				Thread.sleep(300);
				System.out.println();
				System.out.println("Press 7 ---> Accept leaves Of Employess");
				Thread.sleep(300);
				System.out.println();
				System.out.println("Press 8 ---> Reject Leaves Of Employees" + ANSI_RESET);
				Thread.sleep(300);
				System.out.println();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			do {
				try {
					System.out.println(ColorsFile.CYAN_BOLD + "Press 9 ---> For Home ");
					Thread.sleep(300);
					System.out.println();
					System.out.println("Press 10 ---> For Exit " + ANSI_RESET);
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			int choice = sc.nextInt();
			
			//---------------------------------------------Options  To Choose--------------------------------------
			switch (choice) {
					case 1: {
							System.out.println();
							AddDepartmentUsecase.register();
							break;
					}
					case 2: {
							System.out.println();
							ViewAllDepartmentUseCase.main(null);
							break;
					}
					case 3: {
						System.out.println();
						ViewAllEmployee.main(null);
						break;
				}
					case 4: {
							System.out.println();
							UpdateDepartmentUsecase.main(null);
							break;
					}
					case 5: {
						System.out.println();
						AddEmployeeUserCase.main(null);
						break;
					}
					
					case 7: {
						System.out.println();
						AcceptLeave.main(null);
						break;
					}
					
					case 9: {
						System.out.println();
						System.out.println("   Application  Closed");
						System.out.println("     Home  Page");
						System.out.println("-------------------------");
						Main.main(null);
						ordering=false;
						break;
					}
					case 10: {
						System.out.println();
						System.out.println("   Application  Closed");
						System.out.println("     Exit  to  Admin  Panel");
						System.out.println("-------------------------");
						AdminLink.linkingAdmin();
						ordering=false;
						break;
					}
					default:
							throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
			
			}while(ordering);
	}
}
