package hw14_8;
import java.io.*;
public class class08 {

	public static void main(String[] args) throws IOException
	{
		String str;
		FileReader fr = new FileReader("C:\Users\r53wr\OneDrive\桌面\\aaa.txt");
		FileReader fr1 = new FileReader("C:\Users\r53wr\OneDrive\桌面\\bbb.txt");
		FileWriter fr2 = new FileWriter("C:\Users\r53wr\OneDrive\桌面\\ccc.txt");
		BufferedReader bu = new BufferedReader(fr);
		BufferedReader bu1 = new BufferedReader(fr1);
		BufferedWriter bu2 = new BufferedWriter(fr2);
		while((str = bu.readLine())!=null)
		{
			bu2.write(str);
			bu2.newLine();
		}
		while((str = bu1.readLine())!=null)
		{
			bu2.write(str);
			bu2.newLine();
		}
		 bu2.flush();
		 fr.close();
		 fr1.close();
		 fr2.close();
	}

}
