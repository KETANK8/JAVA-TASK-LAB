/*
Program to check if a given number is a Palindrome Number
by Ketan Kumar
*/
import java.util.Scanner;
public class palindromeNumber{

public static void main(String args[])
{
	Scanner scan = new Scanner(System.in); // creating scanner oject named scan.
	System.out.println("Enter the Number :");
	int num = scan.nextInt(); // reading input and storing in variable num
	boolean result = palindrome(num); // calling palindrome method and store its return value in variable result
	System.out.println("----------------------------------------");
	
	if (result)// if result is true then palindrome if false not palindrome
	{
		System.out.println(num+" is a palindrome number.");
	}
	else
	{
		System.out.println(num+" is not a palindrome number.");
	}
	scan.close();
}

public static boolean palindrome(int value)
{
	int number=0,rem=1,original = value;
	while(value!=0) //reversing the given number
	{
		rem = value%10;
		number = number*10 + rem;
		value = value/10;
	}
	if (number == original)// checking if reversed number is equal to the given value 
	{
		return true;
	}
	else
	{
		return false;
	}
}
}