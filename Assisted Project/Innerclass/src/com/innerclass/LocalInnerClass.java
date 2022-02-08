package com.innerclass;

public class LocalInnerClass {
 void validate(int age)
 {
	 class Inner {
		 void test()
		 {
			 System.out.println("Now Authenticate User Adhar");
			 
		 }
 }
	 Inner inner = new Inner();
	 inner.test();
 }
 
 
	public static void main(String[] args) {
		
		LocalInnerClass Local=new LocalInnerClass();
		Local.validate(45);
		

	}

}
