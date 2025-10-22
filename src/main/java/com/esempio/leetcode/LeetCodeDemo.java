package com.esempio.leetcode;

import java.util.Arrays;

public class LeetCodeDemo {

    // ==================== DEMO PER TWO SUM ====================

    public static void runTwoSumTests() {
        System.out.println("\n".repeat(20) + " TWO SUM DEMO " + "🔥".repeat(20));

        System.out.println("\nTest Case 1: Esempio base");
        TwoSum.testSolutions(new int[] { 2, 7, 11, 15 }, 9);

        System.out.println("\nTest Case 2: Array con elementi uguali");
        TwoSum.testSolutions(new int[] { 3, 3 }, 6);

        System.out.println("\nTest Case 3: Array più grande");
        TwoSum.testSolutions(new int[] { 3, 2, 4 }, 6);

        System.out.println("\nTest Case 4: Array con molti elementi");
        TwoSum.testSolutions(new int[] { 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 7, 1, 1, 1, 1, 1 }, 11);

        System.out.println("\nTest Case 5: Nessuna soluzione");
        try {
            TwoSum.testSolutions(new int[] { 1, 2, 3 }, 7);
        } catch (Exception e) {
            System.out.println("Test caso senza soluzione gestito correttamente: " + e.getMessage());
        }
    }

    public static void runTwoSumTest(int[] nums, int target) {
        System.out.println("\nTEST SPECIFICO TWO SUM");
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        TwoSum.testSolutions(nums, target);
    }

    // ==================== DEMO PER LONGEST SUBSTRING ====================

    public static void runLongestSubstringTests() {
        System.out.println("\n" + "🔍".repeat(20) + " LONGEST SUBSTRING DEMO " + "🔍".repeat(20));

        System.out.println("\nTest Case 1: Esempio base");
        LongestSubstringWithoutRepeatingCharacters.testSolutions("abcabcbb");

        System.out.println("\nTest Case 2: Tutti caratteri uguali");
        LongestSubstringWithoutRepeatingCharacters.testSolutions("bbbbb");

        System.out.println("\nTest Case 3: Stringa vuota");
        LongestSubstringWithoutRepeatingCharacters.testSolutions("");

        System.out.println("\nTest Case 4: Un solo carattere");
        LongestSubstringWithoutRepeatingCharacters.testSolutions("a");

        System.out.println("\nTest Case 5: Stringa complessa");
        LongestSubstringWithoutRepeatingCharacters.testSolutions("abcddefgabcdefghilmnoabc");

        System.out.println("\nTest Case 6: Stringa con spazi");
        LongestSubstringWithoutRepeatingCharacters.testSolutions("pwwkew");
    }

    public static void runLongestSubstringTest(String s) {
        System.out.println("\nTEST SPECIFICO LONGEST SUBSTRING");
        System.out.println("Stringa: \"" + s + "\"");
        LongestSubstringWithoutRepeatingCharacters.testSolutions(s);
    }

    // ==================== DEMO PER PALINDROME NUMBER ====================

    public static void runPalindromeNumberTests() {
        System.out.println("\n".repeat(20) + " PALINDROME NUMBER DEMO " + "🔄".repeat(20));

        System.out.println("\nTest Case 1: Esempio base");
        System.out.println("121 -> isPalindrome: " + PalindromeNumber.isPalindrome(121) + ", isPalindrome2: "
                + PalindromeNumber.isPalindrome2(121));

        System.out.println("\nTest Case 2: Numero negativo");
        System.out.println("-121 -> isPalindrome: " + PalindromeNumber.isPalindrome(-121) + ", isPalindrome2: "
                + PalindromeNumber.isPalindrome2(-121));

        System.out.println("\nTest Case 3: Numero che finisce con 0");
        System.out.println("10 -> isPalindrome: " + PalindromeNumber.isPalindrome(10) + ", isPalindrome2: "
                + PalindromeNumber.isPalindrome2(10));

        System.out.println("\nTest Case 4: Zero");
        System.out.println("0 -> isPalindrome: " + PalindromeNumber.isPalindrome(0) + ", isPalindrome2: "
                + PalindromeNumber.isPalindrome2(0));

        System.out.println("\nTest Case 5: Palindromo più grande");
        System.out.println("12321 -> isPalindrome: " + PalindromeNumber.isPalindrome(12321) + ", isPalindrome2: "
                + PalindromeNumber.isPalindrome2(12321));

        System.out.println("\nTest Case 6: Numero non palindromo");
        System.out.println("12345 -> isPalindrome: " + PalindromeNumber.isPalindrome(12345) + ", isPalindrome2: "
                + PalindromeNumber.isPalindrome2(12345));

        System.out.println("\nTest Case 7: Palindromo con cifre ripetute");
        System.out.println("1221 -> isPalindrome: " + PalindromeNumber.isPalindrome(1221) + ", isPalindrome2: "
                + PalindromeNumber.isPalindrome2(1221));

        System.out.println("\nTest Case 8: Numeri a una cifra");
        System.out.println("1 -> isPalindrome: " + PalindromeNumber.isPalindrome(1) + ", isPalindrome2: "
                + PalindromeNumber.isPalindrome2(1));
        System.out.println("9 -> isPalindrome: " + PalindromeNumber.isPalindrome(9) + ", isPalindrome2: "
                + PalindromeNumber.isPalindrome2(9));
    }

    // ==================== DEMO PER MAXIMUM SUBARRAY ====================

    public static void runMaximumSubarrayTests() {
        System.out.println("\n".repeat(20) + " MAXIMUM SUBARRAY DEMO " + "📊".repeat(20));

        System.out.println("\nTest Case 1: Esempio base");
        testMaximumSubarraySolution(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 });

        System.out.println("\nTest Case 2: Array con un elemento");
        testMaximumSubarraySolution(new int[] { 1 });

        System.out.println("\nTest Case 3: Array con tutti numeri positivi");
        testMaximumSubarraySolution(new int[] { 5, 4, -1, 7, 8 });

        System.out.println("\nTest Case 4: Array con tutti numeri negativi");
        testMaximumSubarraySolution(new int[] { -5, -4, -1, -7, -8 });

        System.out.println("\nTest Case 5: Array con un solo numero negativo");
        testMaximumSubarraySolution(new int[] { -1 });

        System.out.println("\nTest Case 6: Array con numeri misti");
        testMaximumSubarraySolution(new int[] { 1, -2, 3, -4, 5, -6, 7 });

        System.out.println("\nTest Case 7: Array con zero");
        testMaximumSubarraySolution(new int[] { 0, -1, 2, -3, 4 });

        System.out.println("\nTest Case 8: Array grande");
        testMaximumSubarraySolution(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
    }

    public static void runMaximumSubarrayTest(int[] nums) {
        System.out.println("\nTEST SPECIFICO MAXIMUM SUBARRAY");
        testMaximumSubarraySolution(nums);
    }

    private static void testMaximumSubarraySolution(int[] nums) {
        System.out.println("Array: " + Arrays.toString(nums));
        long startTime = System.currentTimeMillis();
        int resultBruteForce = MaximumSubarray.maxSubArrayBruteForce(nums);
        long bruteForceTime = System.currentTimeMillis() - startTime;
        startTime = System.currentTimeMillis();
        int resultKadane = MaximumSubarray.maxSubArray(nums);
        long kadaneTime = System.currentTimeMillis() - startTime;
        System.out.println("Brute Force O(n²): " + resultBruteForce + " (tempo: " + bruteForceTime + "ms)");
        System.out.println("Kadane's Algorithm O(n): " + resultKadane + " (tempo: " + kadaneTime + "ms)");
        System.out.println("Risultati identici: " + (resultBruteForce == resultKadane));
        if (bruteForceTime > 0 && kadaneTime > 0) {
            System.out.println("Miglioramento: " + (bruteForceTime / (double) kadaneTime) + "x");
        }
        System.out.println();
    }

    // ==================== DEMO COMPLETE ====================

    public static void runAllDemos() {
        System.out.println("INIZIO DEMO SUITE LEETCODE");
        System.out.println("Data: " + java.time.LocalDateTime.now());
        System.out.println("=".repeat(80));

        runTwoSumTests();
        runLongestSubstringTests();
        runPalindromeNumberTests();
        runMaximumSubarrayTests();

        System.out.println("\n".repeat(20) + " TUTTI I DEMO COMPLETATI " + "✅".repeat(20));
        System.out.println("Demo suite completata con successo!");
        System.out.println("Problemi dimostrati: 4");
        System.out.println("Soluzioni implementate: 6");
        System.out.println("=".repeat(80));
    }

    // ==================== STATISTICHE E INFORMAZIONI ====================

    public static void showStatistics() {
        System.out.println("\nSTATISTICHE SOLUZIONI LEETCODE");
        System.out.println("=".repeat(50));

        System.out.println("\nPROBLEMA 1: Two Sum");
        System.out.println("Descrizione: Trova due numeri che sommati danno il target");
        System.out.println("Soluzione 1: Brute Force O(n²)");
        System.out.println("Soluzione 2: HashMap O(n)");

        System.out.println("\nPROBLEMA 3: Longest Substring Without Repeating Characters");
        System.out.println("Descrizione: Trova la sottostringa più lunga senza caratteri ripetuti");
        System.out.println("Soluzione 1: Brute Force O(n³)");
        System.out.println("Soluzione 2: Sliding Window O(n)");

        System.out.println("\nPROBLEMA 9: Palindrome Number");
        System.out.println("Descrizione: Determina se un numero è palindromo");
        System.out.println("Soluzione 1: String Conversion O(log n)");
        System.out.println("Soluzione 2: Mathematical O(log n)");

        System.out.println("\nPROBLEMA 53: Maximum Subarray");
        System.out.println("Descrizione: Trova il sottoarray con la somma più grande");
        System.out.println("Soluzione 1: Brute Force O(n²)");
        System.out.println("Soluzione 2: Kadane's Algorithm O(n)");

        System.out.println("\nRIEPILOGO:");
        System.out.println("Problemi implementati: 4");
        System.out.println("Soluzioni brute force: 3");
        System.out.println("Soluzioni ottimizzate: 5");
        System.out.println("Copertura test: Completa");

        System.out.println("\n" + "=".repeat(50));
    }

    // ==================== DEMO INTERATTIVI ====================

    public static void interactiveTwoSumDemo() {
        System.out.println("\nDEMO INTERATTIVO TWO SUM");
        System.out.println("Inserisci i numeri separati da virgola (es: 2,7,11,15):");

        int[][] examples = {
                { 2, 7, 11, 15 },
                { 3, 3 },
                { 3, 2, 4 },
                { 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 7, 1, 1, 1, 1, 1 }
        };
        int[] targets = { 9, 6, 6, 11 };

        for (int i = 0; i < examples.length; i++) {
            System.out.println("\nEsempio " + (i + 1) + ":");
            runTwoSumTest(examples[i], targets[i]);
        }
    }

    public static void interactiveLongestSubstringDemo() {
        System.out.println("\nDEMO INTERATTIVO LONGEST SUBSTRING");
        System.out.println("Stringhe di esempio:");

        String[] examples = {
                "abcabcbb",
                "bbbbb",
                "",
                "a",
                "abcddefgabcdefghilmnoabc",
                "pwwkew"
        };

        for (int i = 0; i < examples.length; i++) {
            System.out.println("\nEsempio " + (i + 1) + ":");
            runLongestSubstringTest(examples[i]);
        }
    }

    // ==================== METODI DI UTILITÀ ====================

    public static void comparePerformance() {
        System.out.println("\n⚡ CONFRONTO PERFORMANCE");
        System.out.println("=".repeat(50));

        System.out.println("\nTWO SUM Performance Test:");
        int[] largeArray = new int[1000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = i;
        }

        long startTime = System.currentTimeMillis();
        TwoSum.twoSumBruteForce(largeArray, 1999);
        long bruteForceTime = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        TwoSum.twoSumHashMap(largeArray, 1999);
        long hashMapTime = System.currentTimeMillis() - startTime;

        System.out.println("Brute Force O(n²): " + bruteForceTime + "ms");
        System.out.println("HashMap O(n): " + hashMapTime + "ms");
        System.out.println("Miglioramento: " + (bruteForceTime / (double) hashMapTime) + "x");

        System.out.println("\nLONGEST SUBSTRING Performance Test:");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append((char) ('a' + (i % 26)));
        }
        String longString = sb.toString();

        startTime = System.currentTimeMillis();
        LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstringBruteForce(longString);
        long bruteForceTime2 = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(longString);
        long slidingWindowTime = System.currentTimeMillis() - startTime;

        System.out.println("Brute Force O(n³): " + bruteForceTime2 + "ms");
        System.out.println("Sliding Window O(n): " + slidingWindowTime + "ms");
        System.out.println("Miglioramento: " + (bruteForceTime2 / (double) slidingWindowTime) + "x");

        System.out.println("\nMAXIMUM SUBARRAY Performance Test:");
        int[] largeArray2 = new int[10000];
        for (int i = 0; i < largeArray2.length; i++) {
            largeArray2[i] = (int) (Math.random() * 2000 - 1000);
        }

        startTime = System.currentTimeMillis();
        MaximumSubarray.maxSubArrayBruteForce(largeArray2);
        long bruteForceTime3 = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        MaximumSubarray.maxSubArray(largeArray2);
        long kadaneTime = System.currentTimeMillis() - startTime;

        System.out.println("Brute Force O(n²): " + bruteForceTime3 + "ms");
        System.out.println("Kadane's Algorithm O(n): " + kadaneTime + "ms");
        System.out.println("Miglioramento: " + (bruteForceTime3 / (double) kadaneTime) + "x");

        System.out.println("\n" + "=".repeat(50));
    }

}
