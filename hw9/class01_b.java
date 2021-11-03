package hw9_1;
class CRectangle {
	    int width;
	    int height;
 CRectangle() {
	this(10,8);
}
public  CRectangle(int w,int h){
	    width = w;
	    height = h;
	       }
public void show() {
	System.out.println(width+" "+height);
}
	       }
	       
public class hw9_1b {
	public static void main(String argv[]) {
		CRectangle cr = new CRectangle();
		cr.show();
	}
	}
	      

