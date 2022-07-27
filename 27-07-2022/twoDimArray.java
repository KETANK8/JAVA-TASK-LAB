/*
Program to create a two dimensional array 
and display array elements.
*/

//importing Scanner utility to take input for array value from user
import java.util.Scanner;

public class twoDimArray{
	
public static void main (String args[]){
	
	//creating scanner object named scan
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the no of rows :");
	int rows = scan.nextInt();
	System.out.println("Enter the no of coloumns :");
	int cols = scan.nextInt();
	
	//creating an array
	int arr[][] = new int[rows][cols];
	
	//Storing value in array
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			arr[i][j]= scan.nextInt();
		}
	}
	
	//Calling display method
	display(rows,cols,arr);
	scan.close();
}

// creating display method to display all element of 2d array
public static void display(int rows,int cols,int arr[][]){
	
	/*	using for loop to traverse and 
		display every element of array   */
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			System.out.print(arr[i][j]+" ");
		}
		System.out.println(" ");
	}
}
}