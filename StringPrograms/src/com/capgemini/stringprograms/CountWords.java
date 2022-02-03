package com.capgemini.stringprograms;
//Count the number of words in a given string sentence
import java.util.*;
public class CountWords 
{
    public static void main(String[] args) {  
        String sentence;  
        int wordCount = 0;  
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the line:");  
          sentence=sc.nextLine();
        for(int i = 0; i < sentence.length()-1; i++) 
        {  
            if(sentence.charAt(i) == ' ' && Character.isLetter(sentence.charAt(i+1)) && (i > 0)) {  
                wordCount++;  
            }  
        }
        wordCount++;  
 
        System.out.println("No of words: " + wordCount);  
    }  
}