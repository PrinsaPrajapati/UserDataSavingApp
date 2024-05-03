package com.apex.hibernate.client;

import com.apex.hibernate.Dao.*;
import com.apex.hibernate.VO.*;


public class UserClient {

	public static void main(String[] args) {
		
	User user =new User();
	user.setEmail("User7@gmail.com");
	user.setFirstName("User7");
	user.setLastName("User7");
    user.setMiddleName("User7");
    
    Contact contact = new Contact();
    contact.setEmail("User7@gmail.com");
    contact.setAddress("User7");
    contact.setCity("sanjose");
    contact.setState("ca");
    contact.setCountry("Usa");
    contact.setPhoneNumber("777777777");
    
    Bank bank = new  Bank();
    bank.setEmail("User7@gmail.com");
    bank.setAccountNumber("777777777");
    bank.setBankName("Chase");
    bank.setSsn("777777777");
    
    UserDaoImpl userDao = new UserDaoImpl();
    userDao.addUser(user);
    userDao.addContact(contact);
    userDao.addBank(bank);
	
	}

}
