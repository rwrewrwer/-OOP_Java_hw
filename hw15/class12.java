package hw15_12;

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
			
			System.out.println(id+" "+i);
		}
	}
}
public class class12 {

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
	try 
	{
		t.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		t1.start();
		t1.join();
	}
	catch(InterruptedException e)
	{}
	System.out.println("All Thread are finished");

	}

}
