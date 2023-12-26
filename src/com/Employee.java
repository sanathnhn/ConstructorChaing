package com;

class Employee {
	
	Employee(int id,String name){
		this(3.5);
		System.out.println("id :"+id + "name"+name);	
	}
	
	Employee(int age){
		
	
		System.out.println("age:"+age);
		
	}
	Employee(double salary){
		this(22);
		System.out.println("Salary :"+salary );
		
	}
	public static void main(String[] args) {
		Employee e1 =new Employee(100,"Tom");
		
	}

}
