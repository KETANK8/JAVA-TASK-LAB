/*
Program too create Movie Theater Management to store and display movie details.
*/

// importing scanner utility to get input from user
import java.util.Scanner;

public class movieTheater{
	
public static void main(String args[]){
	
	//creating scanner object named scan
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Movie name : ");
	String movieName = scan.next();
	System.out.println("Enter start time :");
	int startTime = scan.nextInt();
	System.out.println("Enter end time : ");
	int endTime = scan.nextInt();
	System.out.println("Enter price : ");
	int price = scan.nextInt();
	
	//creating an object named show of class movie
	movie show = new movie();
	
	//callng setDetail method of movie class using show object
	show.setDetail(movieName,startTime,endTime,price);
	
	//callng getDetail method of movie class using show object
	show.getDetail();
	scan.close();
}
}

class movie{
	//creating instance variable
	String Name;
	int Start,End,Price;
	
	//creating method setDetail to store information of movie
	public void setDetail(String name,int start,int end,int price){
		Name= name;
		Start = start;
		End = end;
		Price = price;	
	}
	
	//Creating method getDetail to display information of movie
	public void getDetail(){
		System.out.println("-----TICKET------");
		System.out.println("MOVIE  NAME : "+ Name );
		System.out.println("Screen Time : "+Start+":00 pm - "+End+":00 pm");
		System.out.println("TICKET PRICE : Rs."+Price+"/-");
	}
}