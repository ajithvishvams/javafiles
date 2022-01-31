package com.capgemini.helloworld;

public class Mycontinue {

	public static void main(String args[])
	{
		int i=1;
		for(i=1;i<=15;i++)
		{
			if(i==9)
			{
				continue;
			}
			if(i%2==0)
			{
				System.out.println("Even "+i);
			}
			else
			{
				System.out.println("ODD "+i);
			}
		}
	}
}
