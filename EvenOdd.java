class EvenOdd
{
	static void num(int num1,int num2)
	{
		for (int i = num1;i<=num2 ;i++ )
		{
			if (i%2==0)
			{
				System.out.println( "Even numbers are : "+i);
			}else
				{
				System.out.println("Odd numbers are : "+i);
				}
		}
	}
	public static void main(String[] args) 
	{
		num(1,20);
	}
}
