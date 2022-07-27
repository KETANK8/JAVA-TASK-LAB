/*
Program to perform matrix addition for two dimensional array.
*/

//importing Scanner utility to take input for array value from user
import java.util.Scanner;

public class matrixAdd{
	
public static void main (String args[]){
	
	//creating scanner object named scan
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the no of rows :");
	int rows = scan.nextInt();
	System.out.println("Enter the no of coloumns :");
	int cols = scan.nextInt();
	
	//creating three array arr,brr and crr that store result of adding two array
	int arr[][] = new int[rows][cols];
	int brr[][] = new int[rows][cols];
	int crr[][] = new int[rows][cols];
	
	//Storing values in first array
	System.out.println("Enter the value for first array:");
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			arr[i][j]= scan.nextInt();
		}
	}
	
	//Storing values in second array
	System.out.println("Enter the value for second array:");
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			brr[i][j]= scan.nextInt();
		}
	}
	
	//calling display method
	display(rows,cols,arr,brr,crr);
	scan.close();
}

//creating a method name display to perform matrix addition
public static void display(int rows,int cols,int arr[][],int brr[][],int crr[][]){
	/*  using for loop for traversing element of arr and brr 
		and adding the value and storing in crr.  */
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			crr[i][j] = arr[i][j]+brr[i][j];

			//Displaying result value
			System.out.print(crr[i][j]+" ");
		}
		System.out.println(" ");
	}
}
}