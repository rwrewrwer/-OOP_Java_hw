class CCircle      
{
   private static double pi=3.14;
   private double radius;

   public CCircle(double r)       
   {
      radius=r;
   }
   public void show()
   {
      System.out.println("area="+pi*radius*radius);
   }
}
public class hw9_16
{
   public static void main(String args[])
   {
      CCircle cir[];
      cir = new CCircle[6];
      
      for(int i=0;i<=5;i++) {
    	  cir[i]=new CCircle (i);
    	  cir[i].show();
      }
      
   }
}
