package com.capgemini.day5;

public class EqualsIgnoreCase 
{
	public static void main(String [] args)
	{
		String str1=new String("Hello World");
		String str2=new String("Hello World");
		if(str2.equalsIgnoreCase(str1)) 
		{
			System.out.println("String is equal");
		}
		else 
		{
			System.out.println("String is not equal");
		}
	}
}
