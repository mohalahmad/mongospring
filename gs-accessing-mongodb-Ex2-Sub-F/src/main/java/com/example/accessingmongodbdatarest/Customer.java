package com.example.accessingmongodbdatarest;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
	
	@Id
	private String id;
	
	private String msisdn;
	private String name;
	private double balance;
	
	
	public Customer() {
	}
	
	public Customer (String msisdn ,String name , double balance) {
		this.msisdn = msisdn;
		this.name = name;
		this.balance = balance;
	}
	
	public Customer (String name , double balance) {
		this.name = name;
		this.balance = balance;
	}
	public Customer (double balance) {
		this.balance = balance;
	}
	public Customer (String name) {
		this.name = name;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
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
	
	@Override
    public String toString() {
        return "Data{" +
                "id='" + id + '\'' +
                ", msisdn='" + msisdn+ '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
