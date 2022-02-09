package com.capgemini.day9;
//Create Lamda for Find Given Number is positive or Negative
//Create Lamda to return sequare of given number
//create Lamda to pass String and return in Upper case
//Create Lamda to pass string and return the lenght of String

@FunctionalInterface
interface PostiveOrNegative {
	public void findNumber(int num1);
}

@FunctionalInterface
interface NumberSQUR {
	public int findNumber(int num1);
}

@FunctionalInterface
interface StringUpper {
	public String convert(String str);
}

@FunctionalInterface
interface StringLength {
	public int findLenth(String str);
}

public class LamdaMethod {

	public static void main(String args[]) {

		PostiveOrNegative postiveOrNegative = num -> {
			if (num > 0)
				System.out.println("Positive Number");
			else
				System.out.println("Negative Number");
		};

		postiveOrNegative.findNumber(10);

		// skip the return keyword also
		NumberSQUR numberSQUR = num -> num * num;

		System.out.println(numberSQUR.findNumber(10));

		StringUpper strUpper = str -> str.toUpperCase();
		System.out.println(strUpper.convert("ansar"));

		StringLength length = str -> str.length();

		System.out.println(length.findLenth("ansar"));
	}

}
