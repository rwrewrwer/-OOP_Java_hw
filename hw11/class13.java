interface Show_ans
{
	public void show();
}
interface Math extends Show_ans
{
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
	public void add(int a,int b)
	{
		ans = a+b;
	}
	public void sub(int a,int b)
	{
		ans = a-b;
	}
	public void mul(int a,int b)
	{
		ans = a*b;
	}
	public void div(int a,int b)
	{
		ans = a/b;
	}
}
public class hw11_13 {
	public static void main(String argv[])
	{
		Compute cmp = new Compute();
		cmp.mul(3,5);
		cmp.show();
		
	}
}
