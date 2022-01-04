package com.heraizen.day1;

public class StudentDetailsMain {

	public static void main(String[] args) {
		Student student1 = new Student(1001,"Shadab","AFS, Bhuj, Gujarat");
		Student student2 = new Student(1002,"Mondal","telhai, bandamunda, Kolkata");
		Student student3 = new Student(1003,"Rajnish","Glasgow,Scotland,UK ");
		Student student4 = new Student(1004,"Abhi","Ram chowk,Kanpur,UP");
		Student student5 = new Student(1005,"Sushmita","ADFS, Tezpur, Assam");
		
		student1.display();
		student2.display();
		student3.display();
		student4.display();
		student5.display();
		
		System.out.println("Total Number of Object Created = " +Student.count );

	}

}
