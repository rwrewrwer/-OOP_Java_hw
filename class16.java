

	 CSphere {
		double pi=3.14;
		private int x;
		private int y;
		private int z;
		private int radius;
		
		void setLocation(int x1,int y1,int z1)
		{
			x=x1;
			y=y1;
			z=z1;
		}
		void setRadius(int r)
		{
			radius = r;
			
		}
		double surfaceArea() 
		{
			 return 4*pi*radius*radius ;
		}
		double volume()
		{
			return 4*pi*radius*radius*radius/3 ;
		}
		void showCenter()
		{
			System.out.println("x="+x+" y="+y+" z="+z);
		}

public class hw8_16 {

	public static void main(String[] args) {
		CSphere CS = new CSphere();
		CS.setLocation(3,4,5);
		CS.setRadius(1);
		CS.surfaceArea();
		CS.volume();
		CS.showCenter();
	}

}

}

