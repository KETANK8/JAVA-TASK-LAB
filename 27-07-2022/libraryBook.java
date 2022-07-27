/*
	Program too create library book Management system
	to store and display book details in library.
*/

// importing scanner utility to get input from user
import java.util.Scanner;

public class libraryBook{
	
public static void main(String args[]){
	
	//creating scanner object named scan
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Book name : ");
	String bookName = scan.next();
	System.out.println("Enter Book Id Number :");
	int bookId = scan.nextInt();
	System.out.println("Enter price : ");
	int price = scan.nextInt();
	
	//creating an object named book of bookShelf
	bookShelf book = new bookShelf();
	
	//callng setDetail method of bookShelf class using book object
	book.setDetail(bookName,bookId,price);
	
	//callng getDetail method of bookShelf class using book object
	book.getDetail();
	scan.close();
}
}

class bookShelf{
	//creating instance variable
	String Name;
	int Id,Price;
	
	//creating method setDetail to store information of book
	public void setDetail(String name,int id,int price){
		Name= name;
		Id = id;
		Price = price;	
	}
	
	//Creating method getDetail to display information of book
	public void getDetail(){
		System.out.println("-----BOOK DETAIL------");
		System.out.println("Book  NAME : "+ Name );
		System.out.println("Book Id Number : "+Id);
		System.out.println("Book PRICE : Rs."+Price+"/-");
	}
}