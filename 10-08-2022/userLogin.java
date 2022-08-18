import java.util.*;

class userLogin{
	
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter User Name : ");
	String name = scan.next();
	System.out.print("Enter Password : ");
	String pw = scan.next();
	loginCheck user1 = new loginCheck();
	user1.verify(name,pw);
	}
}

class loginCheck{
	String userName,Password;
	public void verify(String name,String pw){
		userName = name;
		Password = userName.substring(0,3);
		Password = Password.concat("123");
		if(pw.equals(Password)){
			System.out.println("Login Successfull");
		}
		else{
			System.out.println("Incorrect Password!!");
		}
	}
}