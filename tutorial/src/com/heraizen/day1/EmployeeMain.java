package com.heraizen.day1;

public class EmployeeMain {

	public static void main(String[] args) {
		
		EmployeeDetail emp1 = new EmployeeDetail(10, "Shadab Alam");
		EmployeeDetail emp2 = new EmployeeDetail(11, "Rajnish",50000.25f);
        
		emp1.display();
		emp2.display();
	}

}
