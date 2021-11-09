
package hw9_5;
public class hw9_5 {
	public static void main(String argv[]) {
		CCount cr = new CCount();
		cr.count();
		cr.show();
		CCount cr1 = new CCount();
		cr1.count();
		cr1.show();
	}
}

 class  CCount{
	static int cnt = 0;
	public   void count(){
		
		cnt++ ;
	}
	public  void set_Zero() {
		cnt = 0 ;
	}
	public  void setValue(int n) {
		cnt = n ;
	}
	public  void show()
	{
		System.out.println(cnt);
	}
}

 
 //(d) 應該使用類別變數 因為cnt要用來計算物件的數量而類別變數是所有物件共享的所以要計算物件數量需要使用類別變數
 //(e) 都行
