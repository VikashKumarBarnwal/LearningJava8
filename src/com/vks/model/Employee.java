/**
 * 
 */
package com.vks.model;

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
		
}
