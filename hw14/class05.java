package hw14_5;
import java.io.*;

public class class05 {

	public static void main(String[] args) throws IOException
	{
		char data[] = new char[128];
		FileReader fr = new FileReader("C:\\Users\\r53wr\\OneDrive\\桌面\\物件導向程式設計(java)\\java\\donkey.txt");
		fr.skip(9);
		int num = fr.read(data);
		String str = new String(data,0,num);
		 System.out.println("Characters read= "+num);
	      System.out.println(str);
	      
	      fr.close();
	}

}
