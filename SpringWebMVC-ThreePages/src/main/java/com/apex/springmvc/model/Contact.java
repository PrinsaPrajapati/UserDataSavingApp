package com.apex.springmvc.model;

import org.springframework.stereotype.Component;

@Component("contact")
public class Contact {

	private String emailId;
	private String address;
	private String city;
	private String state;
	private String country;
	private String phoneNumber;
	
	
	public Contact() {
		super();
		
	}

	public Contact(String emailId, String address, String city, String state, String country, String phoneNumber) {
		super();
		this.emailId = emailId;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.phoneNumber = phoneNumber;
	}

	public String getEmailid() {
		return emailId;
	}
	public void setEmailid(String email) {
		this.emailId = email;
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
		return "Contact [emailId=" + emailId + ", address=" + address + ", city=" + city + ", state=" + state + ", country="
				+ country + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
