package com.accenture;

public class StringMatcher {
    public static void main(String[] args) {
        String str1 = "succeed";
        String str2 = "crossbreed";
        int k1 = 4;
        int k2 = 7;
        int result = matchString(str1.toCharArray(), str1.length(), str2.toCharArray(), str2.length(), k1, k2);
        System.out.println(result);
    }

    public static int matchString(char [] str1, int len1, char [] str2, int len2, int k1, int k2)
    {
        String string1 = "";
        for(int i=k1; i<len1; i++)
        {
            string1+= str1[i];
        }
        System.out.println(string1);

        String string2 = "";
        for(int i=k2; i<len2; i++)
        {
            string2+= str2[i];
        }

        System.out.println(string2);

        if((string1.length()==0 || string2.length()==0) ||(string1== null && string2 == null))
            return 0;

        if(string1.equalsIgnoreCase(string2))
            return string1.length(); //if all remaining characters match then returning length of matching characters

        if(string1.length()!= string2.length() || (string1== null || string2 == null))
            return -1;

        if(string1.length() == string2.length())
        {
            for (int i = 0; i < string1.length(); i++)
            {
                if (string1.charAt(i) != string2.charAt(i))
                    return -1;
            }
        }

        return 0;
    }
}
