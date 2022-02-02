package com.capgemini.day5;

public class Equals 
{
	public static void main(String [] args)
	{
		String str1=new String("Hello World");
		String str2=new String("HelloWorld");
		if(str2.equals(str1)) 
		{
			System.out.println("String is equal");
		}
		else 
		{
			System.out.println("String is not equal");
		}
	}
}
