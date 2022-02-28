package Classesandobject;

public class Circle {
	double radius; 
    public Circle(String color,double radius) 
    { 
        super(); 
        System.out.println("Circle constructor called"); 
        this.radius = radius; 
    }
    double area() 
    { 
        return Math.PI * Math.pow(radius, 2); 
    } 
    @Override
    public String toString() 
    { 
        return "Circle color is " + super.color + "and area is : " + area(); 
    } 
} 
