interface Math

{
	public void show();
	public void add(int a,int b);//計算a+b
	public void sub(int a,int b);//計算a-b
	public void mul(int a,int b);//計算a*b
	public void div(int a,int b);//計算a/b
}
class Compute implements Math
{
	int ans;
	public void show()
	{
		System.out.println("ans = "+ans);
	}
	public void add(int a,int b)//計算a+b
	{
		ans = a+b;
	}
	public void sub(int a,int b)//計算a-b
	{
		ans = a-b;
	}
	public void mul(int a,int b)//計算a*b
	{
		ans = a*b;
	}
	public void div(int a,int b)//計算a/b
	{
		ans = a/b;
	}
}
public class hw11_5 {
	public static void main(String argv[])
	{
		Compute cmp = new Compute();//建立物件cmp
		cmp.mul(3,5);//呼叫mul(int a,int b)
		cmp.show();//呼叫show()
	}
}
