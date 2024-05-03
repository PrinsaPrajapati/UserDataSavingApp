package com.apex.hibernate.VO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "userBankDetail")
public class Bank {

	@Id
	private String email;
	private String bankName;
	private String accountNumber;
	private String ssn;

	public Bank() {
		super();

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", accountNumber=" + accountNumber + ", ssn=" + ssn + "]";
	}

	public Bank(String bankName, String accountNumber, String ssn) {
		super();
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.ssn = ssn;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}



}
