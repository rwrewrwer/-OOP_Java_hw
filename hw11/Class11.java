interface Data
{
	public  void showdata();
}
interface Test
{
	public void showScore();
	public double calcu();
}
class CStu implements Data,Test
{
	protected String id;//學號
	protected String name;//姓名
	protected int mid;//期中考成績
	protected int finl;//期末考成績
	protected int common;//平時成績
	public CStu(String i,String n,int m,int f,int c)
	{
		id=i;name=n;mid=m;finl=f;common=c;
		
	}
	public void showdata()
	{
		System.out.println("學號 = "+id);
		System.out.println("姓名 = "+name);
	}
	public void showScore()
	{
		System.out.println("期中考成績 = "+mid);
		System.out.println("期末考成績 = "+finl);
		System.out.println("平時成績 = "+common);
		System.out.println("學期成績 = "+calcu());
	}
	public double calcu()
	{
		return (mid*0.3+finl*0.3+common*0.4);
	}
	public void show()
	{
		showdata();
		showScore();
	}
}
public class hw11_11 {
	public static void main(String argv[])
	{
		CStu cs = new CStu("940001","Fiona",90,92,85);
		cs.show(); 
		
	}
}
