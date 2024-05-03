package com.apex.hibernate.Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.apex.hibernate.Util.HibernateUtil;
import com.apex.hibernate.VO.Contact;

public class ContactDao {

	
	public void addContact(Contact contact) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(contact);
		tx.commit();

	}

	public void updateContact(Contact contact) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.update(contact);
		tx.commit();
	}
	
	public void deleteContact(String email) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Contact contact=(Contact) session.load(Contact.class, new String(email));
		Transaction tx = session.beginTransaction();
		session.delete(contact);
		tx.commit();
	}
	public Contact getContact(String email) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Contact contact=(Contact) session.load(Contact.class, new String(email));
		return contact;
	}
}
