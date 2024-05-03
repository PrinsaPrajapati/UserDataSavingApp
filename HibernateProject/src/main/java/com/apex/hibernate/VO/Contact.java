package com.apex.hibernate.VO;

import jakarta.persistence.*;


@Entity
@Table(name="userContactDetail")
public class Contact  {
	
	@Id
	private String email;
	private String address;
	private String city;
	private String state;
	private String country;
	private String phoneNumber;
	//@Transient // it will not create gender column
	//private String gender;
	
	
	public Contact() {
		super();
		
	}
		
	public Contact(String email, String address, String city, String state, String country, String phoneNumber) {
		super();
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Contact [email=" + email + ", address=" + address + ", city=" + city + ", state=" + state + ", country="
				+ country + ", phoneNumber=" + phoneNumber + "]";
	}


}
