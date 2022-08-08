/*
	Program to create customer bank account and get customer details
	by Ketan Kumar
*/

package com.bankServices;

//Importing scanner class to get user input
import java.util.Scanner;

//Importing customer class from bankServices package
import com.bankServices.*;

public class bankAccount{
	
public static void main(String args[]){
	
	//creating scanner object named scan
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Account Holder name : ");
	String userName = scan.next();
	System.out.println("Enter Account Number :");
	int accountNum = scan.nextInt();
	System.out.println("Enter Account Balance : ");
	int balance = scan.nextInt();
	int amount;
	System.out.println("Select an option: ");
	System.out.println("To Deposit Amount, Enter  : add\nTo Withdraw Amount, Enter : get");
	String choice = scan.next();
	
	//creating an object named user of class customer from bankServices package
	customer user = new customer();
	//callng createAccount method of customer class using user object from bankServices package
	user.createAccount(userName,accountNum,balance);
	
	//Using switch case to perform user selected operation
	switch (choice){
		case "add":
		case "Add":
		case "ADD":
			user.checkAmount();//calling checkAmount method
			System.out.println("Enter Amount to Deposit :");
			amount = scan.nextInt();
			user.depositAmount(amount); //calling depositAmount method from bankServices package
			break;
			
		case "get":
		case "Get":
		case "GET":
			user.checkAmount();//calling checkAmount method
			System.out.println("Enter Amount to Withdraw :");
			amount = scan.nextInt();
			user.withdrawAmount(amount); //calling withdrawAmount method from bankServices package
			break;
			
		default :
			System.out.println("Invalid Selection");
	}		
	
	//callng getDetail method of customer class from bankServices package using user object
	user.getDetail();
	scan.close();
}
}