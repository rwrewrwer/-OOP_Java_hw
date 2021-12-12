interface Data
{
	public void best();//判斷哪一科成績較高
	public void filled();//判斷哪一科成績低於60
}
interface Test extends Data
{
	public void showData();//顯示學生資料和平均成績
	public double average();//計算數學和英文平均成績
}
class CStu implements Test
{
	protected String name;//姓名
	protected int math;//數學成績
	protected int english;//英文成績
	public CStu(String n,int m,int e)
	{
		name = n;math = m;english = e;
	}
	public void best()
	{
		if(math>english)
		{
			System.out.println(name+"的數學比英文好");
		}
		else
		{
			System.out.println(name+"的英文比數學好");
		}
	}
	public void filled()
	{
		if(math<60)
		{
			System.out.println(name+"的數學當掉了");
		}
		if(english<60)
		{
			System.out.println(name+"的英文當掉了");
		}
	}
	public void showData()
	{
		System.out.println("姓名:"+name);
		System.out.println("數學成績:"+math);
		System.out.println("英文成績:"+english);
		System.out.println("平均成績:"+average());
	}
	public double average()
	{
		return (math+english)/2.0 ;
	}
	public void show()
	{
		showData();
		best();
		filled();
	}
}
public class hw11_12 {
	public static void main(String argv[])
	{
		CStu stu = new CStu("Judy",58,91);
		stu.show();
	}
}
