package demo;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		
		
	System.out.println("selenium webdriver");
	
	MethodOverloadingDemo obj= new MethodOverloadingDemo();
	obj.TestAdd();
	
	obj.TestAdd(15, 20);
	
	obj.TestAdd(10.50, 20.50);
	
	obj.TestAdd(20.5, 10);
	
	obj.TestAdd(10, 10.5);

	
	System.out.println("exit program");

	}

	    public void TestAdd(){
		
		int sum= 20 + 30 ;
		System.out.println(sum);
	}
	
		public void TestAdd(int a,int b){
			
			int sum=a + b;
			System.out.println(sum);
	}
	
		public void TestAdd(double a,double b){
			double sum=a + b;
			System.out.println(sum);
			
	}
		public void TestAdd(double a, int b){
			double sum= a+b;
			System.out.println(sum);
			
		}
		
		public void TestAdd(int a, double b){
			double sum= a+b;
			System.out.println(sum);
		}
	
}
