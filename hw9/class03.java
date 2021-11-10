  class Caaa{
	
	 int value;
	public Caaa() {
		value = 10;
		System.out.println("value = "+value);
	}
	public Caaa(int i) {
		value = i;
		System.out.println("value = "+value);
	}
}
public class hw9_3
{
   public static void main(String args[])
   {
	   Caaa obj1 = new Caaa();//呼叫第5行的Caaa()
	   Caaa obj2 = new Caaa(12); //呼叫第9行Caaa(int i)
	   
   }
}
//(c) 不行 在開發平台上顯示錯誤
//(d) 可以 沒影響 public是公有的
