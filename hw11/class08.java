interface iAaa
{
	public void show();
}
class Cbbb
{
	public int num=10;//建立變數num=10
	public void set(int n)
	{
		num = n;
	}
}
class Cccc extends Cbbb implements iAaa//Cccc繼承類別Cbbb又實作界面iAaa
{
	public void show()
	{
		System.out.println("num = "+num);
	}
}
public class hw11_8 {
	public static void main(String argv[])
	{
		Cccc cc = new Cccc();
		cc.set(5);//呼叫set(int n)並將n設成5
		cc.show();//呼叫show()
	}
}
