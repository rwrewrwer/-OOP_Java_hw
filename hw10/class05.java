class caaa
{
	private int num ; 
	public  caaa(int n)
	{
		num =  n;
		
	}
	public int get()
	{
		return num ;
	}}
	class cbbb extends caaa
	{
		public cbbb(int n) {
			super(n);
		}

		public void show()
		{
			System.out.println("num = "+get());
		}
	}

public class hw10_1 {
	public static void main(String argv[])
	{
		cbbb bb =new cbbb(2);
		bb.show();
	}


}
