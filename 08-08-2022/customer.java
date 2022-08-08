/*
	Program to create an package of customer class with bankServices methods
	by Ketan Kumar
*/

//creating package
package com.bankServices;

class customer{
	//creating instance variable
	private String userName;
	private int accountNum,balance,amount;
	
	//creating method createAccount to store information of user
	public void createAccount(String name,int num,int bal){
		userName = name;
		accountNum = num;
		balance = bal;	
	}
	
	//creating withdrawAmount method to delete amount from balance
	public void withdrawAmount(int amount){
		if(amount>balance){
			System.out.println("-------------------------\nAccount Balance is not enough to Withdraw Amount.");
		}
		else{
			balance -= amount;
			System.out.println("-------------------------\n"+userName+" your current balance after withdrawing Rs."+amount+" is : "+balance);
		}
	}
	
	//creating depositAmount method to add amount
	public void depositAmount(int amount){
		if(amount > -1){
			balance += amount;
			System.out.println("-------------------------\n"+userName+" your current balance after depositing Rs."+amount+" is : "+balance);
		}
		else {
			System.out.println("-------------------------\nInvalid Amount.");
		}
	}
	
	//creating getAmount method to check balance
	public void checkAmount(){
		System.out.println("-------------------------\n"+userName+" your current balance is : "+balance);
	}
	
	//Creating method getDetail to display information of User
	public void getDetail(){
		System.out.println("-----Account Detail------");
		System.out.println("Account Holder  NAME : "+ userName );
		System.out.println("Account Number : "+accountNum);
		System.out.println("Account Balance: Rs."+balance+"/-");
	}
}