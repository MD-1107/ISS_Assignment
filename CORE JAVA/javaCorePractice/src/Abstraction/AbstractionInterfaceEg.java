package Abstraction;

interface Shape 
{
	public void draw();
}

abstract class AbstractShape implements Shape 
{
	public abstract double calculateArea();
	
	public void displayInfo()
	{
		System.out.println("This is a shape");
	}
}

class Circle extends AbstractShape implements Shape 
{
	private double radius;
	
	public Circle(double radius)
	{
		this.radius=radius;
	}
	
	@Override
	public void draw()
	{
		System.out.println("Drawing a circle with radius: "+radius);
	}
	
	@Override
	public double calculateArea()
	{
		return Math.PI*Math.pow(radius, 2);
	}
}

public class AbstractionInterfaceEg 
{
	
	public static void main(String args[])
	{
		Circle circleObject=new Circle(6.5);
		
		drawGetInfo(circleObject);
	}
	
	private static void drawGetInfo(Shape shapeObject)
	{
		shapeObject.draw();
		
		// Check if the shape is an instance of AbstractShape before calling calculateArea
        
		 if (shapeObject instanceof AbstractShape) 
		 {
			 AbstractShape abstractShape = (AbstractShape) shapeObject;
	         System.out.println("Area of the shape: " + abstractShape.calculateArea());
	     }

	     // Call displayInfo if the shape is an instance of AbstractShape
	     if (shapeObject instanceof AbstractShape) 
	     {
	         AbstractShape abstractShape = (AbstractShape) shapeObject;
	         abstractShape.displayInfo();
	     }
	}

}
