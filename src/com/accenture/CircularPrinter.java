package com.accenture;

public class CircularPrinter {
    public static void main(String[] args) {
        String str = "XFWC";
        int result = getTime(str);
        System.out.println(result);
    }

    public static int getTime(String s)
    {
        int count = Math.min((s.charAt(0) - 'A'), (26 - (s.charAt(0) - 'A')));
        int differenceAntiClockwise=0, differenceClockwise=0;
        for(int i=0; i<s.length()-1; i++)
        {
            differenceClockwise = Math.abs((s.charAt(i) - s.charAt(i+1))%26);
            differenceAntiClockwise = 26 - Math.abs((s.charAt(i) - s.charAt(i+1))%26);
            //System.out.println(Math.min(differenceClockwise, differenceAntiClockwise));
            count += Math.min(differenceClockwise, differenceAntiClockwise);
        }
        return count;
    }
}
