
 class CTest {
	int a ;
	
	void test()
	{
		if(a%2 != 0) {System.out.println("���Ƭ��_��");}
		if(a%2 == 0) {if(a!=0) {System.out.println("���Ƭ�����");}}
		if(a == 0) {System.out.println("���Ƭ�0");}
	}package hw07;

public class hw8_7 {

	public static void main(String[] args) {
		CTest test1 =new CTest();
		CTest test2 =new CTest();
		CTest test3 =new CTest();
		test1.a = 3;
		test2.a = 8;
		test3.a = 0;		
		
		test1.test();
		test2.test();
		test3.test();
	}

}

}
