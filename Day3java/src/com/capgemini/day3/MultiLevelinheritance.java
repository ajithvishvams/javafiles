package com.capgemini.day3;
class A1
{
	public void printA()
	{
		System.out.println("class A");
	}
}
class B1 extends A1
{
	public void printB()
	{
		System.out.println("class B");
	}
}

class C1 extends B1
{
	public void printC()
	{
		System.out.println("class C");
	}
	
}


class D1 extends C1
{
	public void printD()
	{
		System.out.println("class D");
	}
}

public class MultiLevelinheritance {
	
	
	public static void main(String args[])
	{
     D1 d=new D1();
     d.printA();
     d.printB();
     d.printC();
     d.printD();
    
     
	}

}