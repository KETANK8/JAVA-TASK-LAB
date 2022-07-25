/*
program to check if a given number is an Armstrong Number for 3 digit number.
by Ketan Kumar
*/
import java.util.Scanner;

public class armstrongNumber{
	
public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);// creating scanner oject named scan.
	System.out.println("Enter the Number :");
	int num = scan.nextInt();// reading input and storing in variable num
	System.out.println("--------------------");
	boolean result = checkArmstrong(num);// calling checkArmstrong method and store its return value in variable result
	if(result)// if result is true then num is an armstrongNumber if false not an armstrongNumber
	{
		System.out.println(num+" is an armstrong Number");
	}
	else
	{
		System.out.println(num+" is not an armstrong Number.");
	}
}
public static boolean checkArmstrong(int value)
{
	int rem,temp=0, original = value;
	while(value != 0)// creating armstrong number
	{
		rem = value%10;
		temp = temp + (rem*rem*rem);
		value/= 10;
	}
	if(temp == original)// checking armstrong
	{
		return true;
	}
	else
	{
		return false;
	}
}
}