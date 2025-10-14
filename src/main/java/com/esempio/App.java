package com.esempio;

import com.esempio.leetcode.LeetCodeDemo;
import com.esempio.leetcode.PalindromeNumber;

// Problemi implementati:
// Two Sum (LeetCode #1)
//Longest Substring Without Repeating Characters (LeetCode #3)
//Palindrome Number (LeetCode #9)
public class App {

    // Esegue i test LeetCode e mostra le statistiche delle soluzioni.

    public static void main(String[] args) {
        System.out.println("LEETCODE SOLUTIONS - JAVA PROJECT");
        System.out.println("=".repeat(50));

        // Mostra le statistiche delle soluzioni
        LeetCodeDemo.showStatistics();

        // Esegui tutti i demo LeetCode
        LeetCodeDemo.runAllDemos();

        System.out.println(PalindromeNumber.isPalindrome(31313));
        System.out.println(PalindromeNumber.isPalindrome2(31313));
    }
}
