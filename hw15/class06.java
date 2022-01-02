package hw15_6;
class Add  implements Runnable 
{
	private int n;
	private int sum = 0;
	public Add(int a)
	{
		n=a;
	}
	public void run()
	{
		for(int i=1;i<=n;i++)
		{
			sum = sum+i;
		}
		System.out.println(sum);
	}
}
public class class06 {
	public static void main(String argv[])
	{
		Add a = new Add(5);
		Add a1 = new Add(10);
		Thread t = new Thread(a);
		Thread t1 = new Thread(a1);
		t.start();
		t1.start();
	}
}
