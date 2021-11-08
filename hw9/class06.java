 class add2n{
	 int sum = 0;
	 public add2n(int n) {
		 for(int i=0;i<=n;i++) {
			 sum = sum+i;
		 }
		 
	 }
	 public void show() {System.out.println(sum);}
 }
public class hw9_6{
	public static void main(String argv[]) {
		add2n ad = new add2n(5);
		ad.show();
		add2n ad1 = new add2n(10);
		ad1.show();
	}
}
