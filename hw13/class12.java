	class NotTriangle extends Exception
	{}
	class EquilateralTriangle extends Exception
	{}
	class NotEquilateralTriangle extends Exception
	{}
public class hw13_12 {
		public static void main(String argv[])
		{
			int a = 4;int b = 2;int c = 2;
			
			try
			{
				Triangle(a,b,c);
			}
			catch(NotTriangle e)
			{
				System.out.println("這不構成三角形");
			}
			catch(EquilateralTriangle e)
			{
				System.out.println("這是正三角形");
			}
			catch(NotEquilateralTriangle e)
			{
				System.out.println("這不是正三角形");
			}
		}
		public static void Triangle(int a,int b,int c) throws NotTriangle,EquilateralTriangle,NotEquilateralTriangle
		{
			if((a+b)<c ||(a+c)<b ||(b+c)<a)
			{
				throw new NotTriangle();
			}
			else if(a==b && a==c && b==c)
			{
				throw new EquilateralTriangle();
			}
			else
			{
				throw new NotEquilateralTriangle();
			}
		}


}

