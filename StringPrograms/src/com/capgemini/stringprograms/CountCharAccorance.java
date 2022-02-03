package com.capgemini.stringprograms;

//count the occurrence of the given character in a string
public class CountCharAccorance {
	public static void main(String args[]) {

		String input = "aaaabbccAAdd";
		char search = 'a';
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == search)
				count++;
		}

		System.out.println("Character '" + search + "' appears " + count + " times.");
	}
}
