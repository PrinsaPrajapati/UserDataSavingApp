package com.apex.springmvc.service;

import com.apex.springmvc.model.*;

public interface UserServiceInterface {

	public Person addUser(Person person);

	public void addContact(Contact contact,Person person) throws Exception;

	public void addBank(Bank bank,Person person) throws Exception;

	/*
	 * public void updateUser(Person person);
	 * 
	 * public Person getUser(int id);
	 * 
	 * public void deleteUser(int id);
	 */

}
