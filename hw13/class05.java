public class hw13_5 {
	public static void main(String argv[])
	{
		try
		{
		int num = 12;
		int den[]= {12,0,3,0,0,4};
		for(int i=0;i<10;i++)
		{
			System.out.println("ans = "+num/den[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e)//捕捉ArrayIndexOutOfBoundsException
		{
			System.out.println("陣列索引值超出了範圍");
		}
		catch(ArithmeticException e)//捕捉ArithmeticException
		{
			System.out.println("除數為0");
		}
		
	}
}
