package hw9_1;
class CRectangle {
    int width;
       int height;
       public  CRectangle(int w,int h){
           width = w;
           height = h;
       }
       public CRectangle(){
           width = 10;
           height = 8;
       }
       public void show(){
           System.out.println(width+" "+height);
       }
       
}
 public class hw9_1a {
   public static void main(String args[]) {
           CRectangle cr = new CRectangle();
           cr.show();
       }
}
