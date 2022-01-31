package com.Javatypecasting;

public class Typecasting {

	public static void main(String[] args) {
		//Implicit Conversion
		System.out.println("Implicit type Casting");
		char a='A';
		System.out.println("Value of a"+a);
		
		int b= a;
		System.out.println("Value of Int "+b);
		
		float c=a;
		System.out.println("Value of Float "+c);
		
		long d=a;
		System.out.println("Value of Long "+d);

		double e=a;
		System.out.println("Value of Double "+e);
		
		System.out.println("Explicit type Conversion");
		double x=89.90;
		int y=(int)x ;
		System.out.println("Value of x"+x);
		System.out.println("Value of y"+y);




			}

}
