class Cal_area {
	int width ;
	int height ;
	int lo ; 
	int ra ;
	double pi = 3.14159 ;
	public  Cal_area(int r) {
		ra = r ;
	}
	public Cal_area(int w ,int h,int l){
		 width = w;
		 height = h;
		 lo = l;
	}
	 void show1() {
		System.out.println("半徑 = "+ra);
		System.out.println("球形體積 = "+4*pi*ra*ra*ra/3);
	}
	 void  show2() {
		System.out.println("長 = "+lo+"寬 = "+width+"高 = "+height);
		System.out.println("立方體表面積 = "+(lo*height*2+width*height*2+lo*width*2));
	}
}

public class class01 {
	public static void main(String argv[]) {
	Cal_area ca0 = new Cal_area(10);
	Cal_area ca1 = new Cal_area(5,6,4);
	ca0.show1();
	ca1.show2();
	}
}
/*半徑 = 10
球形體積 = 4188.786666666667
長 = 4寬 = 5高 = 6
立方體表面積 = 148*/
