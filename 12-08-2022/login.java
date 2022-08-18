import java.util.regex.*;
import java.util.*;

class login{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Username : ");
		String userName = scan.next();
		if(checkUser(userName)){
			System.out.print("Enter Password : ");
			String passWord = scan.next();
			if(checkPswd(passWord)){
				checkLogin(userName,passWord);
			}
			else{
				System.out.println("Invalid Password!");
			}
		}
		else{
			System.out.println("Invalid Username!");
		}
		scan.close();
	}
	
	public static boolean checkUser(String name){
		boolean check = Pattern.matches("[a-zA-z]{5,13}",name);
		return check;
	}
	
	public static boolean checkPswd(String pswd){
		boolean check = Pattern.matches("[a-zA-z0-9]{8,}",pswd);
		return check;
	}
	
	public static void checkLogin(String name,String pswd){
		String passWord = name.substring(0,4);
		passWord = passWord+"1234";
		if(passWord.equals(pswd)){
			System.out.println("Login successfull");
		}
		else{
			System.out.println("Wrong Password or Username!!");
		}
	}
}