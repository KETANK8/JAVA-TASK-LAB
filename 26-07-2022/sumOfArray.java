/* 
Program to find the sum of all element in an array.
by Ketan Kumar
*/

// importing scanner utility to scan the user input
import java.util.Scanner;
public class secondBiggest
{

public static void main(String args[])
{
	//creating scanner object named scan
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of the array:");
	int size = scan.nextInt();
	
	//creating an array object
	int arr[] = new int[size];
	System.out.println("Enter "+size+" elements :");
	
	//loop for storing user input element in array
	for (int i=0;i<size;i++)
	{
		arr[i] = scan.nextInt();
	 
	}
	System.out.println("-----------TOTAL--------");
	int result= sumOfElement(size,arr);//calling sumOfElement method
	System.out.println(result+" is the total of all elements in array.");
}
//creating a method to add all the elements
public static int sumOfElement(int size,int arr[]){
	int total=0;
	/*  using foreach loop for travesing the array
	and adding element value in total variable  */
	for(int k:arr)
	{
		total += k;
	}
	return total;//returing the calculated value
}
}