/*
	Program to print employee details using aggregation between two classes.
	by Ketan Kumar.
*/


//importing Scanner utility to take input from user
import java.util.Scanner;

//class 1
//Main Class
class aggregation{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee name :");
		String name = scan.nextLine();
		System.out.println("Enter Employee city name :");
		String city = scan.nextLine();
		System.out.println("Enter Employee state name :");
		String state = scan.nextLine();
		System.out.println("Enter Employee Id number :");
		int id = scan.nextInt();
		System.out.println("Enter Employee Address Pincode :");
		int pincode = scan.nextInt();
		
		//creating object adr1 of class Address
		Address adr1 = new Address(pincode,city,state);
		//creating object emp1 of class employee
		employee emp1 = new employee(id,name,adr1);
		//calling getDetail method from class employee
		emp1.getDetail();
		scan.close();
	}
}

//class 2
//creating Address class to store employee address
class Address{
	int pinCode;
	String cityName,stateName;
	
	//creating constructer that take address details as parameter
	Address(int pin,String city,String State){
		
		//Attribute of class Address
		pinCode = pin;
		cityName = city;
		stateName = State;
	}
}

//class 2
//Creating class employee 
class employee{
	int empId;
	String empName,empState;
	
	//Aggregating from class 2
	Address  adr;
	//creating constructer that take employee details as parameter
	employee(int id,String name,Address adrr){
		//Attribute of employee
		empId = id;
		empName = name;
		adr = adrr;
	}
	
	//creating method of class employee
	public void getDetail(){
		/*
			printing Employee details with address details 
			using aggregation with class Address
		*/
		System.out.println("==========Employee Details===========");
		System.out.println("Hello "+empName+"\nYour Id : "+empId+"\nYour Address : \n"+adr.cityName+",\n"+adr.stateName+",\npin-"+adr.pinCode);
		System.out.println("=====================================");
	}
}

