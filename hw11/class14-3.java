interface iVolume
{
	public void showData();//顯示球體的資料
	public double Vol();//計算球體積
}
abstract class CSphere implements iVolume
{
	final double pi = 3.14;
	protected int x;
	protected int y;
	public int radius;
public void showData()
	{
		System.out.println("球心: ("+x+","+y+")");
		System.out.println("半徑: "+radius);
		System.out.println("球體積: "+Vol());
	}
	public double Vol()
	{
		return(4*pi*radius*radius*radius)/3;
	}
	}
class CCircle extends CSphere
{
	
	public CCircle(int x1,int y1,int r)
	{
		x = x1;y = y1;radius = r;
	}
	
}
public class hw11_14 {
	public static void main(String argv[])
	{
		CCircle cir = new CCircle(8,6,2);
		cir.showData();
	}
}
