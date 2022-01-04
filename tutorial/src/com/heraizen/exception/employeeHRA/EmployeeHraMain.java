package com.heraizen.exception.employeeHRA;

import java.util.Scanner;

public class EmployeeHraMain {

	public static void main(String[] args) {
		final double MANAGER_HRA = 10;
		final double OFFICER_HRA = 12;
		final double CLERK_HRA = 5;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Employee ID: ");
		int empId = scan.nextInt();
		System.out.println("Enter the Employee Name: ");
		String empName = scan.next();
		System.out.println("Enter the Employee's Designation: ");
		String designation = scan.next();
		System.out.println("Enter the basic: ");
		double basic = scan.nextDouble();
		try {
			if(basic<500)
			{
				throw new LowSalException("Basic is less than 500");
			}
			else 
			{
				System.out.println();

				if (designation.equalsIgnoreCase("manager")) {
					EmployeeHRA obj = new EmployeeHRA(empId, empName, designation, basic, MANAGER_HRA);
					obj.printDET();
					obj.calculateHRA();
				} else if (designation.equalsIgnoreCase("officer")) {
					EmployeeHRA obj = new EmployeeHRA(empId, empName, designation, basic, OFFICER_HRA);
					obj.printDET();
					obj.calculateHRA();
				} else if (designation.equalsIgnoreCase("clerk")) {
					EmployeeHRA obj = new EmployeeHRA(empId, empName, designation, basic, CLERK_HRA);
					obj.printDET();
					obj.calculateHRA();
				}
			}
		}
		catch(LowSalException exe){
			System.out.println(exe.getMessage());
		}
		finally {
			scan.close();
		}
		


	}

}
