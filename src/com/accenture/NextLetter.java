/*print the character whose distance is same as ch1-ch2, from ch2*/
package com.accenture;

public class NextLetter {
    public static void main(String[] args) {
        char ch1 = 'r';
        char ch2 = 'l';
        char result = nextLetter(ch1, ch2);
        System.out.println(result);
    }

    public static char nextLetter(char ch1, char ch2)
    {
        int distance = (ch2 - ch1)%26;
        System.out.println(distance);
        char result = (char) (ch2 + distance);
        return result;
    }
}
