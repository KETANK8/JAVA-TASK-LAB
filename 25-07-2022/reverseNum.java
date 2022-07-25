/*
Program to reverse a number
by Ketan Kumar
*/
import java.util.Scanner;
public class reverseNum{

public static void main(String args[])
{
	Scanner scan = new Scanner(System.in); // creating scanner oject named scan.
	System.out.println("Enter the Number :");
	int num = scan.nextInt(); // reading input and storing in variable num
	int reversed = reverse(num); // calling reverse method and store its return value in variable reversed
	System.out.println("==============================================");
	System.out.println(reversed + " is the reverse number of "+ num);
	scan.close();
}

public static int reverse(int value)
{
	int number=0,rem=1;
	while(value!=0) //reversing the given number
	{
		rem = value%10;
		number = number*10 + rem;
		value = value/10;
	}
	return number; // returning reversed value
}


}