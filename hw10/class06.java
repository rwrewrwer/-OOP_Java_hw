class CTriango
{
	protected int base;
	protected int height;
	protected void show()
	{
		System.out.println("base = "+base+" height = "+height);
	}
}
class CData extends CTriango {
public CData(int b,int h)
{
	base = b;height = h;
}


public double area()
{
	 return (base*height)/2;
	
}
public void showarea()
{
	System.out.println("area = "+area());
}
}
public class hw10_1 {
	public static void main(String argv[])
	{
		CData obj = new CData(3,8);
		obj.show();
		
		obj.showarea();
