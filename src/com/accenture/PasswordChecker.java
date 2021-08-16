//check whether a password is valid based on certain criteria
package com.accenture;

public class PasswordChecker {
    public static void main(String[] args) {
        String password = "a987abC012";
        int result = checkPassword(password, password.length());
        System.out.println(result);

    }
    public static int checkPassword(String pwd, int n)
    {
        boolean numeric = false, upperCase = false, spaceSlash = false;
        if(n<4)
            return 0;
        if(pwd.charAt(0)>='0' && pwd.charAt(0)<='9')
            return 0;
        for(int i=0; i<n; i++)
        {
            if(pwd.charAt(i)>='0' && pwd.charAt(i)<='9')
                numeric = true;
            if(pwd.charAt(i)>='A' && pwd.charAt(i)<='Z')
                upperCase = true;
            if(pwd.charAt(i) == ' ' || pwd.charAt(i) == '/')
                spaceSlash = true;
        }
        if(numeric && upperCase && !spaceSlash)
            return 1;
        return 0;
    }
}
