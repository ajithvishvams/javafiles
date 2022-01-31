package day2.java;
class ArraysForChar
{
	public static void main (String[] args)
	{		
	char[] arr;
	arr = new char[5];
	arr[0] = 'a';
	arr[1] = 'v';
	arr[2] = 'q';
	arr[3] = 'c';
	arr[4] = 'h';
	for (int i = 0; i < arr.length; i++)
		System.out.println("Element at index " + i + " : "+ arr[i]);		
	}
}
