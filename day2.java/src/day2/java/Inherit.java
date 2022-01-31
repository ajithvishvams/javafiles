package day2.java;

class A
{
	public int a=10;
	public void printA()
	{
		System.out.println("I am class A");
	}
}
class B extends A
{
	public int b=20;
	public void printB()
	{
		System.out.println("I am class B");
	}
}
public class Inherit 
{
	public static void main (String args[])
	{
		B b=new B();
		b.printB();
		b.printA();
		System.out.println("B Belongs to A class " +b.a);
		System.out.println("B Belongs to B class " +b.b);
	}
}
