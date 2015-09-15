package demo;

public class ReturnTypeDemo {

	public static void main(String[] args) {
		
		ReturnTypeDemo obj= new ReturnTypeDemo();
		int sum =obj.TestAdd();
		double sum1=obj.Testadd1();
		System.out.println(sum);
		System.out.println(sum1);
		double sum2= obj.testAdd2();
		System.out.println(sum2);

	}
	
	public int TestAdd(){
		
		int sum= 10+60;
		return sum;
	}
	
	public double Testadd1(){
		double sum= 10.5+0.5;
		return sum;
	}
	public double testAdd2(){
		
		double sum= 20+10.5;
		return sum;
	}

}
