package com.capgemini.stringprograms;
//Write a program to remove given characters from the string
public class RemoveCharcter {
	public static void main(String[] args) {
		String str = "Java is a programming language";
		System.out.println(charRemoveAt(str, 7));
	}

	public static String charRemoveAt(String str, int p) {
		return str.substring(0, p) + str.substring(p + 1);
	}
}