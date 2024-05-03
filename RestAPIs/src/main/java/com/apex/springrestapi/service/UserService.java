package com.apex.springrestapi.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apex.hibernate.Dao.UserDaoInter;
import com.apex.springrestapi.entity.User;

@Service
public class UserService {

	@Autowired
	UserDaoInter userDao;
	
	public User addUser(User user) {
		System.out.println("In Add User method:Start");
		com.apex.hibernate.VO.User userEn= convertUserToUserEn(user);
		this.userDao.addUser(userEn);	
		return user;	
	}

	private com.apex.hibernate.VO.User convertUserToUserEn(User user) {
		com.apex.hibernate.VO.User useren= new com.apex.hibernate.VO.User();
		useren.setEmail(user.getEmail());
		useren.setFirstName(user.getFirstName());
		useren.setLastName(user.getLastName());
        useren.setMiddleName(user.getMiddleName());
		return useren;
	}

	
	private User convertUserEnToUser(com.apex.hibernate.VO.User userEn) {
		User user= new User();
		user.setEmail(userEn.getEmail());
		user.setFirstName(userEn.getFirstName());
		user.setLastName(userEn.getLastName());
		user.setMiddleName(userEn.getMiddleName());
		return user;
	}
	
	//public List<User> getUsers() {
	public List<User> getUsers() {
		System.out.println("In getUsers method:Start");
		User user = null;
		//List<com.apex.hibernate.VO.User> userEn = new ArrayList<com.apex.hibernate.VO.User>();
		List<com.apex.hibernate.VO.User> listOfUser = this.userDao.listAllUsers();
		user = convertUserEnToUser((com.apex.hibernate.VO.User) listOfUser);
		System.out.println("In getUsers method:end");
		return (List<User>) user;

	}
	
	//private User convertUserEnListToUserList(com.apex.hibernate.VO.User userEn) {}

	public User getUser(String email) {
		User user=null;
		com.apex.hibernate.VO.User userEn=  new com.apex.hibernate.VO.User();
		userEn = this.userDao.getUser(email);
		user= convertUserEnToUser(userEn);
		return user;
	}

	public void deleteUser(String email) {
		
		this.userDao.deleteUser(email);
	}

	public User updateUser(User user) {
		com.apex.hibernate.VO.User userEn= convertUserToUserEn(user);
		userEn= this.userDao.updateUser(userEn);
		User updateduser=convertUserEnToUser(userEn);
		return updateduser;
	}

}
