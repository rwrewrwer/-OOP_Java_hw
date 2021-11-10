class Namecard{
	private String name;
	private String address;
	private  phone data;
	class phone{
		  String company;
		  String cell;
	
	public  phone(String s1,String s2)
	{
			company = s1;
			cell = s2;
		}
	}
	public Namecard(String n,String a,String s1,String s2) {
		name = n;
		address = a;
		data = new phone(s1,s2);
	}
	public void show() {
		System.out.println("好友姓名: "+name);
		System.out.println("聯絡地址: "+address);
		System.out.println("公司電話: "+data.company);
		System.out.println("手機號碼: "+data.cell);
	}
}
public class hw9_17 {

	public static void main(String[] args) {
		Namecard na = new Namecard("Andy","123City","2345-6789","0911-336600");
		na.show();
	}

}
