package hw15_13;
class CBank
{
   private static int sum=0;
   public synchronized static void add(int n)
   {
      int tmp=sum;
      tmp=tmp+n;            // �֥[�״��`�B
      try
      {
         Thread.sleep((int)(1000*Math.random()));   // �p��0~1����
      }
      catch(InterruptedException e){}
      sum=tmp;
      System.out.println("sum= "+sum);
  }
}
class CCustomer implements Runnable // CCustomer���O�A�~�Ӧ�Thread���O
{
   public void run()        // run() method
   {
      for(int i=1;i<=3;i++)
         CBank.add(100);       // �N100�����T���פJ
   }
}
public class class13
{
   public static void main(String args[])
   {
      CCustomer c1=new CCustomer();
      CCustomer c2=new CCustomer();
      Thread t = new Thread(c1);
      Thread t1 = new Thread(c2);
      t.start();
      t1.start();
   }
}