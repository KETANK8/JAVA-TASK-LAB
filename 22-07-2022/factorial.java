/*
Java Program to find the factorial of a given number
by Ketan Kumar
*/

import java.util.Scanner;

class factorial
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in); //making an object of scanner class named sc
	System.out.print("Enter the Number : ");
	int num = sc.nextInt(); // storing input from user in variable num
	System.out.println(" ");
	int fact=1,i=2;
	while(i<=num) //calculating factorial 
	{
		fact *= i;
		i++;
	}
	System.out.println("Factorial of "+num+" is :"+fact);
}
}