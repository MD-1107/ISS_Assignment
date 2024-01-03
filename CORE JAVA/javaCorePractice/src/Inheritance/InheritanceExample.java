package Inheritance;
import Inheritance.Shape;

class Circle extends Shape 
{
	private double radius;
	
	public Circle(double radius)
	{
		this.radius=radius;
		System.out.println("Circle: Radius= "+radius);
		
		this.type="Circle";
	}
	
	public double calculateArea()
	{
		return Math.PI*Math.pow(radius, 2);
	}
}

public class InheritanceExample 
{
	public static void main(String argrs[])
	{
		Circle circleObject=new Circle(7.5);
		
		circleObject.describe();
		
		System.out.println("The area is: "+circleObject.calculateArea());
	}

}
