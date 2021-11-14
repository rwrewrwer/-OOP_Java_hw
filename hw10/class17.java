class car
{
	protected String owner;
	protected String id;
	final void show()
	{
		System.out.println("車主姓名 = "+owner);
		System.out.println("車牌號碼 = "+id);
	}
	public  car(String own,String s)
	{
		owner = own;
		id = s;
	}
}
 class CColor extends car
	{
		  String color;
	
 public  CColor(String own,String s,String col)
 {
	super(own,s);
	color = col;
 }
 public void show() 
 {
	System.out.println("車主姓名 = "+owner);
	System.out.println("車牌號碼 = "+id);
	System.out.println("車身顏色 = "+color);
 }
 }
public class hw10_1
{
	public static void main(String argv[])
	{
		CColor mycar = new CColor("Riaan","A1-2345","Black");
		mycar.show();
	}
}
//Exception in thread "main" java.lang.IncompatibleClassChangeError: class hw10_1.CColor overrides final method hw10_1.car.show()V  把	final void show()的final去掉就行了
