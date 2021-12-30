package hw14_9;
import java.io.*;
public class class09 {

	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("C:\\Users\\r53wr\\OneDrive\\桌面\\aaa.txt");
		FileReader fr1 = new FileReader("C:\\Users\\r53wr\\OneDrive\\桌面\\bbb.txt");
		FileReader fr2 = new FileReader("C:\\Users\\r53wr\\OneDrive\\桌面\\ccc.txt");
		BufferedReader br = new BufferedReader(fr);
		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);
		String str;
		System.out.println("aaa.txt");
		while((str = br.readLine())!=null)
		{
			System.out.println(str);
		}
		System.out.println("bbb.txt");
		while((str = br1.readLine())!=null)
		{
			System.out.println(str);
		}
		System.out.println("ccc.txt");
		while((str = br2.readLine())!=null)
		{
			System.out.println(str);
		}
		fr.close();
		fr1.close();
		fr2.close();
	}

}
