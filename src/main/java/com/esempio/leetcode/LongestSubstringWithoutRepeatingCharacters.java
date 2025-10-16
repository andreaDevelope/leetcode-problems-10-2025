package com.esempio.leetcode;

//Problem 3: Longest Substring Without Repeating Characters

public class LongestSubstringWithoutRepeatingCharacters {

    // Soluzione con Sliding Window - Complessità O(n)

    public static int lengthOfLongestSubstring(String s) {
        System.out.println("Soluzione Sliding Window O(n)");
        System.out.println("Stringa: \"" + s + "\"");

        if (s == null || s.length() == 0) {
            System.out.println("Stringa vuota o null");
            return 0;
        }

        int maxLength = 0;
        int left = 0;
        StringBuilder currentSubstring = new StringBuilder();

        System.out.println("\nProcesso caratteri:");

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            System.out.println("Carattere " + right + ": '" + currentChar + "'");

            // Se il carattere è già presente nella sottostringa corrente
            if (currentSubstring.indexOf(String.valueOf(currentChar)) != -1) {
                System.out.println("Carattere ripetuto trovato: '" + currentChar + "'");

                // Sposta il puntatore left fino a rimuovere il carattere duplicato
                while (left <= right && currentSubstring.indexOf(String.valueOf(currentChar)) != -1) {
                    char removedChar = currentSubstring.charAt(0);
                    currentSubstring.deleteCharAt(0);
                    left++;
                    System.out.println("Rimosso carattere: '" + removedChar + "', left = " + left);
                }
            }

            // Aggiungi il carattere corrente alla sottostringa
            currentSubstring.append(currentChar);
            System.out.println("Sottostringa corrente: \"" + currentSubstring + "\"");

            // Aggiorna la lunghezza massima
            if (currentSubstring.length() > maxLength) {
                maxLength = currentSubstring.length();
                System.out.println("Nuova lunghezza massima: " + maxLength);
            }
        }

        System.out.println("\nRisultato finale:");
        System.out.println("Lunghezza massima: " + maxLength);
        System.out.println("Sottostringa finale: \"" + currentSubstring + "\"");

        return maxLength;
    }

    // Soluzione Brute Force - Complessità O(n³)

    public static int lengthOfLongestSubstringBruteForce(String s) {
        System.out.println("Soluzione Brute Force O(n³)");
        System.out.println("Stringa: \"" + s + "\"");

        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        String longestSubstring = "";

        System.out.println("\nControllo tutte le sottostringhe:");

        // Controlla tutte le possibili sottostringhe
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                System.out.println("Sottostringa [" + i + "," + j + "): \"" + substring + "\"");

                // Verifica se la sottostringa ha caratteri unici
                if (hasUniqueCharacters(substring)) {
                    System.out.println("  Caratteri unici, lunghezza: " + substring.length());

                    if (substring.length() > maxLength) {
                        maxLength = substring.length();
                        longestSubstring = substring;
                        System.out.println("  Nuova sottostringa più lunga: \"" + longestSubstring + "\"");
                    }
                } else {
                    System.out.println("  Caratteri ripetuti");
                }
            }
        }

        System.out.println("\nRisultato finale:");
        System.out.println("Lunghezza massima: " + maxLength);
        System.out.println("Sottostringa più lunga: \"" + longestSubstring + "\"");

        return maxLength;
    }

    // Verifica se una stringa contiene solo caratteri unici

    private static boolean hasUniqueCharacters(String s) {
        boolean[] seen = new boolean[256]; // ASCII esteso

        for (char c : s.toCharArray()) {
            if (seen[c]) {
                return false;
            }
            seen[c] = true;
        }

        return true;
    }

    // test per confrontare le soluzioni

    public static void testSolutions(String s) {
        System.out.println("\n" + "=".repeat(80));
        System.out.println("TEST LONGEST SUBSTRING WITHOUT REPEATING CHARACTERS");
        System.out.println("Stringa: \"" + s + "\"");
        System.out.println("=".repeat(80));

        System.out.println("\n1️SLIDING WINDOW O(n):");
        int result1 = lengthOfLongestSubstring(s);

        System.out.println("\n2️BRUTE FORCE O(n³):");
        int result2 = lengthOfLongestSubstringBruteForce(s);

        // Verifica che i risultati siano uguali
        if (result1 == result2) {
            System.out.println("\nEntrambe le soluzioni producono lo stesso risultato: " + result1);
        } else {
            System.out.println("\nLe soluzioni producono risultati diversi!");
            System.out.println("   Sliding Window: " + result1);
            System.out.println("   Brute Force: " + result2);
        }

        System.out.println("\n" + "=".repeat(80));
    }
}
