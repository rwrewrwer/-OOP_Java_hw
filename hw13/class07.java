public class hw13_7 {
	public static void test(int num,int den) throws ArithmeticException
	{
		int ans;
		ans = num/den;
		System.out.println();
		System.out.println(num+"/"+den+"="+ans);
	}
		
	public static void main (String argv[])
	{
		
		try 
		{
			test(12,0);
		}
		 catch(ArithmeticException e)
	      {
	         System.out.println(e+" throwed");
	      }
	}
}
