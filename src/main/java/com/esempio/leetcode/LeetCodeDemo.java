package com.esempio.leetcode;

import java.util.Arrays;

/**
 * Classe per demo e visualizzazione dei problemi LeetCode.
 * Questa classe mantiene la funzionalità di visualizzazione step-by-step
 * per scopi didattici e debugging.
 */
public class LeetCodeDemo {

    // ==================== DEMO PER TWO SUM ====================

    /**
     * Esegue tutti i test per il problema Two Sum con output dettagliato
     */
    public static void runTwoSumTests() {
        System.out.println("\n" + "🔥".repeat(20) + " TWO SUM DEMO " + "🔥".repeat(20));

        // Test case 1: Esempio base
        System.out.println("\n📝 Test Case 1: Esempio base");
        TwoSum.testSolutions(new int[] { 2, 7, 11, 15 }, 9);

        // Test case 2: Array con elementi uguali
        System.out.println("\n📝 Test Case 2: Array con elementi uguali");
        TwoSum.testSolutions(new int[] { 3, 3 }, 6);

        // Test case 3: Array più grande
        System.out.println("\n📝 Test Case 3: Array più grande");
        TwoSum.testSolutions(new int[] { 3, 2, 4 }, 6);

        // Test case 4: Array con molti elementi
        System.out.println("\n📝 Test Case 4: Array con molti elementi");
        TwoSum.testSolutions(new int[] { 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 7, 1, 1, 1, 1, 1 }, 11);

        // Test case 5: Nessuna soluzione
        System.out.println("\n📝 Test Case 5: Nessuna soluzione");
        try {
            TwoSum.testSolutions(new int[] { 1, 2, 3 }, 7);
        } catch (Exception e) {
            System.out.println("✅ Test caso senza soluzione gestito correttamente: " + e.getMessage());
        }
    }

    /**
     * Esegue un test specifico per Two Sum
     */
    public static void runTwoSumTest(int[] nums, int target) {
        System.out.println("\n🎯 TEST SPECIFICO TWO SUM");
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        TwoSum.testSolutions(nums, target);
    }

    // ==================== DEMO PER LONGEST SUBSTRING ====================

    /**
     * Esegue tutti i test per il problema Longest Substring con output dettagliato
     */
    public static void runLongestSubstringTests() {
        System.out.println("\n" + "🔍".repeat(20) + " LONGEST SUBSTRING DEMO " + "🔍".repeat(20));

        // Test case 1: Esempio base
        System.out.println("\n📝 Test Case 1: Esempio base");
        LongestSubstringWithoutRepeatingCharacters.testSolutions("abcabcbb");

        // Test case 2: Tutti caratteri uguali
        System.out.println("\n📝 Test Case 2: Tutti caratteri uguali");
        LongestSubstringWithoutRepeatingCharacters.testSolutions("bbbbb");

        // Test case 3: Stringa vuota
        System.out.println("\n📝 Test Case 3: Stringa vuota");
        LongestSubstringWithoutRepeatingCharacters.testSolutions("");

        // Test case 4: Un solo carattere
        System.out.println("\n📝 Test Case 4: Un solo carattere");
        LongestSubstringWithoutRepeatingCharacters.testSolutions("a");

        // Test case 5: Stringa complessa
        System.out.println("\n📝 Test Case 5: Stringa complessa");
        LongestSubstringWithoutRepeatingCharacters.testSolutions("abcddefgabcdefghilmnoabc");

        // Test case 6: Stringa con spazi
        System.out.println("\n📝 Test Case 6: Stringa con spazi");
        LongestSubstringWithoutRepeatingCharacters.testSolutions("pwwkew");
    }

    /**
     * Esegue un test specifico per Longest Substring
     */
    public static void runLongestSubstringTest(String s) {
        System.out.println("\n🎯 TEST SPECIFICO LONGEST SUBSTRING");
        System.out.println("Stringa: \"" + s + "\"");
        LongestSubstringWithoutRepeatingCharacters.testSolutions(s);
    }

    // ==================== DEMO PER PALINDROME NUMBER ====================

    public static void runPalindromeNumberTests() {
        System.out.println("\n" + "🔄".repeat(20) + " PALINDROME NUMBER DEMO " + "🔄".repeat(20));

        System.out.println("\n📝 Test Case 1: Esempio base");
        System.out.println("121 -> isPalindrome: " + PalindromeNumber.isPalindrome(121) + ", isPalindrome2: " + PalindromeNumber.isPalindrome2(121));

        System.out.println("\n📝 Test Case 2: Numero negativo");
        System.out.println("-121 -> isPalindrome: " + PalindromeNumber.isPalindrome(-121) + ", isPalindrome2: " + PalindromeNumber.isPalindrome2(-121));

        System.out.println("\n📝 Test Case 3: Numero che finisce con 0");
        System.out.println("10 -> isPalindrome: " + PalindromeNumber.isPalindrome(10) + ", isPalindrome2: " + PalindromeNumber.isPalindrome2(10));

        System.out.println("\n📝 Test Case 4: Zero");
        System.out.println("0 -> isPalindrome: " + PalindromeNumber.isPalindrome(0) + ", isPalindrome2: " + PalindromeNumber.isPalindrome2(0));

        System.out.println("\n📝 Test Case 5: Palindromo più grande");
        System.out.println("12321 -> isPalindrome: " + PalindromeNumber.isPalindrome(12321) + ", isPalindrome2: " + PalindromeNumber.isPalindrome2(12321));

        System.out.println("\n📝 Test Case 6: Numero non palindromo");
        System.out.println("12345 -> isPalindrome: " + PalindromeNumber.isPalindrome(12345) + ", isPalindrome2: " + PalindromeNumber.isPalindrome2(12345));

        System.out.println("\n📝 Test Case 7: Palindromo con cifre ripetute");
        System.out.println("1221 -> isPalindrome: " + PalindromeNumber.isPalindrome(1221) + ", isPalindrome2: " + PalindromeNumber.isPalindrome2(1221));

        System.out.println("\n📝 Test Case 8: Numeri a una cifra");
        System.out.println("1 -> isPalindrome: " + PalindromeNumber.isPalindrome(1) + ", isPalindrome2: " + PalindromeNumber.isPalindrome2(1));
        System.out.println("9 -> isPalindrome: " + PalindromeNumber.isPalindrome(9) + ", isPalindrome2: " + PalindromeNumber.isPalindrome2(9));
    }

    // ==================== DEMO COMPLETE ====================

    public static void runAllDemos() {
        System.out.println("🚀 INIZIO DEMO SUITE LEETCODE");
        System.out.println("Data: " + java.time.LocalDateTime.now());
        System.out.println("=".repeat(80));

        // Esegui tutti i demo
        runTwoSumTests();
        runLongestSubstringTests();
        runPalindromeNumberTests();

        System.out.println("\n" + "✅".repeat(20) + " TUTTI I DEMO COMPLETATI " + "✅".repeat(20));
        System.out.println("Demo suite completata con successo!");
        System.out.println("Problemi dimostrati: 3");
        System.out.println("Soluzioni implementate: 5");
        System.out.println("=".repeat(80));
    }

    // ==================== STATISTICHE E INFORMAZIONI ====================

    public static void showStatistics() {
        System.out.println("\n📊 STATISTICHE SOLUZIONI LEETCODE");
        System.out.println("=".repeat(50));

        System.out.println("\n🔢 PROBLEMA 1: Two Sum");
        System.out.println("Descrizione: Trova due numeri che sommati danno il target");
        System.out.println("Soluzione 1: Brute Force O(n²)");
        System.out.println("Soluzione 2: HashMap O(n)");

        System.out.println("\n🔤 PROBLEMA 3: Longest Substring Without Repeating Characters");
        System.out.println("Descrizione: Trova la sottostringa più lunga senza caratteri ripetuti");
        System.out.println("Soluzione 1: Brute Force O(n³)");
        System.out.println("Soluzione 2: Sliding Window O(n)");

        System.out.println("\n🔄 PROBLEMA 9: Palindrome Number");
        System.out.println("Descrizione: Determina se un numero è palindromo");
        System.out.println("Soluzione 1: String Conversion O(log n)");
        System.out.println("Soluzione 2: Mathematical O(log n)");

        System.out.println("\n📈 RIEPILOGO:");
        System.out.println("Problemi implementati: 3");
        System.out.println("Soluzioni brute force: 2");
        System.out.println("Soluzioni ottimizzate: 4");
        System.out.println("Copertura test: Completa");

        System.out.println("\n" + "=".repeat(50));
    }

    // ==================== DEMO INTERATTIVI ====================

    // Demo interattivo per Two Sum

    public static void interactiveTwoSumDemo() {
        System.out.println("\n🎮 DEMO INTERATTIVO TWO SUM");
        System.out.println("Inserisci i numeri separati da virgola (es: 2,7,11,15):");

        // Esempi predefiniti per demo
        int[][] examples = {
                { 2, 7, 11, 15 },
                { 3, 3 },
                { 3, 2, 4 },
                { 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 7, 1, 1, 1, 1, 1 }
        };
        int[] targets = { 9, 6, 6, 11 };

        for (int i = 0; i < examples.length; i++) {
            System.out.println("\n📝 Esempio " + (i + 1) + ":");
            runTwoSumTest(examples[i], targets[i]);
        }
    }

    // Demo interattivo per Longest Substring

    public static void interactiveLongestSubstringDemo() {
        System.out.println("\n🎮 DEMO INTERATTIVO LONGEST SUBSTRING");
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
            System.out.println("\n📝 Esempio " + (i + 1) + ":");
            runLongestSubstringTest(examples[i]);
        }
    }

    // ==================== METODI DI UTILITÀ ====================

    // Confronta le performance tra soluzioni brute force e ottimizzate

    public static void comparePerformance() {
        System.out.println("\n⚡ CONFRONTO PERFORMANCE");
        System.out.println("=".repeat(50));

        // Test Two Sum
        System.out.println("\n🔢 TWO SUM Performance Test:");
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

        // Test Longest Substring
        System.out.println("\n🔤 LONGEST SUBSTRING Performance Test:");
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

        System.out.println("\n" + "=".repeat(50));
    }
}
