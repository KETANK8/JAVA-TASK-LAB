class conditionalOperator
{	
	public static void main(String args[])
	{
		int a=10,b=12,c=9,d=15,bigger,biggest;
		bigger= (a>b && a>c) ? a : ((b>c)?b:c); //comapring 3 variables a,b,c
		biggest = ( (a>b && a>c && a>d) ? a : (b>c && b>d) ? b : (c>d)? c : d ); //comparing 4 variable a,b,c,d
		System.out.println("largest number between three variable \na:"+a+" b:"+b+" c:"+c+"\nis : "+ bigger);
		System.out.println("\nlargest number between four variables \na:"+a+" b:"+b+" c:"+c+" d:"+d+"\nis : "+biggest);		
	}
}