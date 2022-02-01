package com.capgemini.day3;
class A
{

A()
{
System.out.println("A Constrcutor");	
}

public int a=100;	
public void printA()
{
	System.out.println("I am class A");
}
	
}
class B extends A
{
public int b=30;	
public void printB()
{
System.out.println("i m class B");	
}


B()
{
super();
System.out.println("B class Constructor");
super.printA();

}
	
}


public class SingleInheritance {
	
	
	public static void main(String args[])
	{	
		B b=new B();
		b.printB();
		b.printA();
		System.out.println("B Blongs to A class "+b.a);
		System.out.println("B blongs to B class "+b.b);
		
	}

}