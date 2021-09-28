package com.accenture;

public class FrequentCharacter {
    public static void main(String[] args) {
        String str = "jjkdkksjjdjf ";
        char ch = 'y';
        String newStr = getMostFrequentCharacterReplaced(str, ch);
        System.out.println(newStr);
    }

    public static String getMostFrequentCharacterReplaced(String str, char ch)
    {
        String newStr = "";
        int count[] = new int[256];
        for(int i=0; i<str.length(); i++)
        {
            count[str.charAt(i)]++;
        }
        System.out.println(count[97]);
        int max = -1;
        char frequentChar = ' ';
        for(int i=0; i<count.length; i++)
        {
            if(count[i] > max)
            {
                max = count[i];
                frequentChar = (char)i;
            }
        }
        System.out.println(frequentChar);

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == frequentChar)
            {
                newStr = newStr + ch;
            }
            else
                newStr = newStr + str.charAt(i);
        }

        return newStr;
    }
}
