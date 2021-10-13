
class CCircle {
	 double pi = 3.14;
	 double radius;
	 
	 void area(double r)
	 {
		 radius = r;
		 System.out.println("Area= "+r*r*pi);
	 }
	 void area(float r)
	 {
		 radius = r;
		 System.out.println("Area= "+r*r*pi);
	 }
	 void area(int r)
	 {
		 radius = r;
		 System.out.println("Area= "+r*r*pi);
	 }

public class hw8_13 {

	public static void main(String[] args) {
		CCircle cir = new CCircle();
		cir.area(2);
		cir.area(2.2f);
		cir.area(2.2);

	}

}

}
