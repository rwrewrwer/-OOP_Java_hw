class CRectangle
{
	protected int length;
	protected int width;
	public CRectangle(int l,int w)
	{
		length = l;
		width = w;		
	}
	public String toString()
	{
		String str = "length = "+length+", width = "+width+", area = "+(length*width);
		return str;
	}
	public String toString(int a,int b)
	{
		if(a>=b)
		
			return super.toString();
	
		else
		
			return "Argument Error";
		
	}
	
}
public class hw10_1
{
	public static void main(String argv[])
	{
		CRectangle rect = new CRectangle(6,2);
		System.out.println(rect.toString());
		System.out.println(rect.toString(6,2));
		System.out.println(rect.toString(3,5));
	}
}
//多載
