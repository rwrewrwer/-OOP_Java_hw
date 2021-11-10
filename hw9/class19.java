class Data{
	private String name;
	private test score;
	class test{
		int english;
		int math;
		public test(int eng,int m) 
		{
			english = eng;
			math = m;
		}
		  double avg(){
			 return ((english+math)/2.0);
		 }
		
	}
	public Data(String n,int e,int m) {
		name = n;
		score = new test(e,m);
		
		
	} 
	public void show() 
	{
		System.out.println(name);
		System.out.println(score.english);
		System.out.println(score.math);
		System.out.println(score.avg());
	}
}
public class hw9_19 {

	public static void main(String[] args) {
		Data stu = new Data("Annie",85,92);
		stu.show();
	}

}
