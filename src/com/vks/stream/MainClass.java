/**
 * 
 */
package com.vks.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.vks.model.Employee;

/**
 * @author Vikash
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Employee> employeelist=  Employee.getEmployeeList();
		
		Employee.printList(employeelist);
		
		//Query 3.1 : How many male and female employees are there in the organization?
		Map<String, Long> noOfMaleAndFemaleEmployees= employeelist.stream().collect(Collectors.groupingBy(Employee::getGender , Collectors.counting()));
		System.out.println(noOfMaleAndFemaleEmployees);
		
		
		//Query 3.2 : Print the name of all departments in the organization?
		employeelist.stream().map(Employee::getDept).distinct().forEach(System.out::println);
		
		
		//Query 3.3 : What is the average age of male and female employees?
		Map<String, Double> avgAgeOfMaleAndFemaleEmployees=
				employeelist.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));    
				System.out.println(avgAgeOfMaleAndFemaleEmployees);
				
		// find list of employee who has oud
			List<Employee> employeeOddlist=employeelist.stream().filter(emp -> emp.getEmpId() % 2 != 0).collect(Collectors.toList());
			Employee.printList(employeeOddlist);
		// Q Find the sum of salary of odd emp id 
			Integer sumSalary = employeelist.stream().filter(emp -> emp.getEmpId() % 2 != 0).collect( Collectors.summingInt(Employee:: getSalary ));
			System.out.println("Sum of salary of Odd Employee = "+ sumSalary);
			
			// Q Create a map of emp id and its name 
			Map<Integer, String> empMap = employeelist.stream().collect(Collectors.toMap(Employee::getEmpId, Employee::getName));
			
			System.out.println("Employee Map " + empMap);
			
			// Short employee by name and then by age
			List<Employee> employeeShortedlist= employeelist.stream().sorted((emp1 , emp2) -> (emp1.getName().compareTo(emp2.getName())) != 0 ? (emp1.getName().compareTo(emp2.getName())) : (emp1.getAge() - emp2.getAge())).collect(Collectors.toList());
			Employee.printList(employeeShortedlist);
	
	}
	
}
