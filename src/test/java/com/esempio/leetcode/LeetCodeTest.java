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

    // ==================== TEST PER PALINDROME NUMBER OPTIMIZED
    // ====================

    @Test
    public void testPalindromeNumber2_BasicCases() {
        assertTrue("121 dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(121));
        assertFalse("-121 non dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(-121));
        assertFalse("10 non dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(10));
        assertTrue("0 dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(0));
    }

    @Test
    public void testPalindromeNumber2_LargerNumbers() {
        assertTrue("12321 dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(12321));
        assertFalse("12345 non dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(12345));
        assertTrue("1221 dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(1221));
        assertTrue("1 dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(1));
    }

    @Test
    public void testPalindromeNumber2_EdgeCases() {
        assertTrue("11 dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(11));
        assertFalse("12 non dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(12));
        assertTrue("111 dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(111));
        assertFalse("112 non dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(112));
    }

    @Test
    public void testPalindromeNumber2_NegativeNumbers() {
        assertFalse("-1 non dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(-1));
        assertFalse("-11 non dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(-11));
        assertFalse("-121 non dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(-121));
    }

    @Test
    public void testPalindromeNumber2_ZeroAndSingleDigit() {
        assertTrue("0 dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(0));
        assertTrue("1 dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(1));
        assertTrue("2 dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(2));
        assertTrue("9 dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(9));
    }

    @Test
    public void testPalindromeNumberSolutionsConsistency() {
        int[] testCases = { 121, -121, 10, 0, 12321, 12345, 1221, 1, 11, 12, 111, 112, -1, -11, 2, 9 };

        for (int x : testCases) {
            boolean resultOriginal = PalindromeNumber.isPalindrome(x);
            boolean resultOptimized = PalindromeNumber.isPalindrome2(x);

            assertEquals("Le soluzioni devono produrre lo stesso risultato per: " + x,
                    resultOriginal, resultOptimized);
        }
    }

    @Test
    public void testPalindromeNumber2_LargeNumbers() {
        assertTrue("1234321 dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(1234321));
        assertFalse("1234567 non dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(1234567));
        assertTrue("1000001 dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(1000001));
        assertFalse("1000002 non dovrebbe essere palindromo", PalindromeNumber.isPalindrome2(1000002));
    }

    // ==================== TEST PER MAXIMUM SUBARRAY ====================

    @Test
    public void testMaxSubArray_BasicCase() {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int expected = 6;
        int result = MaximumSubarray.maxSubArray(nums);
        assertEquals("Test caso base per maxSubArray", expected, result);
    }

    @Test
    public void testMaxSubArray_SingleElement() {
        int[] nums = { 1 };
        int expected = 1;
        int result = MaximumSubarray.maxSubArray(nums);
        assertEquals("Test con un solo elemento", expected, result);
    }

    @Test
    public void testMaxSubArray_AllPositive() {
        int[] nums = { 5, 4, -1, 7, 8 };
        int expected = 23;
        int result = MaximumSubarray.maxSubArray(nums);
        assertEquals("Test con tutti numeri positivi", expected, result);
    }

    @Test
    public void testMaxSubArray_AllNegative() {
        int[] nums = { -5, -4, -1, -7, -8 };
        int expected = -1;
        int result = MaximumSubarray.maxSubArray(nums);
        assertEquals("Test con tutti numeri negativi", expected, result);
    }

    @Test
    public void testMaxSubArray_SingleNegative() {
        int[] nums = { -1 };
        int expected = -1;
        int result = MaximumSubarray.maxSubArray(nums);
        assertEquals("Test con un solo numero negativo", expected, result);
    }

    @Test
    public void testMaxSubArray_MixedNumbers() {
        int[] nums = { 1, -2, 3, -4, 5, -6, 7 };
        int expected = 7;
        int result = MaximumSubarray.maxSubArray(nums);
        assertEquals("Test con numeri misti", expected, result);
    }

    @Test
    public void testMaxSubArray_WithZero() {
        int[] nums = { 0, -1, 2, -3, 4 };
        int expected = 4;
        int result = MaximumSubarray.maxSubArray(nums);
        assertEquals("Test con zero", expected, result);
    }

    @Test
    public void testMaxSubArray_LargeArray() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int expected = 55;
        int result = MaximumSubarray.maxSubArray(nums);
        assertEquals("Test con array grande", expected, result);
    }

    @Test
    public void testMaxSubArrayBruteForce_BasicCase() {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int expected = 6;
        int result = MaximumSubarray.maxSubArrayBruteForce(nums);
        assertEquals("Test caso base per maxSubArrayBruteForce", expected, result);
    }

    @Test
    public void testMaxSubArrayBruteForce_SingleElement() {
        int[] nums = { 1 };
        int expected = 1;
        int result = MaximumSubarray.maxSubArrayBruteForce(nums);
        assertEquals("Test con un solo elemento", expected, result);
    }

    @Test
    public void testMaxSubArrayBruteForce_AllPositive() {
        int[] nums = { 5, 4, -1, 7, 8 };
        int expected = 23;
        int result = MaximumSubarray.maxSubArrayBruteForce(nums);
        assertEquals("Test con tutti numeri positivi", expected, result);
    }

    @Test
    public void testMaxSubArrayBruteForce_AllNegative() {
        int[] nums = { -5, -4, -1, -7, -8 };
        int expected = -1;
        int result = MaximumSubarray.maxSubArrayBruteForce(nums);
        assertEquals("Test con tutti numeri negativi", expected, result);
    }

    @Test
    public void testMaxSubArrayBruteForce_SingleNegative() {
        int[] nums = { -1 };
        int expected = -1;
        int result = MaximumSubarray.maxSubArrayBruteForce(nums);
        assertEquals("Test con un solo numero negativo", expected, result);
    }

    @Test
    public void testMaxSubArrayBruteForce_MixedNumbers() {
        int[] nums = { 1, -2, 3, -4, 5, -6, 7 };
        int expected = 7;
        int result = MaximumSubarray.maxSubArrayBruteForce(nums);
        assertEquals("Test con numeri misti", expected, result);
    }

    @Test
    public void testMaxSubArrayBruteForce_WithZero() {
        int[] nums = { 0, -1, 2, -3, 4 };
        int expected = 4;
        int result = MaximumSubarray.maxSubArrayBruteForce(nums);
        assertEquals("Test con zero", expected, result);
    }

    @Test
    public void testMaxSubArrayBruteForce_LargeArray() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int expected = 55;
        int result = MaximumSubarray.maxSubArrayBruteForce(nums);
        assertEquals("Test con array grande", expected, result);
    }

    @Test
    public void testMaximumSubarraySolutionsConsistency() {
        int[][] testCases = {
                { -2, 1, -3, 4, -1, 2, 1, -5, 4 },
                { 1 },
                { 5, 4, -1, 7, 8 },
                { -5, -4, -1, -7, -8 },
                { -1 },
                { 1, -2, 3, -4, 5, -6, 7 },
                { 0, -1, 2, -3, 4 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }
        };

        for (int[] nums : testCases) {
            int resultBruteForce = MaximumSubarray.maxSubArrayBruteForce(nums);
            int resultKadane = MaximumSubarray.maxSubArray(nums);

            assertEquals("Le soluzioni devono produrre lo stesso risultato per: " + java.util.Arrays.toString(nums),
                    resultBruteForce, resultKadane);
        }
    }

    @Test
    public void testMaxSubArray_EdgeCases() {
        assertEquals(0, MaximumSubarray.maxSubArray(new int[] { 0 }));
        assertEquals(-1, MaximumSubarray.maxSubArray(new int[] { -1, -2, -3 }));
        assertEquals(3, MaximumSubarray.maxSubArray(new int[] { 1, 2 }));
        assertEquals(1, MaximumSubarray.maxSubArray(new int[] { 1, -1, 1 }));
    }

    @Test
    public void testMaxSubArray_PerformanceComparison() {
        int[] largeArray = new int[1000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = (int) (Math.random() * 2000 - 1000);
        }

        int resultBruteForce = MaximumSubarray.maxSubArrayBruteForce(largeArray);
        int resultKadane = MaximumSubarray.maxSubArray(largeArray);

        assertEquals("Le soluzioni devono funzionare anche con array grandi", resultBruteForce, resultKadane);
    }
}
