/*

*/

import java.util.Scanner;

public class twoDimArray{
	
public static void main (String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the no of rows :");
	int rows = scan.nextInt();
	System.out.println("Enter the no of coloumns :");
	int cols = scan.nextInt();
	int arr[][] = new int[rows][cols];
	
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			arr[i][j]= scan.nextInt();
		}
	}
	
	display(rows,cols,arr);
}
public static void display(int rows,int cols,int arr[][]){
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			System.out.print(arr[i][j]+" ");
		}
		System.out.println(" ");
	}
}
}