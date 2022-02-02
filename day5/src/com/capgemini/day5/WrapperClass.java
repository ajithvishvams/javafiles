package com.capgemini.day5;
public class WrapperClass 
{

	public static void main(String[] args) 
	{

		Double a = new Double(3.24128681545451);

		Double b = new Double(70.1);
		
		float f = a.floatValue();
		
		System.out.println("Sum is: " + Double.sum(a, b));
		System.out.println("Double value is: " + a);
		System.out.println("float value is f: " + f);
		System.out.println("Double byte size: " + (Double.SIZE/8));
		System.out.println("Float byte size: " + (Float.SIZE/8));

	}
}