/**
 * 
 */
package com.vks.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikash
 *
 */
public class Employee {
	
	private Integer empId;
	private String name;
	private String gender;
	private Integer salary;
	private Integer age;
	private String dept;
	private String address;
	public Employee() {}
	public Employee(Integer empId, String name, String gender, Integer salary, Integer age, String dept, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.age = age;
		this.dept = dept;
		this.address = address;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", gender=" + gender  + ", salary=" + salary + ", age=" + age + ", dept=" + dept
				+ ", address=" + address + "]";
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public static List<Employee> getEmployeeList(){
		List<Employee>  emplist = new ArrayList<>();
		Employee e1 = new Employee( 1,  "vikash","M",  5000,  42,  "PFLl",  "Bangalore");
		Employee e2 = new Employee( 2,  "kailash","M" , 4000,  38,  "AUTH",  "Noida");
		Employee e3 = new Employee( 3,  "Subhash", "M" , 3000,  32,  "BUSI",  "Jainamore");
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
