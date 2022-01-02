package he15_14;
class prepaid extends Thread
{
	public static int sum=200;
	
	public  void run()
	{
		while(sum>10)
			{
				int fee=(int)(100*Math.random());
				talk(fee);
			}
	}
	public synchronized static void talk(int f)
	{
	   sum= sum-f;
		try
		{
			sleep((int)(1000*Math.random()));
		}
		catch(InterruptedException e)
		{}
	 if(sum>0)
	 {
		System.out.println("³q¸Ü¶O:"+f+" ¾lÃB"+sum);
		}
	}
}

public class class14 {
	public static void main(String argv[])
	{
		prepaid p = new prepaid();
		prepaid p1 = new prepaid();
		prepaid p2 = new prepaid();
		p.start();
		p1.start();
		p2.start();
	}
}
