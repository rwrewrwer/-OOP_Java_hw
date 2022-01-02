package hw15_10;

class CTest implements Runnable
{
	String id;
	public CTest(String str)
	{
		id=str;
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
			Thread.sleep((int)(2000*Math.random()));
			
			}
			catch(InterruptedException e)
			{}
			System.out.println(id+" "+i);
		}
	}
}
public class class10 {

	public static void main(String[] args) {
		CTest hi = new CTest("Hello");
		CTest bye = new CTest("Good bye");
		CTest morning = new CTest("Good morning");
		CTest night = new CTest("Good night");
		Thread t = new Thread(hi);
		Thread t1 = new Thread(bye);
		Thread t2 = new Thread(morning);
		Thread t3 = new Thread(night);
		t.start();
		t1.start();
		t2.start();
		t3.start();
	}

}
