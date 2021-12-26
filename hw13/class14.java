import java.util.*;
class IntergerTooSmall extends Exception
{}
class IntergerTooLarge extends Exception
{}
public class hw13_14 {
	public static void main(String argv[]) 
	{
		
		int a;
		Scanner sc = new Scanner(System.in);
		try
		{
			a =sc.nextInt();
			if(a<10)
			{
				throw new IntergerTooSmall();
			}
			else if(a>70)
			{
				throw new IntergerTooLarge();
			}
			else
			{
				System.out.println("num = "+a);
			}}
		catch(IntergerTooSmall e)
		{
			System.out.println("您所輸入的整數的值太小");
		}
		catch(IntergerTooLarge e)
		{
			System.out.println("您所輸入的整數的值太大");
		}
		catch(InputMismatchException e)
		{
			System.out.println("您輸入的不是整數");
		}
		
	}
}
