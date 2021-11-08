  class add2n{


	 public static void add2n(int n) {
		int sum = 0;
		 for(int i=0;i<=n;i++) {
			 sum = sum+i;
			
		 }
		  System.out.println(sum);
	 }
 }
public class hw9_6{
	public static void main(String argv[]) {
		add2n.add2n(5);
		add2n.add2n(10);
	}
}
