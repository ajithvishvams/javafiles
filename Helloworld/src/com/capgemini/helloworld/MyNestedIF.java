package com.capgemini.helloworld;

public class MyNestedIF {
	public static void main(String args[])
	{
		int a=10;
		int b=20;
		int c=5;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is greater");
			}
			else
			{
				System.out.println("C is greater");
			}
		}
		else
		{
		 System.out.println("B is greater");
		}
	}

}