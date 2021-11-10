class CWin{
	static int cnt= 0;
	static String color;
	static int width;
	static int height;
	public static void count(){
		cnt++;System.out.println(cnt);
	}
	public static void CWin(String str,int w,int h) {
		color = str;
		width = w;
		
	}
	public static void CWin() {
		color = "Red";
		width = 2;
		height = 2;	
	}
	public static void set_zero() {
		cnt=0;System.out.println(cnt);
	}
	public static  void setvalue(int n){
		cnt = n;System.out.println(cnt);
	}
	public static void show() {System.out.println(cnt);}
}

public class hw9_8 {
	public static void main(String argv[]) {
		
	}
}
