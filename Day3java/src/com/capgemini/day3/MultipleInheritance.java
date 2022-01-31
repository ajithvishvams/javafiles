package com.capgemini.day3;

interface Parent1
{
public void printParent1();
}
class Parent2
{
public void printParent2()
{
	System.out.println("Print Parent two");
}
}
class Child3 extends Parent2 implements Parent1
{
	public void printChild()
	{
		System.out.println("Child class");
	}

	public void printParent1()
	{
		System.out.println("this is method from parent 1");
	}
}
public class MultipleInheritance {

	
	public static void main(String args[])
	{
		Child3 child=new Child3();
		child.printChild();
		child.printParent1();
		child.printParent2();
	
	}
}