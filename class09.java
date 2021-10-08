 class CCalculator {
	int a;
	int b;
	int c;
	
	void set_value(int x ,int y ,int z)
	{
		a = x;
		b = y;
		c = z;
	}
	void show()
	{
		System.out.println("a= "+ a);
		System.out.println("b= "+ b);
		System.out.println("c= "+ c);
	}
	int add()
	{
		return a+b+c ;	
	}
	int sub()
	{
		return  a-b-c ;
	}
	int mul()
	{
		return a*b*c;
	}
	double avg()
	{
		return (a+b+c)/3 ;
	}
	public class hw8_9 {

		public static void main(String[] args) {
			CCalculator test = new CCalculator();
			
			test.set_value(25,3,7);
			test.show();
			System.out.println(test.add());
			System.out.println(test.sub());
			System.out.println(test.mul());
			System.out.println(test.avg());
			
		}
}}

