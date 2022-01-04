package com.heraizen.exception.employee;

import java.util.Scanner;

public class EmployeeManage {

	public static void main(String[] args) {
		Scanner readVal = new Scanner(System.in);
		Employee emp;
		
		System.out.printf("Enter Employee Name = >");
		String empName = readVal.nextLine();
		
		System.out.printf("Enter Employee Number = >");
		int empNumber = readVal.nextInt();
		
		System.out.printf("Enter Employee Experience = >");
		float exp = readVal.nextFloat();
		
		try {
			if(exp > 2.5 && exp < 3.5) {
				 emp = new Employee(empNumber,empName,exp);
				 System.out.println("\n"+ emp +" Employee details Created");
			}else {
				throw new IllegalArgumentException();
			}
		} finally {
			readVal.close();
		}
		
		

	}

}