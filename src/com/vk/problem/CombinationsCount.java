package com.vk.problem;

public class CombinationsCount {

    private static int countCombinations(int total, int k) {
        int[][] dp = new int[k + 1][total + 1];

        // Base case: There is 1 way to make a sum of 0 using any number of elements.
        for (int i = 0; i <= k; i++) {
            dp[i][0] = 1;
        }

        // Fill the dp array iteratively
        for (int num = 1; num <= k; num++) {
            for (int sum = 1; sum <= total; sum++) {
                // Initialize dp[num][sum] to the number of ways without using the current number
                dp[num][sum] = dp[num - 1][sum];

                // If the current number is less than or equal to the current sum, add ways using the current number
                if (num <= sum) {
                    dp[num][sum] += dp[num][sum - num];
                }
            }
        }

        return dp[k][total];
    }

    public static int countCombinationsRecursive(int total, int k) {
        return backtrack(total, k, 1);
    }

    private static int backtrack(int total, int k, int start) {
        if (total == 0) {
            return 1;
        }

        int count = 0;
        for (int i = start; i <= k; i++) {
            if (total >= i) {
                count += backtrack(total - i, k, i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int total = 4; // Total sum
        int k = 2; // Numbers from 1 to k
        int combinations = countCombinations(total, k);
        System.out.println("Number of combinations: " + combinations);
    }
}


