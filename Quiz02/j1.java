import java.util.*;
public class gg {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int s1,s2;
		System.out.println("請輸入密碼");
		s1 = sc.nextInt();
		int count = 0;
		System.out.println("請再次輸入密碼");
		
		for(;;)
		{	
		s2 = sc.nextInt();
		if(s1==s2)
		{
			System.out.println("密碼正確");
			break;
		}
		else
		{
			count++;
		}
		if(count==3) 
		{
		throw new RuntimeException("輸入三次錯誤！程式停止！");
		}
		else
			System.out.println("與第一次輸入的不同!");
		}
	
	}

}
