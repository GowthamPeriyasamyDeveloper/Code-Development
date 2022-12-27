package com.test.code;

public class Employee implements Cloneable{

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", company=" + company + ", address=" + address
				+ "]";
	}


	private Integer empId;
	private String empName;
	private String company;
	private Address address;
	
	
	public Employee(Integer empId, String empName, String company, Address address) {
		this.empId = empId;
		this.empName = empName;
		this.company = company;
		this.address = address;
	}

	public Integer getEmpId() {
		return empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public String getCompany() {
		return company;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee emp =  (Employee) super.clone();
		emp.setAddress(  (Address) address.clone()  );
		return emp;
	}
	
	
	
}
