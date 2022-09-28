package com.qa.javafundamentals.oop;

public class Employee {

	//State ( data )
	 	int id;
	 	String name;
	 	String department;
	 	double salary;
	 	byte age;
	 	char gender;
	//Each employee object will have its own state
	
	 	//No-arg constructor
	 	/*
	 	 * Employee(){ System.out.println("Employee() constructor is called.."); id =
	 	 * 111; name = "emp1"; department = "development"; salary = 456456.45; age = 25;
	 	 * gender = 'M';
	 	 * 
	 	 * }
	 	 */
	 	
	 		/*
	 		 * this.name = name;
	 		this.department = department;
	 		this.salary = salary;
	 		this.age = age;
	 		this.gender = gender;
	 		 */
	 		
			
	



	public Employee(int id, String name, String department, double salary, byte age, char gender) {
		super();
		System.out.println("Employee(arg) constructor is called...");
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.age = age;
		this.gender = gender;
		
		}
	}
