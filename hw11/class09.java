interface Math
{
	void show();
	public void add(int a,int b);//計算a+b
	public void sub(int a,int b);//計算a-b
	public void mul(int a,int b);//計算a*b
	public void div(int a,int b);//計算a/b
	
}
interface AdvancedMath
{
	public void mod(int a ,int b);//計算a%b
	public void fac(int a);//計算a!
	public void pow(int a,int b);//計算a^b
}
class Compute implements Math,AdvancedMath
{
	public int ans;
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
	public void mod(int a ,int b)//計算a%b
	{
		ans = a%b;
	}
	public void fac(int a)//計算a!
	{
		ans=1;
		for(int i=a;i>0;i--)
		{
			ans = ans*i;
		}
		
	}
	public void pow(int a,int b)//計算a^b
	{ 
		ans=1;
		for(int i=1;i<=b;i++)
		{
			ans= ans*a ;
		}
	}
}
public class hw11_9 {
	public static void main(String argv[])
	{
		Compute cmp=new Compute();
		cmp.mul(3,5);//呼叫mul(int a,int b)
		cmp.show();
		cmp.mod(14,5);//呼叫mod(int a,int b)
		cmp.show();
		cmp.fac(5);//呼叫fac(int a)
		cmp.show();
	}
}
