package com.esempio.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//LeetCode Problem 1: Two Sum

// Soluzione Brute Force - Complessità O(n²)
public class TwoSum {
    public static int[] twoSumBruteForce(int[] nums, int target) {
        System.out.println("Soluzione Brute Force O(n²)");

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Controllando elemento " + i + " (valore: " + nums[i] + ")");

            for (int j = i + 1; j < nums.length; j++) {
                System.out.println("  ↳ Confrontando con elemento " + j + " (valore: " + nums[j] + ")");

                if (nums[i] + nums[j] == target) {
                    System.out.println("Trovata soluzione: " + nums[i] + " + " + nums[j] + " = " + target);
                    return new int[] { i, j };
                }
            }
        }

        throw new IllegalArgumentException("Nessuna soluzione trovata per target: " + target);
    }

    // Soluzione Ottimizzata con HashMap - Complessità O(n)
    public static int[] twoSumHashMap(int[] nums, int target) {
        System.out.println(" Soluzione Ottimizzata O(n) con HashMap");

        Map<Integer, Integer> valueToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            int complement = target - currentValue;

            System.out.println("🔍 Elemento " + i + ": " + currentValue + ", cerco complemento: " + complement);

            // Controlla se il complemento esiste nella mappa
            if (valueToIndex.containsKey(complement)) {
                int complementIndex = valueToIndex.get(complement);
                System.out.println("Trovata soluzione: " + currentValue + " + " + complement + " = " + target);
                System.out.println("Indici: [" + complementIndex + ", " + i + "]");
                return new int[] { complementIndex, i };
            }

            // Memorizza il valore corrente e il suo indice
            valueToIndex.put(currentValue, i);
            System.out.println("Memorizzato: " + currentValue + " -> indice " + i);
        }

        throw new IllegalArgumentException("Nessuna soluzione trovata per target: " + target);
    }

    // Metodo di test per confrontare le due soluzioni

    public static void testSolutions(int[] nums, int target) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("TEST TWO SUM");
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        System.out.println("=".repeat(60));

        try {
            // Test soluzione O(n²)
            System.out.println("\n1️ BRUTE FORCE O(n²):");
            int[] result1 = twoSumBruteForce(nums, target);
            System.out.println(" Risultato: " + Arrays.toString(result1));

            System.out.println("\n2️ HASHMAP O(n):");
            int[] result2 = twoSumHashMap(nums, target);
            System.out.println(" Risultato: " + Arrays.toString(result2));

            // Verifica che i risultati siano uguali
            if (Arrays.equals(result1, result2)) {
                System.out.println("\n Entrambe le soluzioni producono lo stesso risultato!");
            } else {
                System.out.println("\n Le soluzioni producono risultati diversi!");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("\n " + e.getMessage());
        }

        System.out.println("\n" + "=".repeat(60));
    }
}
