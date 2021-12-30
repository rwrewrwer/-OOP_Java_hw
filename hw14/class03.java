import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class hw14_3 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader buf ;
		String str;
		int n;
		int sum=0;
		buf = new BufferedReader(new InputStreamReader(System.in));
		str = buf.readLine();
		n = Integer.parseInt(str);
		for(int i=1;i<=n;i++)
		{
			sum = sum+i;
		}
	System.out.println("sum = "+sum);
	}

}
