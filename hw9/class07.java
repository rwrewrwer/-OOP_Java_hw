class power{
	int sum ;
	public power(int x,int n) {
		sum = x;
		for(int i=1;i<n;i++) {
			sum = sum*x ;
		}
	}
	public void show() {System.out.println(sum);}
}

public class hw9_7 {
	public static void main (String argv[]) {
		power p = new power(2,5);
		p.show();
		power p1 = new power(3,2);
		p1.show();
	}
}
