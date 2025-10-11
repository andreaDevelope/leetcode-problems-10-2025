package com.esempio.leetcode;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

//Test JUnit per i problemi LeetCode.

public class LeetCodeTest {

    @Before
    public void setUp() {
        // Setup iniziale se necessario
    }

    // ==================== TEST PER TWO SUM ====================

    @Test
    public void testTwoSumBruteForce_BasicCase() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] expected = { 0, 1 };
        int[] result = TwoSum.twoSumBruteForce(nums, target);
        assertArrayEquals("Test caso base per twoSumBruteForce", expected, result);
    }

    @Test
    public void testTwoSumBruteForce_SameElements() {
        int[] nums = { 3, 3 };
        int target = 6;
        int[] expected = { 0, 1 };
        int[] result = TwoSum.twoSumBruteForce(nums, target);
        assertArrayEquals("Test con elementi uguali", expected, result);
    }

    @Test
    public void testTwoSumBruteForce_LargerArray() {
        int[] nums = { 3, 2, 4 };
        int target = 6;
        int[] expected = { 1, 2 };
        int[] result = TwoSum.twoSumBruteForce(nums, target);
        assertArrayEquals("Test con array più grande", expected, result);
    }

    @Test
    public void testTwoSumBruteForce_ManyElements() {
        int[] nums = { 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 7, 1, 1, 1, 1, 1 };
        int target = 11;
        int[] expected = { 5, 11 };
        int[] result = TwoSum.twoSumBruteForce(nums, target);
        assertArrayEquals("Test con molti elementi", expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTwoSumBruteForce_NoSolution() {
        int[] nums = { 1, 2, 3 };
        int target = 7;
        TwoSum.twoSumBruteForce(nums, target);
    }

    @Test
    public void testTwoSumHashMap_BasicCase() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] expected = { 0, 1 };
        int[] result = TwoSum.twoSumHashMap(nums, target);
        assertArrayEquals("Test caso base per twoSumHashMap", expected, result);
    }

    @Test
    public void testTwoSumHashMap_SameElements() {
        int[] nums = { 3, 3 };
        int target = 6;
        int[] expected = { 0, 1 };
        int[] result = TwoSum.twoSumHashMap(nums, target);
        assertArrayEquals("Test con elementi uguali", expected, result);
    }

    @Test
    public void testTwoSumHashMap_LargerArray() {
        int[] nums = { 3, 2, 4 };
        int target = 6;
        int[] expected = { 1, 2 };
        int[] result = TwoSum.twoSumHashMap(nums, target);
        assertArrayEquals("Test con array più grande", expected, result);
    }

    @Test
    public void testTwoSumHashMap_ManyElements() {
        int[] nums = { 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 7, 1, 1, 1, 1, 1 };
        int target = 11;
        int[] expected = { 5, 11 };
        int[] result = TwoSum.twoSumHashMap(nums, target);
        assertArrayEquals("Test con molti elementi", expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTwoSumHashMap_NoSolution() {
        int[] nums = { 1, 2, 3 };
        int target = 7;
        TwoSum.twoSumHashMap(nums, target);
    }

    @Test
    public void testTwoSumSolutionsConsistency() {
        int[][] testCases = {
                { 2, 7, 11, 15 }, // target 9
                { 3, 3 }, // target 6
                { 3, 2, 4 }, // target 6
                { 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 7, 1, 1, 1, 1, 1 } // target 11
        };
        int[] targets = { 9, 6, 6, 11 };

        for (int i = 0; i < testCases.length; i++) {
            int[] nums = testCases[i];
            int target = targets[i];

            int[] resultBruteForce = TwoSum.twoSumBruteForce(nums, target);
            int[] resultHashMap = TwoSum.twoSumHashMap(nums, target);

            assertArrayEquals("Le soluzioni devono produrre lo stesso risultato per caso " + i,
                    resultBruteForce, resultHashMap);
        }
    }

    // ==================== TEST PER LONGEST SUBSTRING ====================

    @Test
    public void testLengthOfLongestSubstring_BasicCase() {
        String s = "abcabcbb";
        int expected = 3;
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals("Test caso base per lengthOfLongestSubstring", expected, result);
    }

    @Test
    public void testLengthOfLongestSubstring_AllSameCharacters() {
        String s = "bbbbb";
        int expected = 1;
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals("Test con tutti caratteri uguali", expected, result);
    }

    @Test
    public void testLengthOfLongestSubstring_EmptyString() {
        String s = "";
        int expected = 0;
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals("Test con stringa vuota", expected, result);
    }

    @Test
    public void testLengthOfLongestSubstring_SingleCharacter() {
        String s = "a";
        int expected = 1;
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals("Test con un solo carattere", expected, result);
    }

    @Test
    public void testLengthOfLongestSubstring_ComplexString() {
        String s = "abcddefgabcdefghilmnoabc";
        int expected = 13; // Corretto: la sottostringa più lunga è "abcdefghilmno" (13 caratteri)
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals("Test con stringa complessa", expected, result);
    }

    @Test
    public void testLengthOfLongestSubstring_WithSpaces() {
        String s = "pwwkew";
        int expected = 3;
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals("Test con spazi", expected, result);
    }

    @Test
    public void testLengthOfLongestSubstring_NullString() {
        String s = null;
        int expected = 0;
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals("Test con stringa null", expected, result);
    }

    @Test
    public void testLengthOfLongestSubstringBruteForce_BasicCase() {
        String s = "abcabcbb";
        int expected = 3;
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstringBruteForce(s);
        assertEquals("Test caso base per lengthOfLongestSubstringBruteForce", expected, result);
    }

    @Test
    public void testLengthOfLongestSubstringBruteForce_AllSameCharacters() {
        String s = "bbbbb";
        int expected = 1;
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstringBruteForce(s);
        assertEquals("Test con tutti caratteri uguali", expected, result);
    }

    @Test
    public void testLengthOfLongestSubstringBruteForce_EmptyString() {
        String s = "";
        int expected = 0;
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstringBruteForce(s);
        assertEquals("Test con stringa vuota", expected, result);
    }

    @Test
    public void testLengthOfLongestSubstringBruteForce_SingleCharacter() {
        String s = "a";
        int expected = 1;
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstringBruteForce(s);
        assertEquals("Test con un solo carattere", expected, result);
    }

    @Test
    public void testLengthOfLongestSubstringBruteForce_ComplexString() {
        String s = "abcddefgabcdefghilmnoabc";
        int expected = 13; // Corretto: la sottostringa più lunga è "abcdefghilmno" (13 caratteri)
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstringBruteForce(s);
        assertEquals("Test con stringa complessa", expected, result);
    }

    @Test
    public void testLengthOfLongestSubstringBruteForce_WithSpaces() {
        String s = "pwwkew";
        int expected = 3;
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstringBruteForce(s);
        assertEquals("Test con spazi", expected, result);
    }

    @Test
    public void testLengthOfLongestSubstringBruteForce_NullString() {
        String s = null;
        int expected = 0;
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstringBruteForce(s);
        assertEquals("Test con stringa null", expected, result);
    }

    @Test
    public void testLongestSubstringSolutionsConsistency() {
        String[] testCases = {
                "abcabcbb",
                "bbbbb",
                "",
                "a",
                "abcddefgabcdefghilmnoabc",
                "pwwkew",
                null
        };

        for (String s : testCases) {
            int resultSlidingWindow = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
            int resultBruteForce = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstringBruteForce(s);

            assertEquals("Le soluzioni devono produrre lo stesso risultato per: " + s,
                    resultSlidingWindow, resultBruteForce);
        }
    }

    // ==================== TEST PER EDGE CASES ====================

    @Test
    public void testTwoSum_EdgeCases() {
        // Test con array di un elemento
        try {
            TwoSum.twoSumBruteForce(new int[] { 5 }, 10);
            fail("Dovrebbe lanciare eccezione per array con un elemento");
        } catch (IllegalArgumentException e) {
            // Aspettato
        }

        // Test con array vuoto
        try {
            TwoSum.twoSumBruteForce(new int[] {}, 10);
            fail("Dovrebbe lanciare eccezione per array vuoto");
        } catch (IllegalArgumentException e) {
            // Aspettato
        }
    }

    @Test
    public void testLongestSubstring_EdgeCases() {
        // Test con stringa di un carattere
        assertEquals(1, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("z"));

        // Test con caratteri speciali
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("!@#"));

        // Test con numeri
        assertEquals(4, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("1234"));
    }

    // ==================== TEST PER PERFORMANCE (OPZIONALI) ====================

    @Test
    public void testTwoSum_PerformanceComparison() {
        // Test con array più grande per verificare che entrambe le soluzioni funzionino
        int[] largeArray = new int[1000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = i;
        }

        // Usiamo un target che ha sicuramente una soluzione: 0 + 999 = 999
        int[] resultBruteForce = TwoSum.twoSumBruteForce(largeArray, 999);
        int[] resultHashMap = TwoSum.twoSumHashMap(largeArray, 999);

        // Verifica che entrambe le soluzioni trovino una coppia valida
        assertTrue("La soluzione brute force deve trovare una coppia valida",
                resultBruteForce.length == 2);
        assertTrue("La soluzione HashMap deve trovare una coppia valida",
                resultHashMap.length == 2);

        // Verifica che entrambe le coppie sommino al target
        assertEquals("La coppia brute force deve sommare al target",
                999, largeArray[resultBruteForce[0]] + largeArray[resultBruteForce[1]]);
        assertEquals("La coppia HashMap deve sommare al target",
                999, largeArray[resultHashMap[0]] + largeArray[resultHashMap[1]]);
    }

    @Test
    public void testLongestSubstring_PerformanceComparison() {
        // Test con stringa più lunga
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append((char) ('a' + (i % 26)));
        }
        String longString = sb.toString();

        int resultSlidingWindow = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(longString);
        int resultBruteForce = LongestSubstringWithoutRepeatingCharacters
                .lengthOfLongestSubstringBruteForce(longString);

        assertEquals("Le soluzioni devono funzionare anche con stringhe lunghe",
                resultSlidingWindow, resultBruteForce);
    }

    @Test
    public void testPalindromeNumber_BasicCases() {
        assertTrue("121 dovrebbe essere palindromo", PalindromeNumber.isPalindrome(121));
        assertFalse("-121 non dovrebbe essere palindromo", PalindromeNumber.isPalindrome(-121));
        assertFalse("10 non dovrebbe essere palindromo", PalindromeNumber.isPalindrome(10));
        assertTrue("0 dovrebbe essere palindromo", PalindromeNumber.isPalindrome(0));
    }

    @Test
    public void testPalindromeNumber_LargerNumbers() {
        assertTrue("12321 dovrebbe essere palindromo", PalindromeNumber.isPalindrome(12321));
        assertFalse("12345 non dovrebbe essere palindromo", PalindromeNumber.isPalindrome(12345));
        assertTrue("1221 dovrebbe essere palindromo", PalindromeNumber.isPalindrome(1221));
        assertTrue("1 dovrebbe essere palindromo", PalindromeNumber.isPalindrome(1));
    }

    @Test
    public void testPalindromeNumber_EdgeCases() {
        assertTrue("11 dovrebbe essere palindromo", PalindromeNumber.isPalindrome(11));
        assertFalse("12 non dovrebbe essere palindromo", PalindromeNumber.isPalindrome(12));
        assertTrue("111 dovrebbe essere palindromo", PalindromeNumber.isPalindrome(111));
        assertFalse("112 non dovrebbe essere palindromo", PalindromeNumber.isPalindrome(112));
    }

    @Test
    public void testPalindromeNumber_NegativeNumbers() {
        assertFalse("-1 non dovrebbe essere palindromo", PalindromeNumber.isPalindrome(-1));
        assertFalse("-11 non dovrebbe essere palindromo", PalindromeNumber.isPalindrome(-11));
        assertFalse("-121 non dovrebbe essere palindromo", PalindromeNumber.isPalindrome(-121));
    }

    @Test
    public void testPalindromeNumber_ZeroAndSingleDigit() {
        assertTrue("0 dovrebbe essere palindromo", PalindromeNumber.isPalindrome(0));
        assertTrue("1 dovrebbe essere palindromo", PalindromeNumber.isPalindrome(1));
        assertTrue("2 dovrebbe essere palindromo", PalindromeNumber.isPalindrome(2));
        assertTrue("9 dovrebbe essere palindromo", PalindromeNumber.isPalindrome(9));
    }
}
