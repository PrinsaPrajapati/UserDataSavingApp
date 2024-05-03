package com.apex.hibernate.Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.apex.hibernate.Util.HibernateUtil;
import com.apex.hibernate.VO.User;

public class UserDao {

	public void addUser(User user) {
		Session session = null;
		Transaction tx = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
			session.save(user);
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
	}

	public void updateUser(User user) {
		Session session = null;
		Transaction tx = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
			session.update(user);
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
	}

	public void deleteUser(String email) {
		Session session = null;
		Transaction tx = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			User user = (User) session.load(User.class, new String(email));
			tx = session.beginTransaction();
			session.delete(user);
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
	}

	public User getUser(String email) {
		Session session = null;
		Transaction tx = null;
		User user= null;
		try {
		 session = HibernateUtil.getSessionFactory().openSession();
		 tx = session.beginTransaction();
		 user = (User) session.load(User.class, new String(email));
		 tx.commit();
		} catch (Exception e) {
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
