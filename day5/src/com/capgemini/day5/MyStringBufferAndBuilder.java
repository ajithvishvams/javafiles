package com.capgemini.day5;

public class MyStringBufferAndBuilder {

	public static void main(String arg[]) {
		String str = "ABCD";

		str = str.concat(" EFGH");
		System.out.println(str);
		StringBuffer sbf = new StringBuffer("abcd");
		sbf.append(" java");
		System.out.println(sbf);

		sbf.delete(2, 5);
		System.out.println(sbf);

		StringBuilder sb=new StringBuilder("Hello Java");
       System.out.println(sb);
       sb.append(" Hello");

       System.out.println(sb);
	}

}