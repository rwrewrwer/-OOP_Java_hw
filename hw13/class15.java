import java.io.*;
import java.math.*;
class ArgumentOutOfBound extends Exception
{}
public class hw13_15 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader buf;
		String str;
		int num;
		buf = new BufferedReader(new InputStreamReader(System.in));
		str = buf.readLine();
		num = Integer.parseInt(str);
		mySqart(num);
	}
	public static void mySqart(int num)
	{
		try
		{
		if(num<=0)
		{
			throw new ArgumentOutOfBound();
		}
		else
		{
			System.out.println("根號num = "+Math.sqrt(num));
		}
		}
		catch(ArgumentOutOfBound e)
		{
			System.out.println("n小於0");
		}
		}
}
