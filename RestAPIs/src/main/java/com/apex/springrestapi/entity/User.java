package com.apex.springrestapi.entity;

public class User {
	public String firstName;
	public String lastName;
	public String middleName;
	public String email;
	
	
	public User(String firstName, String lastName, String middleName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.email = email;
	}
	
	public User() {
		super();
		
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName + ", email="
				+ email + "]";
	}
	
	

}
