class labledFor
{

public static void main(String args[])
{

	int i,j;
	outer:
	for(i=1;i<=3;i++)
	{
		inner:
		for(j=1;j<=3;j++)
		{
			if(i==2 && j==2)
			{
				continue inner;
			}	
			else
			{
				System.out.println(i+" "+j);
			}
		}
	}

}

}