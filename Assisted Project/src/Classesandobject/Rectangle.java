package Classesandobject;

public class Rectangle extends shape {

	double length; 
    double width; 
    public Rectangle(String color,double length,double width) 
    { 
        super(color); 
        System.out.println("Rectangle constructor called"); 
        this.length = length; 
        this.width = width; 
    } 
    double area() 
    { 
        return length*width; 
    } 
    
    public String toString() 
    { 
        return "Rectangle color is " + super.color +  
                           "and area is : " + area(); 
    } 
} 
