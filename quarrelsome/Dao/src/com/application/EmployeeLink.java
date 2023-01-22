package com.application;



import java.sql.SQLException;
import java.util.Scanner;

import com.models.Employee;
import com.colors.ColorsFile;
import com.useCase.AddEmployeeUserCase;
import com.useCase.ChangePassword;
import com.useCase.GetEmpByID;
import com.useCase.UpdateEmpProfile;

public class EmployeeLink {
	
	public static final String ANSI_RESET = "\u001B[0m";
	
	static boolean	ordering=true;
	
	public  static void linkingEmployeeMethod(Employee  emp) throws SQLException {
			
			Scanner sc = new Scanner(System.in);
			
				System.out.println();
				System.out.println(ColorsFile.BLACK_BOLD_BRIGHT +   "===================================");
				System.out.println( " ***Welcome  To   My   Employee   Panel***");
				System.out.println( "===================================" + ANSI_RESET);
				System.out.println();
				
				try {
					System.out.println(ColorsFile.ORANGE + "                           	                  THOUGHT  OF  THE  DAY" + ANSI_RESET );
					Thread.sleep(400);
					System.out.println(ColorsFile.ORANGE + "                                      ************************************************" + ANSI_RESET);
					System.out.println(ColorsFile.GREEN_ITALIC+ "                               SUCCESS  IS  NOT  ALWAYS  ABOUT  GREATNESS, ");
					Thread.sleep(400);
					System.out.println(ColorsFile.GREEN_ITALIC+ "                                                  IT'S  ABOUT  CONSISTENCY");
					Thread.sleep(400);
					System.out.println("*****************************************************************************************************************" + ANSI_RESET);
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
						try {
							System.out.println();
							System.out.println(ColorsFile.RED_ITALIC  +  "               Please Choose Options               "  + ANSI_RESET);
							Thread.sleep(300);
							System.out.println();
							System.out.println(ColorsFile.CYAN_BOLD + "Press 1 . View Your Profile ");
							Thread.sleep(300);
							System.out.println();
							System.out.println("Press 2 . for Update Profile ");
							Thread.sleep(300);
							System.out.println();
							System.out.println("Press 3 . Change PassWord");
							Thread.sleep(300);
							System.out.println("");
							System.out.println("Press 4 . Apply For Leaves"  + ANSI_RESET);
							Thread.sleep(300);
							System.out.println();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				do {
						try {
							System.out.println(ColorsFile.CYAN_BOLD + "Press 5 . Home  Page");
							Thread.sleep(300);
							System.out.println();
							System.out.println("Press 6 . Exit"  + ANSI_RESET);
							Thread.sleep(300);
							System.out.println();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				
				
				int choice=sc.nextInt();
				
				
//-----------------------------choice for employee------------------------------------------------------
				switch (choice) {
					case 1: {
						System.out.println();
						GetEmpByID.main(emp.getEmplId());
					break;
					}
					case 2: {
					    System.out.println();
						UpdateEmpProfile.main(emp.getEmplId());
						break;
						}
					case 3: {
						System.out.println();
						ChangePassword.main(emp.getEmplId());
						break;
						
					}
					case 5: {
						System.out.println();
						System.out.println("   Application  Closed");
						System.out.println("     Home  Page");
						System.out.println("-------------------------");
						Main.main(null);
						ordering=false;
						break;
					}
					case 6: {
						System.out.println();
						System.out.println("   Application  Closed");
						System.out.println("     Exit  to  Employee  Panel");
						System.out.println();
						System.out.println(ColorsFile.RED_ITALIC + "     HAVE  A  NICE  DAY"  + ANSI_RESET);
						System.out.println("-------------------------");
						EmployeeLink.linkingEmployeeMethod(null);
						ordering=false;
						break;
					}
					
					default:
						throw new IllegalArgumentException("Unexpected value: " + choice);
				}
				}while(ordering);

	}
}
