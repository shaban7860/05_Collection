package com.mindgate.repository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class EmployeeRepositoryMain {
	public static void main(String[] args) {
		EmployeeRepository empRepository = new EmployeeRepository();
		
		Employee emp1= new Employee(1001,"AAAA",786);
		Employee emp2= new Employee(1002,"BBBB",499);
		Employee emp3= new Employee(1003,"CCCC",666);
		
		empRepository.addEmployee(emp1);
		empRepository.addEmployee(emp2);
		empRepository.addEmployee(emp3);
		
//		List<Employee> eList = empRepository.getAllEmployee();
//		
//		for(Employee e : eList) {
//			System.out.println(e);
//		}
//		
//		System.out.println();
//		Employee employee = empRepository.getEmployeeByEmployeeId(1002);
//		System.out.println(employee);
		
//		System.out.println();
//		System.out.println("before deleting....");
//		List<Employee> eList2 = empRepository.getAllEmployee();
//		for(Employee e : eList2) {
//			System.out.println(e);
//		}
//		
//		System.out.println();
//		boolean result = empRepository.deleteEmployeeByEmployeeId(1003);
//		System.out.println("after deleting....");
//		 eList2 = empRepository.getAllEmployee();
//		for(Employee e : eList2) {
//			System.out.println(e);
//		}
		
		System.out.println();
		System.out.println("before updating....");
		List<Employee> eList3 = empRepository.getAllEmployee();
		for(Employee e : eList3) {
			System.out.println(e);
		}
		
		System.out.println();
		boolean result1 = empRepository.updateEmployee(new Employee(1002,"XXXX",399));
		System.out.println("after updating....");
		 eList3 = empRepository.getAllEmployee();
		for(Employee e : eList3) {
			System.out.println(e);
		}			
	}	
}
