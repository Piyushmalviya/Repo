package demo;



public class EncapsulationDemo {

	public static void main(String[] args) {
		
		
	System.out.println("selenium webdriver");	
	
	EncapsulationDemo obj= new EncapsulationDemo();
	obj.TestAdd();
	
	EncapsulationDemo obj1= new EncapsulationDemo();
	obj1.TestSubs();
	
	
	System.out.println("exit program");

	}

	public void TestAdd(){
		
		int sum= 20 + 30 ;
		System.out.println(sum);
	}
	
		public void TestSubs(){
			
			int Subs= 40-20;
			System.out.println(Subs);
	}
	
	
}
