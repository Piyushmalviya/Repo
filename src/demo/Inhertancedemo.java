package demo;

import org.testng.Assert;

class Parent{
	
	public void TestAdd(){
		System.out.println("this is addition method");
	}
	
	public void TestSubs(){
		System.out.println("this is substraction method");
	}
}


public class Inhertancedemo extends Parent {

	public static void main(String[] args) {
		
		Inhertancedemo obj= new Inhertancedemo();
		obj.TestAdd();
		obj.TestSubs();
        obj.TestDiv();
        obj.TestMultiplication();
        //Assert.assertEquals(actual, expected);
        
        Parent obj1 = new Parent();
        obj1.TestAdd();
	}
	public void TestDiv(){
		System.out.println("this is division method");
	}
	
	public void TestMultiplication(){
		System.out.println("this is Multiplication method");
	}

}
