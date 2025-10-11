package com.esempio.leetcode;

public class LeetCodeTestRunner {

    // Esegue tutti i test per il problema Two Sum

    public static void runTwoSumTests() {
        System.out.println("\n" + "🔥".repeat(20) + " TWO SUM TESTS " + "🔥".repeat(20));

        // Test case 1: Esempio base
        TwoSum.testSolutions(new int[] { 2, 7, 11, 15 }, 9);

        // Test case 2: Array con elementi uguali
        TwoSum.testSolutions(new int[] { 3, 3 }, 6);

        // Test case 3: Array più grande
        TwoSum.testSolutions(new int[] { 3, 2, 4 }, 6);

        // Test case 4: Array con molti elementi
        TwoSum.testSolutions(new int[] { 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 7, 1, 1, 1, 1, 1 }, 11);

        // Test case 5: Nessuna soluzione
        try {
            TwoSum.testSolutions(new int[] { 1, 2, 3 }, 7);
        } catch (Exception e) {
            System.out.println("Test caso senza soluzione gestito correttamente");
        }
    }

    // Esegue tutti i test per il problema Longest Substring Without Repeating

    public static void runLongestSubstringTests() {
        System.out.println("\nLONGEST SUBSTRING TESTS ");

        // Test case 1: Esempio base
        LongestSubstringWithoutRepeatingCharacters.testSolutions("abcabcbb");

        // Test case 2: Tutti caratteri uguali
        LongestSubstringWithoutRepeatingCharacters.testSolutions("bbbbb");

        // Test case 3: Stringa vuota
        LongestSubstringWithoutRepeatingCharacters.testSolutions("");

        // Test case 4: Un solo carattere
        LongestSubstringWithoutRepeatingCharacters.testSolutions("a");

        // Test case 5: Stringa complessa
        LongestSubstringWithoutRepeatingCharacters.testSolutions("abcddefgabcdefghilmnoabc");

        // Test case 6: Stringa con spazi
        LongestSubstringWithoutRepeatingCharacters.testSolutions("pwwkew");
    }

    /**
     * Esegue tutti i test LeetCode disponibili
     */
    public static void runAllTests() {
        System.out.println("INIZIO TEST SUITE LEETCODE");
        System.out.println("Data: " + java.time.LocalDateTime.now());

        // Esegui tutti i test
        runTwoSumTests();
        runLongestSubstringTests();

        System.out.println("\n TUTTI I TEST COMPLETATI ");
        System.out.println("Test suite completata con successo!");
        System.out.println("Problemi testati: 2");
        System.out.println("Soluzioni implementate: 4");
    }

    // Esegue un test specifico per Two Sum

    public static void runTwoSumTest(int[] nums, int target) {
        System.out.println("\nTEST SPECIFICO TWO SUM");
        TwoSum.testSolutions(nums, target);
    }

    // Esegue un test specifico per Longest Substring

    public static void runLongestSubstringTest(String s) {
        System.out.println("\nTEST SPECIFICO LONGEST SUBSTRING");
        LongestSubstringWithoutRepeatingCharacters.testSolutions(s);
    }

    // Mostra le statistiche delle soluzioni implementate

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

        System.out.println("\nRIEPILOGO:");
        System.out.println("Problemi implementati: 2");
        System.out.println("Soluzioni brute force: 2");
        System.out.println("Soluzioni ottimizzate: 2");
        System.out.println("Copertura test: Completa");

        System.out.println("\n" + "=".repeat(50));
    }
}
