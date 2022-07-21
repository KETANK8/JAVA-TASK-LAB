class leapYear
{

public static void main(String args[])
{
	int num=1947,n2=2022;
	for(int i=num;i<=n2;i++)
	{
		if(i%4==0)
		{
			System.out.println(i+" is a leap year");
		}
	}
}

}