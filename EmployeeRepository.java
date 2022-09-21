package com.mindgate.repository;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.Employee;

public class EmployeeRepository {
	private List<Employee> empList = new ArrayList<>();
	
	public boolean addEmployee(Employee employee) {
		
		return empList.add(employee);
	}
	
	public List<Employee> getAllEmployee(){
		return empList;
	}
	
	public Employee getEmployeeByEmployeeId(int empId) {
		for(Employee e : empList) {
			if(e.getEmployeeId() == empId) {
				return e;
			}
		}
		return null;
	}
	
	public boolean deleteEmployeeByEmployeeId(int empId) {
		for(Employee e : empList) {
			if(e.getEmployeeId() == empId) {
				//boolean result = empList.remove(e);
				return empList.remove(e);
			}
		}
		return false;
	}
	
	public boolean updateEmployee(Employee employee) {
		for(Employee emp : empList) {
			if(emp.getEmployeeId() == employee.getEmployeeId()) {
				emp.setName(employee.getName());
				emp.setSalary(employee.getSalary());
				return true;
			}
		}
		return false;
	}
}
