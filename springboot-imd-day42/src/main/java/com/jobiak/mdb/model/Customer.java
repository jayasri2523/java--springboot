package com.jobiak.mdb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Customer {
	
	@Id  //primarykey
	private Long acctno;
	private String name;
	private double balance;
	
	public Long getAcctno() {
		return acctno;
	}
	public void setAcctno(Long acctno) {
		this.acctno = acctno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Customer [acctno=" + acctno + ", name=" + name + ", balance=" + balance + "]";
	}
	

	
}
