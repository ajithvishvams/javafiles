package com.capgemini.day5;

public class SwapStringWithoutThirdVariable 
{
	public static void main (String args[])
	{
		String str1="ABC";
		String str2="DEF";
		System.out.print("Before swap " + str1 +" "+ str2 +"\n");
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println("After swap: " + str1 +" "+str2);
	}
}
