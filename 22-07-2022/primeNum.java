import java.util.Scanner;

class primeNum
{
	
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Set the limit : ");
	int Limit = sc.nextInt();
	for(int i=2;i<=Limit;i++)
	{
		int cofe= 0;
		for(int j=1;j<=i;j++)
		{
			if (i%j == 0)
			{
				cofe++;	
			}
		
		}
		if (cofe==2) System.out.println(i);
	
	}
	
}
	
}