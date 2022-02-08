package com.phase1java;

public class EmpInfo {
	int empId;
	String empName;
	String department;
	float salary;

	//default constructor
	public EmpInfo()
	{
		empId=1;
		empName="Emp0001";
		department="finance";
		salary=35000;
	}
	//parameterized constructor
	public EmpInfo(String empName,String department,float salary)
	{
		this.empName=empName;
		this.department=department;
		this.salary=salary;
	}
	//parameterized constructor
	public EmpInfo(int empId,String empName,String department,float salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.department=department;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Id: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Department "+department);
		System.out.println("Salary "+salary);
	}
	public static void main(String[] args) {
		EmpInfo e=new EmpInfo();
		EmpInfo e1= new EmpInfo(12, "Anusha", "I.T.", 450000);

		e.display();
		e1.display();
	}
}
