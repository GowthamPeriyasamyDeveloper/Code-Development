package com.test.code;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address =  new Address(123456,"Tiruppur","Tamil Nadu");
		
		Employee emp = new Employee(1,"Gowtham","CTS",address);
		
		Employee emp1 = (Employee) emp.clone();
		
		
		//Shallow Cloning 
		
		emp1.getAddress().setCity("Chennai");
		
		System.out.println(emp);
		
		System.out.println(emp1);
		
		
		
		
	
		
		
		
		
	}
}
