package com.capgemini.day3;

class Parent
{
public void printParent()
{
	System.out.println("Parent class");
}
}

class Child1 extends Parent
{

public void printChild()
{
	System.out.println("Child class");
}
}
class Child2 extends Parent
{

	public void printChild()
	{
   System.out.println("Child class");		
	}
	
}

public class HierarchicalInheritance {

	public static void main(String args[])
	{
		//child one class extends Parent class
		Child1 child1=new Child1();
		child1.printChild();
		child1.printParent();
		
		
		//second child extends Parent Class
 		Child2 child2=new Child2();
		child2.printChild();
		child2.printParent();
		
     		
	}
	
}