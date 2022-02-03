package com.capgemini.stringprograms;
//reverse the words from the given string sentence
import java.util.regex.Pattern;
public class ReverseWordsInSentence 
{
	    static String reverseWords(String str)
	    {
	    	Pattern pattern = Pattern.compile("\\s");
	        String[] temp = pattern.split(str);
	        String result = "";
	  
	        for (int i = 0; i < temp.length; i++) 
	        {
	            if (i == temp.length - 1)
	                result = temp[i] + result;
	            else
	                result = " " + temp[i] + result;
	        }
	        return result;
	    }

	    public static void main(String[] args)
	   {
	        String s1 = "Welcome to Chennai";
	        System.out.println(reverseWords(s1));
	   }
}

