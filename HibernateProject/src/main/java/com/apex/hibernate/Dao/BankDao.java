package com.apex.hibernate.Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.apex.hibernate.Util.HibernateUtil;
import com.apex.hibernate.VO.Bank;

public class BankDao {
	
	public void addBank(Bank bank) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(bank);
		tx.commit();

	}

	public void updateBank(Bank bank) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.update(bank);
		tx.commit();
	}
	
	public void deleteBank(String email) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Bank bank=(Bank) session.load(Bank.class, new String(email));
		Transaction tx = session.beginTransaction();
		session.delete(bank);
		tx.commit();
	}
	public Bank getBank(String email) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Bank bank=(Bank) session.load(Bank.class, new String(email));
		return bank;
	}
}
