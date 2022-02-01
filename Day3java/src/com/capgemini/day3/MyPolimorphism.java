package com.capgemini.day3;

class Shape
{
	public void drawShape()
	{
		System.out.println("Draw Shape");
	}
}
class Line extends Shape
{
	public void drawShape()
	{
		System.out.println("Line");
	}
}
class Circle extends Shape
{
	public void drawShape()
	{
		System.out.println("Circle");
	}
}
public class MyPolimorphism 
{
public static void main(String args[])
{
	Shape s= new Circle();
	s.drawShape();
}
}
