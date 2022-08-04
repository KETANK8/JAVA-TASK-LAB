/*
	Program to find all the possible two number in an array 
	whose sum is equal to the target.
	Ketan Kumar
*/

// importing scanner utility to scan the user input
import java.util.Scanner;

//class1
//Main class
public class Target{
	public static void main(String args[]){
		
		//creating scanner object named scan
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of array:");
		int size = scan.nextInt();
		
		//creating array arr
		int[] arr;
		arr = new int[size];
		System.out.println("Enter "+size+" elements :");	
		
		//for loop to store element in array
		for(int i=0;i<size;i++){
			arr[i]= scan.nextInt();
		}
		System.out.println("Enter the Sum of two number : ");
		int target = scan.nextInt();
		
		//creating object of search class named find.
		search find = new search();
		System.out.println("-------------Result---------------");
		
		// calling Sum method from search class using find object
		find.Sum(arr,size,target);
		scan.close();
	}
}

//class2 
// creating class search to traverse the array and find all possible set of value
class search{
	public void Sum(int arr[],int size,int target){
		int lenght = size;
		
		//for loop to traverse the array
		for(int i=0;i<lenght;i++){
			for(int j=i+1;j<lenght;j++){
				// comparing if sum of two elements is equal to target
				if(target == arr[i]+arr[j]){
					
					// printing all the possible set of two value whose sum is equal to target
					System.out.print("Element: ["+arr[i]+","+arr[j]+"]");
					System.out.println("  Index :["+i+","+j+"]");
				}
			}
		}
	}
}