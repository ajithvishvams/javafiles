package com.capgemini.stringprograms;

//Check if two strings are the same ignoring their cases
public class CompareStringsIgnoreCases {

	public static void main(String[] args) {
		String myStr1 = "ajith";
		String myStr2 = "AJIth";
		String myStr3 = "Vishva";
		System.out.println(myStr1.equalsIgnoreCase(myStr2));
		System.out.println(myStr1.equalsIgnoreCase(myStr3));
	}
}