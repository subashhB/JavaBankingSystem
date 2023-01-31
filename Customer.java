package com.nist.csitnistbanking;

public class Customer {
	private String name, address, gender;
	private int age;
	private long contactNumber, accountNumber;
	private double  amount=0.0;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	
	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public void deposite(double amount) {
		this.amount =this.amount + amount;
	}
	public void withdraw(double amount) {
		this.amount =this.amount - amount;
	}
	
	
	public Customer() {
		
	}
	
	public Customer(String name, String address, String gender, int age, long contactNumber, long accountNumber) {
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.age = age;
		this.contactNumber = contactNumber;
		this.accountNumber = accountNumber;
	}
}
