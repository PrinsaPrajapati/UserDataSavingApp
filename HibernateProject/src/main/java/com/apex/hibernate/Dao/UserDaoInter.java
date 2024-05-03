package com.apex.hibernate.Dao;

import java.util.List;

import com.apex.hibernate.VO.Bank;
import com.apex.hibernate.VO.Contact;
import com.apex.hibernate.VO.User;

public interface UserDaoInter {

	
	public void addUser(User user);
	public User updateUser(User user);
	public void deleteUser(String email);
	public User getUser(String email);
	public void addContact(Contact contact);
	public void addBank(Bank bank);
	public List<User> listAllUsers();
	
	
}
