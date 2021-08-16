package com.accenture;

import java.util.HashMap;
import java.util.Map;

public class ReplaceWithNextChar {
    public static void main(String[] args) {
        String password = "abzd";
        String result ="";
        for(int i=0; i<password.length(); i++)
        {
            char next = (char) (((password.charAt(i) - 'a') +1) %26 + 'a');
            result = result + next;
        }
        System.out.println(result);

        String str = "mnzp";
        char ch[] = str.toCharArray();
        Map<Character,Character> presentToNext = new HashMap<Character,Character>();
        for(int i=0; i<ch.length; i++)
        {
            presentToNext.put(ch[i],(char)((ch[i] - 'a' +1)%26 + 'a'));
        }
        for (int i=0; i<ch.length; i++)
        {
            ch[i] = presentToNext.get(ch[i]);
        }
        System.out.println(String.valueOf(ch));

    }
}
