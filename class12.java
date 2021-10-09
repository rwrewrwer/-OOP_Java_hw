 class CWin {
	int width ; 
	int height;
	String name ;
	void setW(int w) 
	{
		width = w ;
	}
	void setH(int h)
	{
		height = h ;
	}
	void setname(String s)
	{
		name = s;
	}
	void setWindows(int h,int w)
	{
		width = w;
		height = h;
	}
	void setWindows1(String s,int h,int w)
	{
		name = s;
		width = w;
		height = h;
	}
	public void show()
	{
	System.out.println("Name="+name);
	System.out.println("W=" + width + " H="+height);
	}

public class hw8_12 {

	public static void main(String[] args) {
		CWin cw  = new CWin();
		CWin cw1  = new CWin();
		CWin cw2  = new CWin();
		cw.setname("My Windows");
		cw.setW(5);	
		cw.setH(3);	
		cw.show();
		cw1.setWindows(6,4);
		cw1.show() ;
		cw2.setWindows1("My Name",7,5);
		cw2.show();
	}

}

}

