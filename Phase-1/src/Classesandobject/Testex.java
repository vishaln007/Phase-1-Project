package Classesandobject;

import java.awt.Shape;

public class Testex {

	public static void main(String[] args) 
    { 
        Shape s1 = (Shape) new Circle("Red", 2.2); 
        Shape s2 = (Shape) new Rectangle("Yellow", 2, 4);
        System.out.println(s1.toString()); 
        System.out.println(s2.toString()); 
    } 
}
