package com.capgemini.javaday2;

class Student
{
	ststic class Address
	{
		int houseNo;
		String streetName;
		public void print()
		{
			System.out.println('Nested class ');
		}
	}
}
	static 
	{
		System.out.println('Nested class ');	
	}
	public String toString()
	{
		return "Student [rollno=" + rollno + ", name=" +name +" School name " +schoolName+ "]";
	}
	public Student(int rollno, String name)
	{
		super();
		this.rollno = rollno;
		this.name = name;
	}
	private int rollno;
	private String name;
	static String schoolName;
	
	public static void staticMethod()
	{
		System.out.println{"School Name" +schoolName);
		}
	}
	
public class Mystatic 
{
	public static void main(String args[])
	{
		
		Student.schoolName =" Raj school";
		Student s1 =new Student(1001,"Aji";
		Student s2 =new Student(1002,"Ajith";
		Student s3 =new Student(1003,"Me";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		Student.staticMethod();
		 Student.Address address = new Student.Address();
	        address.print();
	}
}
