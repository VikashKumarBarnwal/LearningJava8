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
		
		List<Employee> employeelist=  getEmployeeList();
		
		printList(employeelist);
		
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
			printList(employeeOddlist);
		// Q Find the sum of salary of odd emp id 
			Integer sumSalary = employeelist.stream().filter(emp -> emp.getEmpId() % 2 != 0).collect( Collectors.summingInt(Employee:: getSalary ));
			System.out.println("Sum of salary of Odd Employee = "+ sumSalary);
	}
	
	
	public static List<Employee> getEmployeeList(){
		List<Employee>  emplist = new ArrayList<>();
		Employee e1 = new Employee( 1,  "vikash","M",  5000,  42,  "PFLl",  "Bangalore");
		Employee e2 = new Employee( 2,  "kailash","M" , 4000,  38,  "AUTH",  "Noida");
		Employee e3 = new Employee( 3,  "Prakash", "M" , 3000,  32,  "BUSI",  "Jainamore");
		Employee e4 = new Employee( 4,  "Subhash", "M" , 6000,  33,  "PISP",  "Pune");
		Employee e5 = new Employee( 5,  "Meera", "F" , 8000,  45,  "PISP",  "Delhi");
		
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		emplist.add(e5);
		return emplist;
		
	}

	public static void printList(List<Employee> employeelist) {
		employeelist.stream().forEach(System.out::println);
	}
}
