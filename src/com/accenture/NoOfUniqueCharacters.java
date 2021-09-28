package com.accenture;

import java.util.ArrayList;
import java.util.List;

public class NoOfUniqueCharacters {
    public static void main(String[] args) {
        String str = "abcdabcefc";
        int result = getNoOfUniqueCharacters(str);
        System.out.println(result);
    }

    public static int getNoOfUniqueCharacters(String str)
    {
        List<Character> alreadyVisited = new ArrayList<Character>();
        int uniqueCount = 0;
        for(int i=0; i<str.length(); i++)
        {
            if(!alreadyVisited.contains(str.charAt(i)))
            {
                alreadyVisited.add(str.charAt(i));
                uniqueCount++;
            }

        }
        return uniqueCount;
    }
}
