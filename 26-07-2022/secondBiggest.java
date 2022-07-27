/* 
Program to find the 2nd biggest element in an array.
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
	int result= secondBig(size,arr); //calling secondBig method
	System.out.println("---------RESULT---------");
	System.out.println(result+" is 2nd biggest element in array.");
	scan.close();
}

//creating a method for finding 2nd biggest element
public static int secondBig(int size,int arr[])
{
	//loop for sorting the array
	for(int i=0;i<size;i++)
	{
		for(int j= i+1;j<size;j++)
		{
			//swapping if 1st element is bigger than 2nd element
			if(arr[i]>arr[j])
			{
				int temp = arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
			}
		}
	}
	/*
	returing the 2nd last element of sorted array in ascending order
	as the array in ascending order so the last element is biggest then
	the 2nd last element should be 2nd largest.
	*/
	return arr[arr.length-2];
}
}