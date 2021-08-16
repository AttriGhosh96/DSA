package com.cognizant;

public class WordCount {
    public static void main(String[] args) {
        String str = "Today is Friday";
        str = str + " ";
        String word [] = str.split(" ");
        System.out.println("No of words: " +word.length);
        for(int i=0; i<word.length; i++)
        {
            System.out.println(word[i] + " ");
        }
    }
}
