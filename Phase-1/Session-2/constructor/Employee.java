package com.allstate.constructor;

public class Employee {

	private int empId;
	private String empName;
	private String email;
	public Employee() {}
	public Employee(int empId, String empName, String email) {
		this.empId = empId;
		this.empName = empName;
		this.email = email;
	}
	public void displayData() {
		System.out.println("----------------------------------------------");
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Email: " + email);
	}
	public static void main(String[] args) {
		Employee emp1= new Employee(1, "sonam", "sonam@gmail.com");//passing values in constructor
		Employee emp2= new Employee(2, "Alex", "alex@gmail.com");
		emp1.displayData();emp2.displayData();
		Employee emp3= new Employee();//call default constructor
		emp3.displayData();
	}
}
