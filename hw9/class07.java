class power{
	static int sum ;
	public static void power(int x,int n) {
		sum = x;
		for(int i=1;i<n;i++) {
			sum = sum*x ;
		}
	}
	public static void show() {System.out.println(sum);}
}

public class hw9_7 {
	public static void main (String argv[]) {
		power.power(2,5);
		power.show();
		power.power(3,2);
		power.show();
	}
}

