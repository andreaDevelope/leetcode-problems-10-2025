package com.esempio.leetcode;


public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String s2 = "";

        // System.out.println(s);

        for (int i = s.length() - 1; i >= 0; i--) {
            s2 += s.charAt(i);
        }

        if (s.equals(s2))
            return true;

        return false;
    }

}
