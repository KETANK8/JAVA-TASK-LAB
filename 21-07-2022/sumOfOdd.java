import java.util.Scanner;

class sumOfOdd
{

public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no in between to find sum of odd : ");
	int N = sc.nextInt();
	int num=0;
	for(int i=1;i<=N;i++)
	{
		if(i%2 != 0)
		{
			num += i;
		}
	}
	System.out.println(num);
}

}