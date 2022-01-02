package hw15_9;
class test implements Runnable
{
	public String id;
	public int sec;
	public test(String i,int s)
	{
		id = i ;
		sec = s;
	}
	public  void run()
	{
		for(int i=0;i<10;i++)
		{
			try
			{
				Thread.sleep(sec);
			}
			catch(InterruptedException e)
			{}
			System.out.println(id+"is runing..");
		}
	}
}
public class class09 {

	public static void main(String[] args) {
		test te = new test("Threed 1",1000);
		test te1 = new test("Threed 2",2500);
		Thread t1 = new Thread(te);
		Thread t2 = new Thread(te1);
		t1.start();
		t2.start();
	}

}
