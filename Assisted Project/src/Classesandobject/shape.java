package Classesandobject;

public abstract class shape {


String color; 
abstract double area(); 
public abstract String toString(); 
public void Shape(String color) 
{ 
    System.out.println("Shape constructor called"); 
    this.color = color; 
} 
public String getColor() 
{ 
    return color; 
} 
} 