package com.esempio.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {

    // Time Complexity: O(log n) - Space Complexity: O(log n)
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

    // Time Complexity: O(log n) - Space Complexity: O(1)
    public static boolean isPalindrome2(int x) {
        int x2 = x;
        int reversedX = 0;

        if (x < 0) {
            return false;
        }

        while (x2 > 0) {
            int lastN = x2 % 10;
            x2 = x2 / 10;
            reversedX = reversedX * 10 + lastN;
        }

        if (x == reversedX)
            return true;

        return false;
    }

}
