package sub1;

public class CSphere {
	double radius;
	double pi = 3.14;
	public CSphere(double r)
	{
		radius = r;
	}
	public void show()
	{
		System.out.println("radius = "+radius);
		System.out.println("球體體積 = "+(4*pi*radius*radius*radius)/3);
	}

}
package sub2;

public class CTrapezoid {
	int upper;
	int base;
	int height;
	public CTrapezoid(int u,int b,int h)
	{
		upper = u;
		base = b;
		height =h;
	}
	public void show()
	{
		System.out.println("upper = "+upper);
		System.out.println("base = "+base);
		System.out.println("height = "+height);
		System.out.println("梯形面積 = "+height*(upper+base)/2);
	}
	
	
}
package pack9;

import sub1.CSphere;
import sub2.CTrapezoid;

public class hw12_9 {
	public static void main(String argv[])
	{
		CSphere cs = new CSphere(2.0);
		cs.show();
		CTrapezoid ct = new CTrapezoid(2,4,5);
		ct.show();
	}
}
