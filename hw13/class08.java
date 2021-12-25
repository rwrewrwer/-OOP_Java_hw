class Ctest
{
	public static void test(int num,int den) throws ArithmeticException
	{
		int ans;
		ans=num/den;
		System.out.println(num+"/"+den+"="+ans);
	}
}
public class hw13_8 {
	public static void main(String argv[])
	{
		try
		{
			Ctest.test(5,0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e+" throwed");
		}
	}
}
