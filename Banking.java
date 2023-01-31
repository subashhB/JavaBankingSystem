package com.nist.csitnistbanking;

import java.util.ArrayList;
import java.util.Scanner;

public class Banking {
	ArrayList<Customer> customerList = new ArrayList<>();
	Scanner scannerInt = new Scanner(System.in);
	Scanner scannerString = new Scanner(System.in);
	Scanner scannerLong = new Scanner(System.in);
	Scanner scannerDouble = new Scanner(System.in);
	static long accountNumber = 100;
	public int menu() {
		System.out.println("*****Welcome to Nepal Bank*****");
		System.out.println("1. Create account");
		System.out.println("2. View user information");
		System.out.println("3. Deposite");
		System.out.println("4. Withdraw");
			int choice = scannerInt.nextInt();
			return choice;
	}
	
	public void startProgram() {
		int choice = menu();
		switch(choice) {
		case 1:
			customerList.add(createAccount());
			break;
		case 2:
			getInformation();
			break;
		case 3:
			deposit();
			break;
		case 4:
			withdraw();
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		startProgram();
	}
	
	public Customer createAccount() {
		System.out.println("Enter your name: ");
		String name = scannerString.nextLine();
		
		System.out.println("Enter your address: ");
		String address = scannerString.nextLine();
		
		System.out.println("Enter your gender: ");
		String gender = scannerString.nextLine();
		
		System.out.println("Enter your age: ");
		int age = scannerInt.nextInt();
		
		System.out.println("Enter your Contact No.: ");
		long contactNumber = scannerLong.nextLong();
		
		long accNumber = accountNumber++;
		System.out.println("Account Created Successfully!");
		System.out.println("Your account number is "+accNumber);
		System.out.println();
		Customer customer = new Customer(name, address, gender, age, contactNumber, accNumber);
		return customer;
	}
	public void getInformation() {
		System.out.println("Enter the account number: ");
		long accountNumber = scannerLong.nextLong();
		System.out.println("User Information!");
		for(Customer c: customerList) {
			if(c.getAccountNumber() == accountNumber) {
				System.out.println("Name is " + c.getName());
				System.out.println("Address is " + c.getAddress());
				System.out.println("Gender is " + c.getGender());
				System.out.println("Age is " + c.getAge());
				System.out.println("Contact is " + c.getContactNumber());
				System.out.println("Amount is " + c.getAmount());
			}
			else
			{
				System.out.println("User not found");
			}
		}
	}
	public void deposit(){
		System.out.println("Enter the account number: ");
		long accountNumber = scannerLong.nextLong();

		for(Customer c: customerList) {
			if(c.getAccountNumber() == accountNumber) {
				System.out.println("Enter the amount you want to deposit: ");
				double amount = scannerDouble.nextLong();
				c.deposite(amount);
				System.out.println(amount +" has been added to your account.");
			}
			else {
				System.out.println("User not found");	
			}
		}
	}
	public void withdraw() {
		System.out.println("Enter the account number: ");
		long accountNumber = scannerLong.nextLong();
		for(Customer c: customerList) {
			if(c.getAccountNumber() == accountNumber) {
				if(c.getAmount() == 0.0) {
					System.out.println("Your bank amount is Nill");
				}
				else { 
					System.out.println("Enter the amount you want to withdraw: ");
					double amount = scannerDouble.nextLong();
					if(c.getAmount() < amount) {
						System.out.println("Insufficient Amount");	
					}
					else {
						c.withdraw(amount);
						System.out.println(amount+ "has been deducted from your account.");
					}
				}
			}
			else {
				System.out.println("User not found");	
			}
		}
		
	}
	public static void main(String[] args) {
		Banking obj = new Banking();
		obj.startProgram();
	}
}
