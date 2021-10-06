package hw05;

public class CBox {
	int length;
	int width;
	int heigth;
	int volume()
	{
		return length*width*heigth ;
	}
	int surfaceArea() 
	{
		return (2*(width*width))+(4*(length*heigth)) ;
	}
	void showData()
	{
		System.out.println("length= "+length);
		System.out.println("width= "+width);
		System.out.println("heigth= "+heigth);
	}
	void showAll()
	{
		System.out.println("length= "+length);
		System.out.println("width= "+width);
		System.out.println("heigth= "+heigth);
		System.out.println("volume= "+volume());
		System.out.println("surfceArea= "+surfaceArea());
		
	}
}
package hw05;

public class hw8_5 {

	public static void main(String[] args) {

		CBox box ;
		box = new CBox();
		
		box.length = 1;
		box.width = 1;
		box.heigth = 1;
		
		
		box.showData() ;
		box.showAll();
	}

}

