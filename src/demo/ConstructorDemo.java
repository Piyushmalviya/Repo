package demo;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		ConstructorDemo obj= new ConstructorDemo();
		ConstructorDemo obj1= new ConstructorDemo(1, 3);
		ConstructorDemo obj2= new ConstructorDemo(10.33, 10.33);
		
}

	public ConstructorDemo(){
		System.out.println(" this is default constructor ");
	}
	
	public ConstructorDemo(int a , int b ){
		
	int sum = a+b;
		System.out.println(sum);
		}
	
	public ConstructorDemo(double c, double d){
		double addition= c+d;
		System.out.println(addition);
	}
}
