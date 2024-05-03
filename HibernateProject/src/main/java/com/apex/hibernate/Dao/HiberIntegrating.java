package com.apex.hibernate.Dao;

import org.springframework.stereotype.Component;
import com.apex.hibernate.Dao.UserDaoImpl;
import com.apex.hibernate.VO.*;

@Component
public class HiberIntegrating 
{
   
    public void inserUser(String email,String firstname,String lastName,String middelName) {
    		
         User user =new User();
         user.setEmail(email);
         user.setFirstName(firstname);
         user.setLastName(lastName);
         user.setMiddleName(middelName);
         
         UserDaoImpl userDao = new UserDaoImpl();
         userDao.addUser(user);
    }
    
    public void inserContact(String email,String address,String city,String state,String country,String phoneNumber) {
    	
    	Contact contact = new Contact();
    	contact.setEmail(email);
    	contact.setAddress(address);
    	contact.setCity(city);
    	contact.setState(state);
    	contact.setCountry(phoneNumber);
    	contact.setPhoneNumber(phoneNumber);
    	UserDaoImpl userDao = new UserDaoImpl();
        userDao.addContact(contact);
    }
    
    public void insertBank(String email,String bankName,String accountNumber,String ssn) {
    	Bank bank= new Bank();
    	bank.setEmail(email);
    	bank.setBankName(bankName);
    	bank.setAccountNumber(accountNumber);
    	bank.setSsn(ssn);
    	UserDaoImpl userDao = new UserDaoImpl();
        userDao.addBank(bank);
    }
}

