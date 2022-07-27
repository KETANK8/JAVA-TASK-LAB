/*

*/

import java.util.Scanner;
/*

*/
public class matrixAdd{
	
public static void main (String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the no of rows :");
	int rows = scan.nextInt();
	System.out.println("Enter the no of coloumns :");
	int cols = scan.nextInt();
	int arr[][] = new int[rows][cols];
	int brr[][] = new int[rows][cols];
	int crr[][] = new int[rows][cols];
	System.out.println("Enter the value for first array:");
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			arr[i][j]= scan.nextInt();
		}
	}
	System.out.println("Enter the value for second array:");
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			brr[i][j]= scan.nextInt();
		}
	}
	
	display(rows,cols,arr,brr,crr);
}
public static void display(int rows,int cols,int arr[][],int brr[][],int crr[][]){
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			crr[i][j] = arr[i][j]+brr[i][j];
			System.out.print(crr[i][j]+" ");
		}
		System.out.println(" ");
	}
}
}