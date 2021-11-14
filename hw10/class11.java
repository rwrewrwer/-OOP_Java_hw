class CShape{
	public double area() 
	{
		return 0.0;
	}
	
}
class CCircle extends CShape
{
	double pi = 3.14;
	double radius ;
	public CCircle(double r)
	{
		radius = r;
	}
	public double area()
	{
		return pi*radius*radius;
	}
}
class CSquare extends CShape
{
	double width;
	public CSquare(double w)
	{
		width = w;
	}
	public double area()
	{
		return width*width
				;
	}
}
class CTriangle extends CShape
{
	double base;double hei;
	public CTriangle(double b,double he)
	{
		base = b;
		hei = he;
	}
	public double area()
	{
		return (base*hei)/2;
	}
}
public class hw10_1 {
	public static void main(String argv[])
	{
		CShape cs[] = new CShape[6];
		cs[0] = new CCircle(0);
		cs[1] = new CCircle(4);
		cs[2] = new CSquare(2);
		cs[3] = new CSquare(5);
		cs[4] = new CTriangle(1,3);
		cs[5] = new	CTriangle(4,5);	
		
		double a[]=new double[6];
		a[0]=cs[0].area();
		a[1]=cs[1].area();
		a[2]=cs[2].area();
		a[3]=cs[3].area();
		a[4]=cs[4].area();
		a[5]=cs[5].area();
	System.out.println(largest(a));
	}
public static double largest(double a[])
	{
		double max = 0;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			max =a[i];
			
			
		}

		return max ;
		
	}

}
