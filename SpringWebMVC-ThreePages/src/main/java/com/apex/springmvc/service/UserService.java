package com.apex.springmvc.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.apex.springmvc.model.Bank;
import com.apex.springmvc.model.Contact;
import com.apex.springmvc.model.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@Service
public class UserService implements UserServiceInterface {

	@Override
	public Person addUser(Person person) {

		System.out.println("==== Web Project Userservice addUser():Start====");
		Person createUser = (Person) userRestApi("http://localhost:8080/DemoRestApi2/adduser", person);
		System.out.println("==== Web Project Userservice addUser():End ====");
		return createUser;

	}


	@Override
	public void addContact(Contact contact,Person person) {
		System.out.println("==== Web Project Userservice:addContact():Start====");
		contact = (Contact) userRestApi("http://localhost:8080/DemoRestApi2/users/"+person.getEmail()+"/addcontact",contact);
		System.out.println("contactDetails End : adding email :" +contact.getEmailid());
		//return contactDetails;

	}

	@Override
	public void addBank(Bank bank,Person person) {
		System.out.println("==== Web Project Userservice:addContact():Start====");
		 bank = (Bank) userRestApi("http://localhost:8080/DemoRestApi2/users/"+person.getEmail()+"/addbank", bank);
		System.out.println("==== bank details End : adding email :" +bank.getEmailid());
		//return bank;

	}

	public Object userRestApi(String uri, Object obj) {

		RestTemplate restTemplate = new RestTemplate();
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = null;
		try {
			json = ow.writeValueAsString(obj);
			System.out.println("====In UserWebPrject userRestApi() : start==== ");
			System.out.println(json);
		} catch (JsonProcessingException je) {
			je.printStackTrace();
		}

		org.springframework.http.HttpHeaders httpHeaders = new org.springframework.http.HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> req = new HttpEntity<String>(json, httpHeaders);

		obj = restTemplate.postForObject(uri, req, obj.getClass());
		System.out.println("====In UserWebPrject userRestApi() : End ====");
		return obj;

	}

}
