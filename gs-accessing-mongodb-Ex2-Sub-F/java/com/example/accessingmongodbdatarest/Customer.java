package com.example.accessingmongodbdatarest;

import org.springframework.data.annotation.Id;

public class Customer {

	private String id;

	@Id
	private String msisdn;
	private String name;
	private double balance;

	public String getmsisdn() {
		return msisdn;
	}

	public void setmsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
	public double getbalance() {
		return balance;
	}

	public void setbalance(double balance) {
		this.balance = balance;
	}
}
