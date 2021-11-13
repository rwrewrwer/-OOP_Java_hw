class Caaa
{
	public int num1;
	public int num2;
}
class Cbbb extends Caaa
{
	public void set_num(int a,int b)
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
public class hw10_1 {

	public static void main(String[] args) {
		Cbbb bb = new Cbbb();
		bb.set_num(5,10);
		bb.show();

	}

}
