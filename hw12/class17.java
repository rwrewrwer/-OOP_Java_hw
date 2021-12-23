public class hw12_16 {
	public static void main(String argv[])
	{
	long a;
	a = Short.parseShort("262904713");//將字串轉換為短整數並將其設為變數a
	System.out.println(2*a);
	}
}

/*
     數值超過範圍

 Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"262904713" Radix:10
	at java.base/java.lang.Short.parseShort(Short.java:139)
	at java.base/java.lang.Short.parseShort(Short.java:163)
	at hw12_16.hw12_16.main(hw12_16.java:7)
 */
