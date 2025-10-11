package com.esempio;

//Classe di utilità per operazioni matematiche semplici.
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Non è possibile dividere per zero!");
        }
        return (double) a / b;
    }

    class Solution {
        int[] nums = { 2, 7, 11, 15 };

        public int[] twoSum(int[] nums, int target) {
            int[] y = new int[2];

            for (int i = 0; i < nums.length; i++) {

                for (int j = 1; j < nums.length - 1; j++) {
                    if (target - nums[i] == nums[j]) {
                        y[0] = i;
                        y[1] = j;
                        return y;
                    }
                }

            }
            return y;

        }
    }
}
