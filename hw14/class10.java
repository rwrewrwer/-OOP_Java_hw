package hw14_10;

import java.io.*;

public class class10 {

	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("C:\\Users\\r53wr\\OneDrive\\орн▒\\rand.txt");
		FileWriter fw1 = new FileWriter("C:\\Users\\r53wr\\OneDrive\\орн▒\\rand2.txt");
		FileReader fr = new FileReader("C:\\Users\\r53wr\\OneDrive\\орн▒\\rand.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		BufferedWriter bw1 = new BufferedWriter(fw1);
		BufferedReader br = new BufferedReader(fr);
		String str;
		int i,ary[] =new int[1000]; 
		long sum = 0;
		int min,max ;
		for( i =1;i<=1000;i++)
		{
			Double a =(Math.random()*1000);
			str=Integer.toString(a.intValue());
			bw.write(str);
			bw.newLine();
			
		}
		bw.flush();
		fw.close();
		i=0;
		min = 10000;
		max=0;
		while((str = br.readLine())!= null)
		{
			
			ary[i]= Integer.parseInt(str);
			
			
			sum = sum+ary[i];
			if(min>ary[i])
			{
				min = ary[i];
			}
			if(max<ary[i])
			{
				max = ary[i];
			}
			i++ ;
		}
		System.out.println("min = "+min+" max = "+max);
		System.out.println("average = "+sum/1000);
		
		bubblesort(ary);
		for(i=0;i<1000;i++)
		{
			str = Integer.toString(ary[i]);
			bw1.write(str);
			bw1.newLine();
		}
		bw1.flush();
		fw1.close();
	}

	public static void bubblesort(int a[])
	{
		int m;
		for(int i=1;i<=a.length;i++)
		{
			for(int j=0;j<a.length-i;j++)
			{
				if(a[j]>a[j+1])
				{
					m = a[j];
					a[j] = a[j+1];
					a[j+1] = m ;
					
				}
			}
	}
	}
}
