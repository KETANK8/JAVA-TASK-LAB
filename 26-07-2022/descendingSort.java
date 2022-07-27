/* 
Program to sort the array in descending order for given element.
by Ketan Kumar
*/

// importing scanner utility to scan the user input
import java.util.Scanner;
public class descendingSort
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
	sorting(size,arr); //calling sorting method
	System.out.println("\n");
	scan.close();
}

//creating a method for sorting of an array
public static void sorting(int size,int arr[])
{
	for(int i=0;i<size;i++)
	{
		for(int j= i+1;j<size;j++)
		{
			//swapping if current element is smaller than next element
			if(arr[i]<arr[j])
			{
				int temp = arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
			}
		}
	}
	System.out.println("----SORTED IN DESCENDING ORDER---");
	
	//displaying sorted array
	for(int k: arr)
	{
		System.out.print(k+" ");
	}
}
}