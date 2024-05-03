package com.apex.springmvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.apex.springmvc.model.*;
import com.apex.springmvc.service.UserServiceInterface;

@Controller
@SessionAttributes({ "person", "contact", "bank" })
public class UserController {

	@Autowired
	UserServiceInterface userservice = null;

	@ModelAttribute
	public Person person() {
		return new Person();
	}

	@ModelAttribute
	public Bank bank() {
		return new Bank();
	}

	@ModelAttribute
	public Contact contact() {
		return new Contact();
	}

	@RequestMapping("/entryadduser")
	public String entryAddUser(@ModelAttribute Person person) {
		return "PersonInfo";
	}

	@RequestMapping("/adduser") // @ModelAttribute Contact contact
	public String addUser(@ModelAttribute Person person,HttpSession httpSession) {

		System.out.println("== web UserController:addUser():Start ==");
		person = userservice.addUser(person);
		httpSession.setAttribute("personInfo", person);
		System.out.println("== web UserController:addUser():End ==");

		return "ContactInfo";

	}

	@RequestMapping("/contactInfo")
	public String addContact(@ModelAttribute("contact") Contact contact, @ModelAttribute Person person,HttpSession httpSession) {

		contact.setEmailid(person.getEmail());
		try {
			System.out.println("== web UserController:addContact():Start ==");
			userservice.addContact(contact,(Person)httpSession.getAttribute("personInfo"));
			System.out.println("== web UserController:addContact():End ==");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		 return "BankInfo";
		
	}

	@RequestMapping("/bankInfo")
	public String addBank(@ModelAttribute("bank") Bank bank, @ModelAttribute Person person,HttpSession httpSession) {

		bank.setEmailid(person.getEmail());
		try {
			System.out.println("== web UserController:addBank():Start ==");
			userservice.addBank(bank,(Person)httpSession.getAttribute("personInfo"));
			System.out.println("== web UserController:addBank():End ==");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Success";
	}

}
