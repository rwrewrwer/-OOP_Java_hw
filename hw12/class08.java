// CCircle.java, 此檔案置於pack6\subpack1資料夾內
package pack6.subpack1;    // 將CCircle類別納入pack6.subpack1中
public class CCircle
{
   public void show()
   {
      System.out.println("show() in class CCircle called");
   }
}
// CRectangle.java, 此檔案置於pack6\subpack2資料夾內
package pack6.subpack2;    // 將CRectangle類別納入pack6.subpack2中
public class CRectangle
{
   public void show()
   {
      System.out.println("show() in class CRectangle called");
   }
}
package pack6.subpack1.subsubpack;// 將CRectangle類別納入pack6.subpack1.subsubpack中

public class CStyle {
	public int style;
	
	public CStyle(int n)
	{
		style = n;
		System.out.println("style"+style);
	}
}
// app12_6.java,此檔案置於pack6資料夾內
package pack6;  // 將app12_6類別納入package pack6當中
import pack6.subpack1.CCircle;   // 載入pack6.subpack1裡的CCircle類別
import pack6.subpack2.CRectangle;   // 載入pack6.subpack2裡的CRectangle類別
import pack6.subpack1.subsubpack.CStyle;//載入pack6.subpack2.subsubpack裡的CRectangle類別
public class app12_6
{
   public static void main(String args[])
   {
      CCircle cir=new CCircle();
      CRectangle rect=new CRectangle();
      CStyle cs = new CStyle(1);
      cir.show();
      rect.show();
     
   }
}
