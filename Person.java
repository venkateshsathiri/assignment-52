package com.learning.lambda;

public class Person {

	private int id;
	private String LastName;
	private String FirstName;
	private String salary;
	
	public Person(int id, String LastName, String FirstName, String salary)
	{
		super();
		this.id = id;
		this.LastName = LastName ;
		this.FirstName = FirstName;
		this.salary = salary;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", LastName=" + LastName + ", FirstName=" + FirstName + ", salary=" + salary + "]";
	}
	

}
		