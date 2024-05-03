package com.apex.springmvc.model;

import org.springframework.stereotype.Component;

@Component("bank")
public class Bank {

	private String emailId;
	private String bankName;
	private String accountNumber;
	private String ssn;
	
	public Bank() {
		super();
		
	}

	public Bank(String emailid, String bankName, String accountNumber, String ssn) {
		super();
		this.emailId = emailid;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.ssn = ssn;
	}

	public String getEmailid() {
		return emailId;
	}

	public void setEmailid(String emailid) {
		this.emailId = emailid;
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

	@Override
	public String toString() {
		return "Bank [emailid=" + emailId + ", bankName=" + bankName + ", accountNumber=" + accountNumber + ", ssn="
				+ ssn + "]";
	}


}
