package com.mindgate.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import com.mindgate.pojo.Employee;

public class CollectionsMain {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		System.out.println(nameList.size());
		nameList.add("Ramesh");
		nameList.add("Suresh");
		nameList.add("Rakesh");	
		nameList.add("Vinesh");
		nameList.add("Nitesh");
		nameList.add("Nilesh");
		System.out.println(nameList);
		System.out.println(nameList.size());
		nameList.remove(2);
		System.out.println("After remove");
		System.out.println(nameList);
		System.out.println(nameList.size());
		
		System.out.println();
		List<Employee> employeeList = new ArrayList<>();
		
		Employee employee1 = new Employee(101,"Ramesh",800);
		Employee employee2 = new Employee(102,"Suresh",600);
		Employee employee3 = new Employee(103,"Nitesh",700);
		
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		
		for(Employee e : employeeList) {
			System.out.println(e);
		}
		
		System.out.println();
		System.out.println(employeeList);
		
		System.out.println();
		Set<String> nameSet = new HashSet<>();
		nameSet.add("Abdul");
		nameSet.add("Shaikh");
		nameSet.add("Khan");
		nameSet.add("Shaikh");
		nameSet.add("Ansari");
		nameSet.add("Shaikh");
		nameSet.add("Khan");
		
		System.out.println(nameSet);
		
		nameSet.add(null);
		nameSet.add(null);
		System.out.println(nameSet);
		
		System.out.println();
		SortedSet<String> sortedNameSet = new TreeSet<>();
		sortedNameSet.add("Abdul");
		sortedNameSet.add("Shaikh");
		sortedNameSet.add("Khan");
		sortedNameSet.add("Shaikh");
		sortedNameSet.add("Ansari");
		sortedNameSet.add("Shaikh");
		sortedNameSet.add("Khan");
		
		System.out.println(sortedNameSet);
		
//		sortedNameSet.add(null);
//		System.out.println(sortedNameSet);
		
		System.out.println();
		HashMap<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(101, "Ramesh");
		employeeMap.put(102, "Rakesh");
		employeeMap.put(103, "Prathamesh");
		employeeMap.put(104, "Siddhesh");
		
		System.out.println(employeeMap);
		
		Integer i = 50;
		System.out.println(i.hashCode());
		
		System.out.println();
		SortedMap<Integer,String> employeeSortedMap = new TreeMap<>();
		employeeSortedMap.put(11, "Test 11");
		employeeSortedMap.put(9, "Test 9");
		employeeSortedMap.put(56, "Test 56");
		employeeSortedMap.put(6, "Test 6");
		
		System.out.println(employeeSortedMap);
	}

}
