
class cbbb {
	double x ;
	double y ;
	
	public class a {

	public static void main(String[] args) {
		cbbb obj1,obj2,avg ;
		 obj1 = new cbbb();
		 obj2 = new cbbb();
		 avg = new cbbb();
		 
		 obj1.x = 5.2;
		 obj1.y = 3.9;
		 
		 obj2.x = 6.5;
		 obj2.y = 4.6;
		 
		 avg.x = (obj1.x+obj2.x)/2 ;
		 avg.y = (obj1.y+obj2.y)/2 ;
	
		 System.out.println("obj1 x="+obj1.x+" y="+obj1.y);
		 System.out.println("obj2 x="+obj2.x+" y="+obj2.y);
		 System.out.println("avg  x="+avg.x+" y="+avg.y);
	}
}}
