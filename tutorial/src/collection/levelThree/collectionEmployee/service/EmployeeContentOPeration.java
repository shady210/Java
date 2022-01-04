package collection.levelThree.collectionEmployee.service;

import collection.levelThree.collectionEmployee.empopt.domain.Employee;

public interface EmployeeContentOPeration {

	void  addEmployee(Employee emp);
	
	void deleteEmployee(int empno);
	
	void viewEmployee(int empno);
	
	void viewEmployees();
}