public class hw9_18
{
   public static void main(String args[])
   {
      (
         new  CCircle()        // 建立匿名內部類別Caaa的物件
         {
          void setr(double ra) 
          {
        	  radius = ra;
        	System.out.println(radius*radius*pi)  ;
          }
         }
      ).setr(2);     // 執行匿名內部類別裡所定義的method
   }

   static class CCircle    // 內部類別Caaa
   {
       public double pi = 3.14;
       public double radius;
       public void CCircle(double r) {
    	   radius = r;
       }
   }
}
