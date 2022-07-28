/*
Program too create Movie Theater Management to store and display movie details.
*/

// importing scanner utility to get input from user
import java.util.Scanner;

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
	System.out.println("Enter Deposit or Withdraw ");
	String action = scan.next();
	
	//creating an object named user of class customer
	customer user = new customer();
	//callng setDetail method of movie class using show object
	user.createAccount(userName,accountNum,balance);
	
	if (action == "Deposit"||"deposit"){
		System.out.println("Enter Amount :");
		int amount = scan.nextInt();
		//callng setDetail method of movie class using show object
		user.depositAmount(amount);
	}
	if (action == "withdraw"||"Withdraw"){
		System.out.println("Enter Amount :");
		int amount = scan.nextInt();

		//callng setDetail method of movie class using show object
		user.withdrawAmount(amount);
		
	}
	
	
	//callng getDetail method of movie class using show object
	user.getDetail();
	scan.close();
}
}

class customer{
	//creating instance variable
	private String userName;
	private int accountNum,balance,amount;
	
	//creating method setDetail to store information of movie
	public void createAccount(String name,int num,int bal){
		userName = name;
		accountNum = num;
		balance = bal;
			
	}
	
	public void withdrawAmount(int amount){
		balance -= amount;
		System.out.println(userName+" your current balance is : "+balance);
	}
	
	public void depositAmount(int amount){
		balance += amount;
		System.out.println(userName+" your current balance is : "+balance);
	}
	
	public void getAmount(){
		System.out.println(userName+" your current balance is : "+balance);
	}
	
	//Creating method getDetail to display information of User
	public void getDetail(){
		System.out.println("-----Account Detail------");
		System.out.println("Account Holder  NAME : "+ userName );
		System.out.println("Account Number : "+accountNum);
		System.out.println("Account Balance: Rs."+balance+"/-");
	}
}