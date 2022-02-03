package day6;
interface A
{
int a=10;
public void print();	
}
class OuterClass {
	
	InnerClass innerClass=new InnerClass();

	public void printOuter() {
		System.out.println("Outer class");
		innerClass.printInnerClass();
	}
	 class  InnerClass {
		public void printInnerClass() {
			System.out.println("Inner class");
		  
		}
	}
}

public class InnerClass 
{
	public static void main(String args[])
	{
		OuterClass outerClass=new OuterClass();
		outerClass.printOuter();
		A objA=new  A() {
			
			@Override
			public void print() 
			{
				System.out.println("Anoymonus Inner class");
				System.out.println(a);
			}
		};
		objA.print();
	}
}