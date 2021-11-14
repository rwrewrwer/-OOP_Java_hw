class Caaa
{
	public int num1;
	public int num2;
	public Caaa()
	{
		num1=num2=1;
	}
	public Caaa(int a,int b)
	{
		num1 = a;
		num2 = b;
	}
	public void show()
	{
		System.out.println(num1);
		System.out.println(num2);
	}
}
class Cbbb extends Caaa
{
	public void set_num(int n1,int n2)
	{
		num1 = n1;
		num2 = n2;
	}
	public void show()
	{
		System.out.println(num1);
		System.out.println(num2);
	}
	public Cbbb(int a,int b)
	{
		super(a,b);
		
	}
	public Cbbb() 
	{
		super();
	}
}
public class hw10_1 {

	public static void main(String[] args) 
	{
		
		Cbbb bb = new Cbbb(3,9);
		bb.show();
		
	}}
