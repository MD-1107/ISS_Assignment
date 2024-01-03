package polymorphism;

import Inheritance.Shape;


class Circle extends Shape  //child class extending the parent class 
{
	private double radius;
	
	Circle(double radius)
	{
		this.radius=radius;
		
		System.out.println("Circle => Radius: "+this.radius);
	}
	//method overriding 
	public double calculateArea()
	{
		return 3.14*Math.pow(radius, 2);
	}
}

class Rectangle extends Shape 
{
	private double length;
	private double breadth;
	
	Rectangle(double length, double breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
		System.out.println("Rectangle=> Length: "+this.length+"\tBreadth: "+this.breadth);
	}
	
	public double calculateArea()
	{
		return length*breadth;
	}
}

public class PolymorphismExample 
{
	public static void main(String args[])
	{
		Circle circleObject=new Circle(2.5);
		
		Rectangle rectangleObject=new Rectangle(5.0, 24.0);
		
		System.out.println("The area of the circle is: "+circleObject.calculateArea());
		
		System.out.println("The area of the rectangle is: "+rectangleObject.calculateArea());
	}

}
