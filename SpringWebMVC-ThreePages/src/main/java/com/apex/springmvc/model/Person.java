package com.apex.springmvc.model;

import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	
		public String firstName;
		public String lastName;
		public String middleName;
		public String email;

		
       public Person(String firstName, String lastName, String middleName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.middleName = middleName;
		}

		@Override
		public String toString() {
			return "Person [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName
					+ ", email=" + email + "]";
		}

		public Person() {

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

		public  String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
}
