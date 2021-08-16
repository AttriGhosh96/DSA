package com.accenture;

public class BinaryStringEvaluation {
    public static void main(String[] args) {
        String expression = "0C1A1B1C1C1B0A0";
        int result = expression.charAt(0) - '0'; //to get int
        for(int i=1; i<expression.length()-1; i++)
        {
            char operator = expression.charAt(i);
            i++;
            if(operator == 'A')
                result = result & (expression.charAt(i) - '0');
            else if(operator == 'B')
                result = result | (expression.charAt(i) - '0');
            else
                result = result ^ (expression.charAt(i) - '0');

        }
        System.out.println(result);
    }
}
