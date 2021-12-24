public class hw13_2 {
	public static void main(String argv[])
	{
		try //檢查程式
		{
		int num=12 , den = 0;
		int ans= num/den;
		
		}
		catch(ArithmeticException e)//捕捉例外
		{
			System.out.println("除數為0");
		}
		finally
		{
			System.out.println("end of main()!!");
		}
		
	}}
