package com.apex.hibernate.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.apex.hibernate.Util.HibernateUtil;
import com.apex.hibernate.VO.Bank;
import com.apex.hibernate.VO.Contact;
import com.apex.hibernate.VO.User;

@Repository
public class UserDaoImpl implements UserDaoInter {

	@Override
	public void addUser(User user) {
		System.out.println("==== Inside UserDao Hibernate start: addUser()====");
		System.out.println(user);
		Session session = null;
		Transaction tx = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
			session.persist(user);
			tx.commit();
			System.out.println("==== Inside UserDao Hibernate End: addUser()====");
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
	@Override
	public void addContact(Contact contact) {
		System.out.println("==== Inside UserDao Hibernate start: addContact()====");
		System.out.println(contact);
		Session session = null;
		Transaction tx = null;
		try {
		 session = HibernateUtil.getSessionFactory().openSession();
		 tx = session.beginTransaction();
		session.persist(contact);
		tx.commit();
		System.out.println("==== Inside UserDao Hibernate End: addContact()====");
		}
		 catch (Exception e) {
				if (tx != null)
					tx.rollback();
			} finally {
				if (session != null) {
					session.close();
				}
			}

	}

	@Override
	// @Transactional
	public User updateUser(User user) {
		Session session = null;
		Transaction tx = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
			session.saveOrUpdate(user);
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return user;
	}

	@Override
	public void deleteUser(String email) {
		Session session = null;
		Transaction tx = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			User user = (User) session.load(User.class, new String(email));
			tx = session.beginTransaction();
			session.delete(user);
			System.out.println(user + " This User Deleted.");
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	

	@Override
	public void addBank(Bank bank) {
		System.out.println("==== Inside UserDao Hibernate start: addBank()====");
		System.out.println(bank);
		Session session = null;
		Transaction tx = null;
		try {
		 session = HibernateUtil.getSessionFactory().openSession();
		 tx = session.beginTransaction();
		session.persist(bank);
		tx.commit();
		System.out.println("==== Inside UserDao Hibernate End: addBank()====");
		}
		 catch (Exception e) {
				if (tx != null)
					tx.rollback();
			} finally {
				if (session != null) {
					session.close();
				}
			}

	}

	@Override
	public List<User> listAllUsers() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		// Transaction tx = session.beginTransaction();
		List<User> userList = session.createQuery("from User", User.class).list();
		for (User u : userList) {
			System.out.println("Person List::" + u);
		}
		return userList;
	}

	@Override
	public User getUser(String email) {
		Session session = null;
		Transaction tx = null;
		User user= null;
		try {
		System.out.println("in Dao get user (): start");
		 session = HibernateUtil.getSessionFactory().openSession();
		 tx = session.beginTransaction();
		 user = (User) session.get(User.class, email);
		System.out.println(user.getEmail());
		System.out.println(user.getFirstName());
		System.out.println("in Dao get user (): End");
		tx.commit();
		}catch (Exception e) {
			if (tx != null)
				tx.rollback();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
	   return user;
	}
}
