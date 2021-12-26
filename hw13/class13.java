import java.io.*;
class Exception520 extends Exception
{}
public class hw13_13 {
	public static void main(String argv[]) throws IOException
	{
		BufferedReader buf;
		String str;
		buf = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Input a string: ");
			str = buf.readLine();
			if(str.equals("520"))
			{
				throw new Exception520();
			}
			else
			{
				System.out.println("str= "+str);
			}
		}
		catch(Exception520 e)
		{
			System.out.println("這是由字串520所引起的例外");
		}
	}
}
