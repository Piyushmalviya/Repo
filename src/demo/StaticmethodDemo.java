package demo;

public class StaticmethodDemo {

	public static void main(String[] args) {
		
		
	System.out.println("selenium webdriver");
	
	StaticmethodDemo.TestAdd();
	StaticmethodDemo.TestSubs();
	
	System.out.println("exit program");
	
	

	}

	public static void TestAdd(){
		
		int sum= 20 + 30 ;
		System.out.println(sum);
	}
	
		public static void TestSubs(){
			
			int Subs= 40-20;
			System.out.println(Subs);
	}
	
	
}
