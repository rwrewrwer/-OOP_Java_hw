 class is_prime{

	 public  is_prime(int a) {
		 int sum = 0;
	for(int i=1;i<a;i++) {
		if(a%i==0) {
			sum = sum +1;
		}
	}
		if(sum == 1) {System.out.println("YES");}
		else {System.out.println("NO");}
		
	}
	 
			
		 }
	
	
	 

public class a1 {

	public static void main(String[] args) {
		is_prime test0 = new is_prime(23);
		is_prime test1 = new is_prime(37);
		is_prime test2 = new is_prime(39);
}}
/*
YES
YES
NO
*/
