package com.capgemini.stringprograms;
//check if two strings are anagrams of each other
import java.util.Arrays;  

public class AnagramString 
{
	    static void isAnagram(String str1, String str2) 
	    {  
	        String s1 = str1.replaceAll("\\s", "");  
	        String s2 = str2.replaceAll("\\s", "");  
	        boolean status = true;  
	        if (s1.length() != s2.length()) 
	        {  
	            status = false;  
	        } else {  
	            char[] Arr1 = s1.toLowerCase().toCharArray();  
	            char[] Arr2 = s2.toLowerCase().toCharArray();  
	            Arrays.sort(Arr1);  
	            Arrays.sort(Arr2);  
	            status = Arrays.equals(Arr1, Arr2);  
	        }  
	        if (status) {  
	            System.out.println(s1 + " and " + s2 + " were anagrams");  
	        } else {  
	            System.out.println(s1 + " and " + s2 + " were not anagrams");  
	        }  
	    }  
	    public static void main(String[] args) 
	    {  
	        isAnagram("Keep", "Peek");  
	    }  
}  
