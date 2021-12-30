package hw14_7;

import java.io.*;

public class class07 {

	public static void main(String[] args) throws IOException
	{
		int count = 0;
		String str;
		char data[] = new char[128];
		FileReader fr = new FileReader("C:\\Users\\r53wr\\OneDrive\\桌面\\物件導向程式設計(java)\\java\\donkey.txt");
		BufferedReader bfr = new BufferedReader(fr) ;
		while((str=bfr.readLine())!=null)
		{
							/*也可用if(count==2)
									break;			*/
			
			if(count==1)
			{bfr.skip(14);}//count=1時已經讀入了兩行所以只要把第三行全部的字元跳過即可
			System.out.println(str);
			
			count++;
		}
	      
	      fr.close();
	}

}
