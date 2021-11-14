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
	}
	public void display()
	{
		System.out.println("printed from caaa class");
	}
	}
	class cbbb extends caaa
	{
		public cbbb(int n) {
			super(n);
		}

		public void show()
		{
			System.out.println("num = "+get());
		}
		public void display()
		{
			System.out.println("printed from cbbb class");
		}
	}

public class hw10_1 {
	public static void main(String argv[])
	{
		//cbbb bb =new cbbb(2);
		caaa bb = new cbbb(2);
		//bb.show();
		
		bb.display();//呼叫子類別的display()
	}


}
