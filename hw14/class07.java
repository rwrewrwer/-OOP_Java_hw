package hw14_7;

import java.io.*;

public class class07 {

	public static void main(String[] args) throws IOException
	{
		int count = 0;
		String str;
		char data[] = new char[128];
		FileReader fr = new FileReader("C:\\Users\\r53wr\\OneDrive\\�ୱ\\����ɦV�{���]�p(java)\\java\\donkey.txt");
		BufferedReader bfr = new BufferedReader(fr) ;
		while((str=bfr.readLine())!=null)
		{
							/*�]�i��if(count==2)
									break;			*/
			
			if(count==1)
			{bfr.skip(14);}//count=1�ɤw�gŪ�J�F���ҥH�u�n��ĤT��������r�����L�Y�i
			System.out.println(str);
			
			count++;
		}
	      
	      fr.close();
	}

}
